package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.utils.EcoreUtils
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class PackageInterfaceCompiler {
	
	@Inject extension JvmTypesBuilder jvmTypeBuilder
	@Inject extension EcoreUtils ecoreUtils
	@Inject extension NamingUtils namingUtils

	def compilePackageInterface(CompileTarget compileTarget, IJvmDeclaredTypeAcceptor acceptor, EPackage abstractSyntax, AlexRoot alexRoot, extension JvmTypeReferenceBuilder jvmTypeReferenceBuilder) {
		val packageInterfaceFQN = compileTarget.packageInterfaceFQN
		acceptor.accept(abstractSyntax.toInterface(packageInterfaceFQN, null)) [

			superTypes += EPackage.typeRef
			members += abstractSyntax.toField('eINSTANCE', packageInterfaceFQN.typeRef) [
				it.initializer = '''«compileTarget.packageImplName».init()'''
				it.visibility = JvmVisibility.DEFAULT
			]

			members += abstractSyntax.toField('eNS_URI', String.typeRef) [
				static = false
				visibility = JvmVisibility.DEFAULT
				it.initializer = '''"http://«compileTarget.name».«alexRoot.name».«abstractSyntax.name»/"'''
			]
			
			members += abstractSyntax.toField('eNAME', String.typeRef) [
				static = false
				visibility = JvmVisibility.DEFAULT
				it.initializer = '''"«compileTarget.name»"'''
			]
			
			
			members += abstractSyntax.toField('eNS_PREFIX', String.typeRef) [
				static = false
				visibility = JvmVisibility.DEFAULT
				it.initializer = '''"«compileTarget.name»"'''
			]
			
			

			var cptr = 0;
			for (EClass clazz : abstractSyntax.allClasses) {
				val s = cptr
				members += clazz.toField('''«clazz.name.normalizeUpperField»''', int.typeRef) [
					static = true
					visibility = JvmVisibility.PUBLIC
					it.initializer = '''«s»'''
				]
				cptr = cptr + 1;
			}
			
			it.members += abstractSyntax.toInterface('Literals') [
				members += abstractSyntax.allClasses.map[clazz|clazz.toField(clazz.name.toUpperCase, EClass.typeRef) [
					visibility = JvmVisibility.PUBLIC
					static = true
					initializer = '''eINSTANCE.get«clazz.name.toFirstUpper»()'''					
				]]
				
				members += abstractSyntax.allClasses.map[clazz | clazz.EReferences.map[field|
					field.toField(field.name.normalizeUpperField(clazz.name), EReference.typeRef()) [
						visibility = JvmVisibility.PUBLIC
						static = true
						initializer = '''eINSTANCE.get«field.name.normalizeUpperMethod(clazz.name)»()'''
					]
				]].flatten
				
				members += abstractSyntax.allClasses.map[clazz | clazz.EAttributes.map[field|
					field.toField(field.name.normalizeUpperField(clazz.name), EAttribute.typeRef()) [
						visibility = JvmVisibility.PUBLIC
						static = true
						initializer = '''eINSTANCE.get«field.name.normalizeUpperMethod(clazz.name)»()'''
					]
				]].flatten
			]
			
			members += abstractSyntax.allClasses.map[clazz|clazz.toGetter(clazz.name, EClass.typeRef) => [
				body = null as XExpression
				abstract = true
			]]
			
			members += abstractSyntax.allClasses.map[clazz | clazz.EReferences.map[field|
					field.toGetter(field.name.normalizeUpperMethod(clazz.name), EReference.typeRef()) => [
						body = null as XExpression
						abstract = true		
					]
				]].flatten
				
			members += abstractSyntax.allClasses.map[clazz | clazz.EAttributes.map[field|
				field.toGetter(field.name.normalizeUpperMethod(clazz.name), EAttribute.typeRef()) => [
					body = null as XExpression
					abstract = true		
				]
			]].flatten
			
			members += abstractSyntax.toField('''«compileTarget.name.toUpperCase»_FEATURE_COUNT''', int.typeRef) [
				visibility = JvmVisibility.DEFAULT
				initializer = '''0'''
			]
			
			members += abstractSyntax.allClasses.map[clazz|
				val ret = newArrayList
				var cptrI = 0
				for(EStructuralFeature esf: clazz.EAttributes) {
					val cptrIF = cptrI
					ret += esf.toField('''«esf.name.normalizeUpperField(clazz.name)»''', int.typeRef) [
						visibility = JvmVisibility.DEFAULT
						initializer = '''«compileTarget.name.toUpperCase»_FEATURE_COUNT + «cptrIF»'''
					]
					
					cptrI = cptrI + 1
				}
				
				for(EStructuralFeature esf: clazz.EReferences) {
					val cptrIF = cptrI
					ret += esf.toField('''«esf.name.normalizeUpperField(clazz.name)»''', int.typeRef) [
						visibility = JvmVisibility.DEFAULT
						initializer = '''«compileTarget.name.toUpperCase»_FEATURE_COUNT + «cptrIF»'''
					]
					
					cptrI = cptrI + 1
				}
				
				ret
			].flatten
		]
	}
}