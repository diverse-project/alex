package fr.inria.diverse.alex.xtext.utils

import fr.inria.diverse.alex.xtext.alex.AlexClass
import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import org.eclipse.emf.codegen.util.CodeGenUtil
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.EcoreUtil2

class NamingUtils {
	def String getRootName(AlexClass cls)
		'''«(cls.eContainer as AlexRoot).name»'''

	def String getRevisitorPackageFqn(EPackage pkg)
		'''«pkg?.name».revisitor'''

	def String getRevisitorInterfaceName(EPackage pkg)
		'''«pkg.name.toFirstUpper»Revisitor'''

	def String getRevisitorInterfaceFqn(EPackage pkg)
		'''«pkg.revisitorPackageFqn».«pkg.revisitorInterfaceName»'''

	def String getRevisitorInterfacePath(EPackage pkg)
		'''src/«pkg.name»/revisitor'''

	def String getRevisitorPackageFqn(AlexRoot root)
		'''«root.name».revisitor'''

	def String getRevisitorInterfaceName(AlexRoot root)
		'''«root.name.toFirstUpper»Revisitor'''

	def String getRevisitorInterfaceFqn(AlexRoot root)
		'''«root.revisitorPackageFqn».impl.«root.revisitorInterfaceName»'''

//	def String getRevisitorInterfacePath(AlexRoot root)
//		'''src/«root.name»/revisitor'''

	def String getOperationPackageFqn(AlexClass cls)
		'''«cls.rootName».revisitor.operations.«EcoreUtil2.getContainerOfType(cls, AlexRoot).name»'''

	def String getOperationInterfaceName(AlexClass alexCls)
		'''«alexCls.name»Operation'''

	def String getOperationInterfaceFqn(AlexClass alexCls)
		'''«alexCls.operationPackageFqn».«alexCls.operationInterfaceName»'''

//	def String getOperationInterfacePath(AlexClass cls)
//		'''src/«cls.rootName»/revisitor/operations'''

	def String getOperationImplPackageFqn(AlexClass cls)
		'''«cls.operationPackageFqn».impl'''

	def String getOperationImplName(AlexClass alexCls)
		'''«alexCls.operationInterfaceName»Impl'''

	def String getOperationImplFqn(AlexClass alexCls)
		'''«alexCls.operationImplPackageFqn».«alexCls.operationImplName»'''

//	def String getOperationImplPath(AlexClass cls)
//		'''src/«cls.rootName»/revisitor/operations/impl'''

	def String getTypeParamName(EClass cls)
		'''«cls.EPackage.name.replaceAll("\\.", "").toFirstUpper»__«cls.name»T'''

	def String getDenotationName(EClass cls)
		'''«cls.EPackage.name.toFirstLower»__«cls.name»'''
		
	def String getDenotationName(Pair<EClass, EClass> cls)
		'''«cls.key.denotationName»«IF cls.value !== null»__AS__«cls.value.denotationName»«ENDIF»'''

	def String getDenotationName(EClass parent, EClass child)
		'''«parent.denotationName»_«child.denotationName»'''

	def String getVarName(EClass cls)
		'''it'''
		
		
def String interfaceFQN(EClass clazz, CompileTarget compileTarget) {
		'''«compileTarget.basePackage».«clazz.name»'''
	}

	def String classFQN(EClass clazz, CompileTarget compileTarget) {
		'''«compileTarget.basePackage».impl.«clazz.name»Impl'''
	}

	def String basePackage(CompileTarget compileTarget) {
		'''«compileTarget.name»'''
	}

	def String factoryInterfaceName(CompileTarget compileTarget) {
		'''«compileTarget.basePackage».«compileTarget.name.toFirstUpper»Factory'''
	}
	
	def String factoryImplementationName(CompileTarget compileTarget) {
		'''«compileTarget.basePackage».impl.«compileTarget.name.toFirstUpper»FactoryImpl'''
	}

	def String packageInterfaceFQN(CompileTarget compileTarget) {
		'''«compileTarget.basePackage».«compileTarget.name.toFirstUpper»Package'''
	}

	def String packageClassFQN(CompileTarget compileTarget) {
		'''«compileTarget.basePackage».impl.«compileTarget.packageClassName»'''
	}

	def String packageClassName(CompileTarget abstractSyntax) {
		'''«abstractSyntax.name.toFirstUpper»PackageImpl'''
	}

	def String packageInterfaceName(CompileTarget abstractSyntax) {
		'''«abstractSyntax.name.toFirstUpper»Package'''
	}

	def String packageImplName(CompileTarget compileTarget) {
		'''«compileTarget.basePackage».impl.«compileTarget.name.toFirstUpper»PackageImpl'''
	}
	
	
	def String normalizeUpperField(String input, String className) {
		'''«CodeGenUtil.format(className, '_', '', false, false)»__«CodeGenUtil.format(input, '_', '', false, false)»'''.toString.toUpperCase
	}
	
	def String normalizeUpperMethod(String input, String className) {
		'''«CodeGenUtil.format(className, '_', '', false, false).toLowerCase.toFirstUpper»_«CodeGenUtil.format(input, '_', '', false, false).toLowerCase.toFirstUpper»'''
	}
}
	
