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
import org.eclipse.emf.ecore.impl.EPackageImpl
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class PackageImplementationCompiler {
	
	@Inject extension JvmTypesBuilder jvmTypesBuilder
	@Inject extension EcoreUtils ecoreUtils
	@Inject extension NamingUtils namingUtils
	
	def compilePackageImplementation(CompileTarget compileTarget, IJvmDeclaredTypeAcceptor acceptor, EPackage abstractSyntax, AlexRoot alexRoot, extension JvmTypeReferenceBuilder jvmTypeRefenceBuilder) {
		val packageImplFQN = compileTarget.packageClassFQN
		val packageInterfaceFQN = compileTarget.packageInterfaceFQN
		acceptor.accept(abstractSyntax.toClass(packageImplFQN)) [
			
			superTypes += EPackageImpl.typeRef
			superTypes += packageInterfaceFQN.typeRef

			// private static boolean isInited = false;
			members += abstractSyntax.toField('isInited', boolean.typeRef) [
				visibility = JvmVisibility.PRIVATE
				static = true
			]
			
			members += abstractSyntax.toField('isCreated', boolean.typeRef) [
				visibility = JvmVisibility.PRIVATE
				static = true
			]
			
			members += abstractSyntax.toField('isInitialized', boolean.typeRef) [
				visibility = JvmVisibility.PRIVATE
				static = true
			]

			members += abstractSyntax.toMethod('init', packageInterfaceFQN.typeRef) [
				static = true

				val packageInterfaceName = compileTarget.packageInterfaceName
				val packageClassFQN = compileTarget.packageClassFQN

				body = '''
					if (isInited)
						return («packageInterfaceFQN») «EPackage.typeRef».Registry.INSTANCE.getEPackage(«packageInterfaceFQN».eNS_URI);
					
					// Obtain or create and register package
					Object registered«packageInterfaceName» = EPackage.Registry.INSTANCE.get(eNS_URI);
					«packageClassFQN» the«packageInterfaceName» = registered«packageInterfaceName» instanceof «packageClassFQN»
							? («packageClassFQN») registered«packageInterfaceName»
							: new «packageClassFQN»();
					
					isInited = true;
					
					// Create package meta-data objects
					the«packageInterfaceName».createPackageContents();
					
					// Initialize created meta-data
					the«packageInterfaceName».initializePackageContents();
					
					// Mark meta-data to indicate it can't be changed
					the«packageInterfaceName».freeze();
					
					// Update the registry and return the package
					EPackage.Registry.INSTANCE.put(the«packageInterfaceName».eNS_URI, the«packageInterfaceName»);
					return the«packageInterfaceName»;
				'''
			]
			
			members += abstractSyntax.toMethod('createPackageContents', void.typeRef) [
				visibility = JvmVisibility.PUBLIC
				body = '''
				if(isCreated) return;
				isCreated = true;
				
				«FOR eClass: abstractSyntax.allClasses»
				«eClass.name.toFirstLower»EClass = createEClass(«eClass.name.normalizeUpperField»);
				«FOR eAttr: eClass.EAttributes»
				createEAttribute(«eClass.name.toFirstLower»EClass, «eAttr.name.normalizeUpperField(eClass.name)»);
				«ENDFOR»
				«FOR eAttr: eClass.EReferences»
				createEReference(«eClass.name.toFirstLower»EClass, «eAttr.name.normalizeUpperField(eClass.name)»);
				«ENDFOR»
				«ENDFOR»
				'''
			]
			
			members += abstractSyntax.toMethod('initializePackageContents', void.typeRef) [
				visibility = JvmVisibility.PUBLIC
				body = '''
				if (isInitialized)
					return;
				isInitialized = true;

				// Initialize package
				setName(eNAME);
				setNsPrefix(eNS_PREFIX);
				setNsURI(eNS_URI);

				// Create type parameters

				// Set bounds for type parameters

				// Add supertypes to classes
				«FOR eClass: abstractSyntax.allClasses»
				«FOR esp: eClass.ESuperTypes»
				«eClass.name.toFirstLower»EClass.getESuperTypes().add(this.get«esp.name»());
				«ENDFOR»
				«ENDFOR»

				// Initialize classes, features, and operations; add parameters
				«FOR eClass: abstractSyntax.allClasses»
				initEClass(«eClass.name.toFirstLower»EClass, «compileTarget.name».«eClass.name».class, "«eClass.name»", «IF eClass.isAbstract»«ELSE»!«ENDIF»IS_ABSTRACT, «IF eClass.isInterface»«ELSE»!«ENDIF»IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
				«FOR eAttr: eClass.EAttributes»
				initEAttribute(get«eAttr.name.normalizeUpperMethod(eClass.name)»(), ecorePackage.get«eAttr.EType.name»(), "«eAttr.name»", null, «eAttr.lowerBound», «eAttr.upperBound», «compileTarget.name».«eClass.name».class, «IF eAttr.isTransient»«ELSE»!«ENDIF»IS_TRANSIENT,«IF eAttr.volatile»«ELSE»!«ENDIF»IS_VOLATILE, «IF eAttr.changeable»«ELSE»!«ENDIF»IS_CHANGEABLE, «IF eAttr.unsettable»«ELSE»!«ENDIF»IS_UNSETTABLE, «IF eAttr.isID»«ELSE»!«ENDIF»IS_ID, «IF eAttr.isUnique»«ELSE»!«ENDIF»IS_UNIQUE, «IF eAttr.isDerived»«ELSE»!«ENDIF»IS_DERIVED, «IF eAttr.isOrdered»«ELSE»!«ENDIF»IS_ORDERED);				
				«ENDFOR»
				«FOR eAttr: eClass.EReferences»
				initEReference(get«eAttr.name.normalizeUpperMethod(eClass.name)»(), this.get«eAttr.EType.name»(), null, "«eAttr.name»", null, «eAttr.lowerBound», «eAttr.upperBound», «compileTarget.name».«eClass.name».class, «IF eAttr.isTransient»«ELSE»!«ENDIF»IS_TRANSIENT, «IF eAttr.isVolatile»«ELSE»!«ENDIF»IS_VOLATILE, «IF eAttr.isChangeable»«ELSE»!«ENDIF»IS_CHANGEABLE, IS_COMPOSITE, «IF eAttr.isResolveProxies»«ELSE»!«ENDIF»IS_RESOLVE_PROXIES, «IF eAttr.isUnsettable»«ELSE»!«ENDIF»IS_UNSETTABLE, «IF eAttr.isUnique»«ELSE»!«ENDIF»IS_UNIQUE, «IF eAttr.isDerived»«ELSE»!«ENDIF»IS_DERIVED, «IF eAttr.isOrdered»«ELSE»!«ENDIF»IS_ORDERED);				
				«ENDFOR»
				«ENDFOR»
				// Create resource
				createResource(eNS_URI);
				'''
			]
			
			members += abstractSyntax.allClasses.map[clazz|clazz.toField('''«clazz.name.toFirstLower»EClass''', EClass.typeRef) [
				visibility = JvmVisibility.PRIVATE
				initializer = '''null'''
			]]
			
			members += abstractSyntax.allClasses.map[clazz|clazz.toGetter(clazz.name, EClass.typeRef) => [
				body = '''return «clazz.name.toFirstLower»EClass;'''
			]]
			
			
			members += abstractSyntax.allClasses.map[clazz | 
				var cptrI = 0
				var ret = newArrayList
				
				for(field: clazz.EAttributes) {
					val cptrIF = cptrI
					val rt = if(field instanceof EReference) EReference.typeRef else EAttribute.typeRef
					ret += field.toGetter(field.name.normalizeUpperMethod(clazz.name), rt) => [
						body = '''return «IF (field instanceof EReference)»(«EReference.typeRef»)«ELSE»(«EAttribute.typeRef»)«ENDIF» «clazz.name.toFirstLower»EClass.getEStructuralFeatures().get(«cptrIF»);'''
					]
					
					cptrI = cptrI + 1
				}
				for(field: clazz.EReferences) {
					val cptrIF = cptrI
					val rt = if(field instanceof EReference) EReference.typeRef else EAttribute.typeRef
					ret += field.toGetter(field.name.normalizeUpperMethod(clazz.name), rt) => [
						body = '''return «IF (field instanceof EReference)»(«EReference.typeRef»)«ELSE»(«EAttribute.typeRef»)«ENDIF» «clazz.name.toFirstLower»EClass.getEStructuralFeatures().get(«cptrIF»);'''
					]
					
					cptrI = cptrI + 1
				}
				ret
			].flatten
			
			members += abstractSyntax.toConstructor[
				visibility = JvmVisibility.PRIVATE
				body = '''super(eNS_URI, «compileTarget.factoryInterfaceName».eINSTANCE);'''
			]
		]
	}
}