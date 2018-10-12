package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexMethod
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.alex.DefMethod
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

class CompilerUtils {

	@Inject extension NamingUtils
	//@Inject extension JvmTypeReferenceBuilder

	def isDispatch(AlexMethod method) {
		method instanceof DefMethod && (method as DefMethod).dispatch
	}

	def dispatch scopedTypeRef(EDataType edt, CompileTarget compileTarget, EPackage abstractSyntax, boolean toUpper, extension JvmTypeReferenceBuilder j) {
		if(toUpper) edt.instanceTypeName.typeRef else edt.instanceTypeName.typeRef
	}

	def dispatch scopedTypeRef(EClass clazz, CompileTarget compileTarget, EPackage abstractSyntax, boolean toUpper, extension JvmTypeReferenceBuilder j) {
		clazz.classFQN(compileTarget).typeRef
	}

	def dispatch scopedInterfaceTypeRef(EDataType edt, CompileTarget compileTarget, EPackage abstractSyntax, extension JvmTypeReferenceBuilder j) {
		edt.instanceTypeName.typeRef
	}

	def dispatch scopedInterfaceTypeRef(EClass clazz, CompileTarget compileTarget, EPackage abstractSyntax, extension JvmTypeReferenceBuilder j) {
		clazz.interfaceFQN(compileTarget).typeRef
	}
}
