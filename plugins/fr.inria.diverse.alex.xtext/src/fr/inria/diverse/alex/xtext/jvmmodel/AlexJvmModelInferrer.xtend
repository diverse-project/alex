package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.utils.AlexUtils
import fr.inria.diverse.alex.xtext.utils.EcoreUtils
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor

class AlexJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension EcoreUtils ecoreUtils
	@Inject extension AlexUtils alexUtils

	@Inject extension FactoryInterfaceCompiler factoryInterfaceCompiler
	@Inject extension FactoryImplementationCompiler factoryImplementationCompiler
	@Inject extension PackageInterfaceCompiler packageInterfaceCompiler
	@Inject extension PackageImplementationCompiler packageImplementationCompiler
	@Inject extension EClassInterfaceCompiler eClassInterfaceCompiler
	@Inject extension EClassImplementationCompiler eClassImplementationCompiler

	def dispatch void infer(AlexRoot alexRoot, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		alexRoot.compileTarget.compile(alexRoot, acceptor)
	}

	def compile(CompileTarget compileTarget, AlexRoot alexRoot, IJvmDeclaredTypeAcceptor acceptor) {
		val abstractSyntax = alexRoot.ecoreImport.uri.loadGenmodel.EPackage

		compileTarget.compileFactoryInterface(acceptor, abstractSyntax, _typeReferenceBuilder)
		compileTarget.compilePackageInterface(acceptor, abstractSyntax, alexRoot, _typeReferenceBuilder)
		for (EClass clazz : abstractSyntax.allClasses) {
			val alexClass = alexRoot.allAlexClasses.filter[alexClass|alexClass.name == clazz.name].head
			clazz.compileEClassInterface(acceptor, compileTarget, abstractSyntax, alexClass, _typeReferenceBuilder)
		}

		compileTarget.compileFactoryImplementation(acceptor, abstractSyntax, _typeReferenceBuilder)
		compileTarget.compilePackageImplementation(acceptor, abstractSyntax, alexRoot, _typeReferenceBuilder)

		for (EClass clazz : abstractSyntax.allClasses) {
			val alexClass = alexRoot.allAlexClasses.filter[alexClass|alexClass.name == clazz.name].head
			clazz.compileEClassImplementation(acceptor, compileTarget, abstractSyntax, alexClass,
				_annotationTypesBuilder, _typeReferenceBuilder)
		}

	}

}
