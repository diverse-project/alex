package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexClass
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class EClassInterfaceCompiler {
	
	@Inject extension JvmTypesBuilder jvmTypesBuilder
	@Inject extension NamingUtils namingUtils
	@Inject extension CompilerUtils compilerUtils

	def compileEClassInterface(EClass clazz, IJvmDeclaredTypeAcceptor acceptor, CompileTarget compileTarget, EPackage abstractSyntax, AlexClass alexClass, extension JvmTypeReferenceBuilder jvmTypeRefenceBuilder) {
		val interfaceName = clazz.interfaceFQN(compileTarget)
		acceptor.accept(clazz.toInterface(interfaceName, null)) [
				superTypes += EObject.typeRef
				superTypes += clazz.ESuperTypes.map [
					interfaceFQN(compileTarget).typeRef
				]
				
				if(compileTarget.isTruffle) {
					superTypes += 'com.oracle.truffle.api.nodes.NodeInterface'.typeRef
				}

				clazz.EAttributes.forEach [ field |
					// EDataType
					val type = field.EType.scopedInterfaceTypeRef(compileTarget, abstractSyntax, jvmTypeRefenceBuilder)
					members += field.toSetter(field.name, type) => [
						body = null as XExpression
						abstract = true
					]
					members += field.toGetter(field.name, type) => [
						body = null as XExpression
						abstract = true
					]
				]
				
				clazz.EReferences.forEach [ field |
					val rt = field.EGenericType.ERawType.scopedInterfaceTypeRef(compileTarget, abstractSyntax, jvmTypeRefenceBuilder)
					val isMultiple = field.upperBound > 1 || field.upperBound < 0
					val type = if(isMultiple) EList.typeRef(rt) else rt
					
					if(!isMultiple) {
						members += field.toSetter(field.name, type) => [
							body = null as XExpression
							abstract = true
						]
					}
					members += field.toGetter(field.name, type) => [
						body = null as XExpression
						abstract = true
					]
				]
				
				members += alexClass?.methods
					// hide the dispatch operations from the public interface
					?.filter[!it.dispatch]
					?.map[method | method.toMethod('''«method.name»''', method.type) [
						parameters += method.params.map[cloneWithProxies]
						body = null as XExpression
						abstract = true
					]]
			]
	}
}