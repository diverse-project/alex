package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.utils.EcoreUtils
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.impl.EFactoryImpl
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class FactoryImplementationCompiler {
	@Inject extension JvmTypesBuilder jvmTypeBuilder
	@Inject extension EcoreUtils ecoreUtils
	@Inject extension NamingUtils namingUtils

	def compileFactoryImplementation(CompileTarget compileTarget, IJvmDeclaredTypeAcceptor acceptor,
		EPackage abstractSyntax, extension JvmTypeReferenceBuilder jvmTypeReferenceBuilder) {
		acceptor.accept(abstractSyntax.toClass(compileTarget.factoryImplementationName)) [

			superTypes += EFactoryImpl.typeRef
			superTypes += compileTarget.factoryInterfaceName.typeRef

			members += abstractSyntax.toConstructor [
				visibility = JvmVisibility.PRIVATE
				body = '''super();'''
			]

			members += abstractSyntax.toMethod('init', compileTarget.factoryInterfaceName.typeRef) [
				visibility = JvmVisibility.PUBLIC
				static = true
				val ctn = compileTarget.name
				val ctnf = '''«ctn.toFirstUpper»Factory'''
				body = '''
					try {
						«ctnf» the«ctnf» = («ctnf») «EPackage.typeRef».Registry.INSTANCE.getEFactory(«compileTarget.packageInterfaceFQN».eNS_URI);
						if (the«ctnf» != null) {
							return the«ctnf»;
						}
					} catch (Exception exception) {
						«EcorePlugin.typeRef».INSTANCE.log(exception);
					}
					return new «ctnf»Impl();
				'''
			]

			members += abstractSyntax.toMethod('create', EObject.typeRef) [
				parameters += abstractSyntax.toParameter('eClass', EClass.typeRef)
				visibility = JvmVisibility.PUBLIC
				body = '''
					switch (eClass.getClassifierID()) {
					«FOR eClass : abstractSyntax.allClasses.filter[!it.abstract]»
						case «compileTarget.packageInterfaceFQN.typeRef».«eClass.name.normalizeUpperField»:
							return create«eClass.name»();
					«ENDFOR»
					default:
						throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
					}
				'''
			]

			members += abstractSyntax.allClasses.filter[!it.abstract].map [ eClass |
				eClass.toMethod('''create«eClass.name»''', '''«compileTarget.name».«eClass.name»'''.toString.typeRef) [
					body = '''
						«compileTarget.name».impl.«eClass.name»Impl ret = new «compileTarget.name».impl.«eClass.name»Impl();
						return ret;
					'''
				]

			]
		]
	}
}
