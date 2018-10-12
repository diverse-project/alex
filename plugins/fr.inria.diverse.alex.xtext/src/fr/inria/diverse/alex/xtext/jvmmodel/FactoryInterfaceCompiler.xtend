package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.utils.EcoreUtils
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class FactoryInterfaceCompiler {

	@Inject extension JvmTypesBuilder jvmTypeBuilder
	@Inject extension EcoreUtils ecoreUtils
	@Inject extension NamingUtils namingUtils

	def compileFactoryInterface(CompileTarget compileTarget, IJvmDeclaredTypeAcceptor acceptor, EPackage abstractSyntax,
		extension JvmTypeReferenceBuilder jvmTypeReferenceBuilder) {
		acceptor.accept(abstractSyntax.toInterface(compileTarget.factoryInterfaceName, null)) [
			superTypes += EFactory.typeRef
			members += abstractSyntax.toField('eINSTANCE', compileTarget.factoryInterfaceName.typeRef) [
				visibility = JvmVisibility.DEFAULT
				initializer = '''«compileTarget.factoryImplementationName».init()'''
			]

			members += abstractSyntax.allClasses.filter[!it.abstract].map [ clazz |
				clazz.toMethod('''create«clazz.name»''', clazz.interfaceFQN(compileTarget).typeRef) [
					body = null as XExpression
					abstract = true
				]
			]
		]

	}
}
