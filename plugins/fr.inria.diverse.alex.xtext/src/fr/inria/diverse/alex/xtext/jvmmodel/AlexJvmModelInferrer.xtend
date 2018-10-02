package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.emf.truffle.MinimalTruffleEObjectImpl
import fr.inria.diverse.alex.xtext.alex.AlexClass
import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.alex.ConcreteMethod
import fr.inria.diverse.alex.xtext.utils.AlexUtils
import fr.inria.diverse.alex.xtext.utils.EcoreUtils
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.impl.EFactoryImpl
import org.eclipse.emf.ecore.impl.EPackageImpl
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class AlexJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension EcoreUtils
	@Inject extension NamingUtils
	@Inject extension AlexUtils

	override infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if (!preIndexingPhase) {
			val alexRoot = e as AlexRoot
			alexRoot.compileTarget.compile(alexRoot, acceptor)
		}
	}

/**
 * FIXME change generation order to have first the interfaces and the the implementations, should resolve some odd generation issues !
 */
	def compile(CompileTarget compileTarget, AlexRoot alexRoot, IJvmDeclaredTypeAcceptor acceptor) {
		val abstractSyntax = alexRoot.ecoreImport.uri.loadGenmodel.EPackage

		compileTarget.compileFactoryInterface(acceptor, abstractSyntax)
		compileTarget.compilePackageInterface(acceptor, abstractSyntax, alexRoot)
		abstractSyntax.allClasses.forEach [ clazz |
			val alexClass = alexRoot.allAlexClasses.filter[alexClass | alexClass.name == clazz.name].head
			clazz.compileEClassInterface(acceptor, compileTarget, abstractSyntax, alexClass)
		]
		
		compileTarget.compileFactoryImplementation(acceptor, abstractSyntax)
		compileTarget.compilePackageImplementation(acceptor, abstractSyntax, alexRoot)

		abstractSyntax.allClasses.forEach [ clazz |
			val alexClass = alexRoot.allAlexClasses.filter[alexClass | alexClass.name == clazz.name].head
			clazz.compileEClassImplementation(acceptor, compileTarget, abstractSyntax, alexClass)
		]
		
//		acceptor.accept(compileTarget.toClass('''«compileTarget.name».impl.«compileTarget.name.toFirstUpper»Language''')) [clazz|
//			clazz.superTypes += TruffleLanguage.typeRef(Void.typeRef)
//			
////			annotations += 'com.oracle.truffle.api.nodes.NodeInfo'.annotationRef => [annot|
////					annot.explicitValues += TypesFactory::eINSTANCE.createJvmStringAnnotationValue => [
////						values += clazz.name
////						val tmp = annot.annotation.members.filter(JvmOperation).filter[simpleName == "description"].head
////						operation = tmp
////					]
////				]
//			
//			clazz.annotations += 'com.oracle.truffle.api.TruffleLanguage$Registration'.annotationRef => [annot|
//				annot.explicitValues += TypesFactory::eINSTANCE.createJvmStringAnnotationValue => [
//					values += compileTarget.name
//					operation = annot.annotation.members.filter(JvmOperation).filter[simpleName == "id"].head
//				]
//				
//				annot.explicitValues += TypesFactory::eINSTANCE.createJvmStringAnnotationValue => [
//					values += compileTarget.name
//					operation = annot.annotation.members.filter(JvmOperation).filter[simpleName == "name"].head
//				]
//				
//				annot.explicitValues += TypesFactory::eINSTANCE.createJvmStringAnnotationValue => [
//					values += '''application/«compileTarget.name»'''
//					operation = annot.annotation.members.filter(JvmOperation).filter[simpleName == "defaultMimeType"].head
//				]
//				
//				annot.explicitValues += TypesFactory::eINSTANCE.createJvmStringAnnotationValue => [
//					values += '''application/«compileTarget.name»'''
//					operation = annot.annotation.members.filter(JvmOperation).filter[simpleName == "characterMimeTypes"].head
//				]
//				
////				annot.explicitValues += TypesFactory::eINSTANCE.createJvm => [
////					values += '''com.oracle.truffle.api.TruffleLanguage.ContextPolicy.SHARED'''.typeRef
////					operation = annot.annotation.members.filter(JvmOperation).filter[simpleName == "contextPolicy"].head
////				]
//			] 
//			
//			clazz.members += compileTarget.toMethod('createContext', Void.typeRef) [
//				parameters += compileTarget.toParameter('env', Env.typeRef)
//				body = '''return null;'''
//			]
//			
//			clazz.members += compileTarget.toMethod('isObjectOfLanguage', boolean.typeRef) [
//				parameters += compileTarget.toParameter('object', Object.typeRef)
//				body = '''
//				if(object instanceof «EObject.typeRef») {
//					«EObject.typeRef» eObject = («EObject.typeRef») object;
//					return "http://«compileTarget.name».«alexRoot.name».«abstractSyntax.name»".equals(eObject.eClass().getEPackage().getNsURI());
//				}
//				
//				return false;
//				'''
//			]
//			
//			/*
//			 * import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.xtext.resource.XtextResourceSet;
//
//import com.oracle.truffle.api.CallTarget;
//import com.oracle.truffle.api.TruffleLanguage;
//
//import compilA.Expression;
//			 */
//			// protected CallTarget parse(ParsingRequest request) throws Exception {
//			
//			val rootEClass = abstractSyntax.allClasses.head
//			
//			clazz.members +=compileTarget.toMethod('parse', 'com.oracle.truffle.api.CallTarget'.typeRef) [
//				parameters += compileTarget.toParameter('request', 'com.oracle.truffle.api.TruffleLanguage.ParsingRequest'.typeRef)
//				exceptions += Exception.typeRef
//				body = '''
//				final «XtextResourceSet.typeRef» rs = new «XtextResourceSet.typeRef»();
//				final «Resource.typeRef» resource = rs.createResource(«URI.typeRef()».createURI("dummy:/truffle.«compileTarget.name»"));
//				final «InputStream.typeRef» in = request.getSource().getInputStream();
//				resource.load(in, rs.getLoadOptions());
//				final «compileTarget.name».«rootEClass.name» model = («compileTarget.name».«rootEClass.name») resource.getContents().get(0);
//
//				return new CallTarget() {
//					@Override
//					public Object call(Object... arguments) {
//						return model.main(); // by convension
//					}
//				};
//				'''
//			] 
//			
//			
//		]
	}
	
	def compileFactoryInterface(CompileTarget compileTarget, IJvmDeclaredTypeAcceptor acceptor, EPackage abstractSyntax) {
		acceptor.accept(abstractSyntax.toInterface(compileTarget.factoryInterfaceName, [
			
			superTypes += EFactory.typeRef
			members += abstractSyntax.toField('eINSTANCE', compileTarget.factoryInterfaceName.typeRef) [
				visibility = JvmVisibility.DEFAULT
				initializer = '''«compileTarget.factoryImplementationName».init()'''
			]
		]))
		
	}
	
	def compileFactoryImplementation(CompileTarget compileTarget, IJvmDeclaredTypeAcceptor acceptor, EPackage abstractSyntax) {
		acceptor.accept(abstractSyntax.toClass(compileTarget.factoryImplementationName) [
			
			superTypes += EFactoryImpl.typeRef
			superTypes += compileTarget.factoryInterfaceName.typeRef
			
			members += abstractSyntax.toConstructor[
				visibility = JvmVisibility.PRIVATE
				body = '''super();'''
			]
			
			members += abstractSyntax.toMethod('init',compileTarget.factoryInterfaceName.typeRef) [
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
				«FOR eClass: abstractSyntax.allClasses.filter[!it.abstract]»
				case «compileTarget.packageInterfaceFQN.typeRef».«eClass.name.toUpperCase»:
					return create«eClass.name»();
				«ENDFOR»
				default:
					throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
				}
				'''
			]
			
			
			members += abstractSyntax.allClasses.filter[!it.abstract].map[eClass|
				eClass.toMethod('''create«eClass.name»''', '''«compileTarget.name».«eClass.name»'''.toString.typeRef) [
					body = '''
					«compileTarget.name».impl.«eClass.name»Impl ret = new «compileTarget.name».impl.«eClass.name»Impl();
					return ret;
					'''
				]
				
			]
		])
	}
	
	def compilePackageInterface(CompileTarget compileTarget, IJvmDeclaredTypeAcceptor acceptor, EPackage abstractSyntax, AlexRoot alexRoot) {
		val packageInterfaceFQN = compileTarget.packageInterfaceFQN
		acceptor.accept(abstractSyntax.toInterface(packageInterfaceFQN, [

			superTypes += EPackage.typeRef
			members += abstractSyntax.toField('eINSTANCE', packageInterfaceFQN.typeRef) [
				it.initializer = '''«compileTarget.packageImplName».init()'''
				it.visibility = JvmVisibility.DEFAULT
			]

			// String eNS_URI = "http://www.example.org/mod";
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
				members += clazz.toField('''«clazz.name.toUpperCase»''', int.typeRef) [
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
				
			members += abstractSyntax.allClasses.map[clazz | clazz.EAllAttributes.map[field|
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
				for(EStructuralFeature esf: clazz.EStructuralFeatures) {
					val cptrIF = cptrI
					ret += esf.toField('''«esf.name.normalizeUpperField(clazz.name)»''', int.typeRef) [
						visibility = JvmVisibility.DEFAULT
						initializer = '''«compileTarget.name.toUpperCase»_FEATURE_COUNT + «cptrIF»'''
					]
					
					cptrI = cptrI + 1
				}
				
				ret
			].flatten
		]))
	}
	
	def compilePackageImplementation(CompileTarget compileTarget, IJvmDeclaredTypeAcceptor acceptor, EPackage abstractSyntax, AlexRoot alexRoot) {
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
				«eClass.name.toFirstLower»EClass = createEClass(«eClass.name.toUpperCase»);
				«FOR eAttr: eClass.EAllAttributes»
				createEAttribute(«eClass.name.toFirstLower»EClass, «eAttr.name.normalizeUpperField(eClass.name)»);
				«ENDFOR»
				«FOR eAttr: eClass.EAllReferences»
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
				«FOR eAttr: eClass.EAllAttributes»
				initEAttribute(get«eAttr.name.normalizeUpperMethod(eClass.name)»(), ecorePackage.get«eAttr.EType.name»(), "«eAttr.name»", null, «eAttr.lowerBound», «eAttr.upperBound», «compileTarget.name».«eClass.name».class, «IF eAttr.isTransient»«ELSE»!«ENDIF»IS_TRANSIENT,«IF eAttr.volatile»«ELSE»!«ENDIF»IS_VOLATILE, «IF eAttr.changeable»«ELSE»!«ENDIF»IS_CHANGEABLE, «IF eAttr.unsettable»«ELSE»!«ENDIF»IS_UNSETTABLE, «IF eAttr.isID»«ELSE»!«ENDIF»IS_ID, «IF eAttr.isUnique»«ELSE»!«ENDIF»IS_UNIQUE, «IF eAttr.isDerived»«ELSE»!«ENDIF»IS_DERIVED, «IF eAttr.isOrdered»«ELSE»!«ENDIF»IS_ORDERED);				
				«ENDFOR»
				«FOR eAttr: eClass.EAllReferences»
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
				
				for(field: clazz.EStructuralFeatures) {
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
	
	def compileEClassInterface(EClass clazz, IJvmDeclaredTypeAcceptor acceptor, CompileTarget compileTarget, EPackage abstractSyntax, AlexClass alexClass) {
		val interfaceName = clazz.interfaceFQN(compileTarget)
		acceptor.accept(clazz.toInterface(interfaceName) [
				superTypes += EObject.typeRef
				superTypes += clazz.ESuperTypes.map [
					interfaceFQN(compileTarget).typeRef
				]

				clazz.EAllStructuralFeatures.forEach [ field |
					if (field instanceof EAttribute) {
						// EDataType
						val type = field.EType.scopedTypeRef(compileTarget, abstractSyntax, false)
						members += field.toSetter(field.name, type) => [
							body = null as XExpression
							abstract = true
						]
						members += field.toGetter(field.name, type) => [
							body = null as XExpression
							abstract = true
						]
					} else if (field instanceof EReference) {
						val rt = field.EGenericType.ERawType.scopedTypeRef(compileTarget, abstractSyntax, false)
						val type = if(field.upperBound > 1) EList.typeRef(rt) else rt
						members += field.toSetter(field.name, type) => [
							body = null as XExpression
							abstract = true
						]
						members += field.toGetter(field.name, type) => [
							body = null as XExpression
							abstract = true
						]
					} else {
						println(field)
					}
				]
				
				members += alexClass.methods.map[method | method.toMethod('''«method.name»''', method.type) [
					body = null as XExpression
					abstract = true
				]]
			])
	}
	
	def compileEClassImplementation(EClass clazz, IJvmDeclaredTypeAcceptor acceptor, CompileTarget compileTarget, EPackage abstractSyntax, AlexClass alexClass) {
		val interfaceName = clazz.interfaceFQN(compileTarget)
		
		acceptor.accept(clazz.toClass(clazz.classFQN(compileTarget))) [createdClass|
			
			if(compileTarget.isTruffle) {
				createdClass.annotations += 'com.oracle.truffle.api.nodes.NodeInfo'.annotationRef => [annot|
					annot.explicitValues += TypesFactory::eINSTANCE.createJvmStringAnnotationValue => [
						values += clazz.name
						val tmp = annot.annotation.members.filter(JvmOperation).filter[simpleName == "description"].head
						operation = tmp
					]
				]
			}
			
			createdClass.abstract = clazz.abstract

			if (!clazz.ESuperTypes.empty)
				createdClass.superTypes += clazz.ESuperTypes.head.scopedTypeRef(compileTarget, abstractSyntax, false)
			else {
				//extendedClass = 'fr.inria.diverse.alex.emf.truffle.MinimalTruffleEObjectImpl$TruffleContainer'.typeRef
				createdClass.superTypes += 	MinimalTruffleEObjectImpl.TruffleContainer.typeRef
			}

			createdClass.superTypes += interfaceName.typeRef

			clazz.EAllStructuralFeatures.forEach [ field |
				if (field instanceof EAttribute) {
					// EDataType
					val type = field.EType.scopedTypeRef(compileTarget, abstractSyntax, false)
					createdClass.members += field.toField('''«field.name.toUpperCase»_EDEFAULT''', type) [
						initializer = '''«field.defaultValue»'''
					]
					createdClass.members += field.toField(field.name, type) [
						initializer = '''«field.name.toUpperCase»_EDEFAULT'''
					]
					createdClass.members += field.toSetter(field.name, type)
					createdClass.members += field.toGetter(field.name, type)
				} else if (field instanceof EReference) {
					val rt = field.EGenericType.ERawType.scopedTypeRef(compileTarget, abstractSyntax, false)
					val type = if(field.upperBound > 1) EList.typeRef(rt) else rt
					createdClass.members += field.toField(field.name, type) => [
						if(compileTarget.child && field.containment) {
							annotations += 'com.oracle.truffle.api.nodes.Node$Child'.annotationRef()
						}
					]
					createdClass.members += field.toSetter(field.name, type)
					createdClass.members += field.toGetter(field.name, type)
				} else {
					println(field)
				}
				
			]
			
			createdClass.members += clazz.toMethod('eStaticClass', EClass.typeRef) [
				visibility=JvmVisibility.PROTECTED
				body = '''return «compileTarget.packageInterfaceFQN.typeRef».Literals.«clazz.name.toUpperCase»;'''
			]
			
			createdClass.members += clazz.toMethod('eSet', void.typeRef) [
				parameters += clazz.toParameter('featureID', int.typeRef)
				parameters += clazz.toParameter('newValue', Object.typeRef)
				visibility=JvmVisibility.PUBLIC
				body = '''
				switch (featureID) {
				«FOR esf:clazz.EStructuralFeatures»
				case «compileTarget.packageInterfaceFQN».«esf.name.normalizeUpperField(clazz.name)»:
					«IF esf instanceof EAttribute»
					set«esf.name.toFirstUpper»((«esf.EType.scopedTypeRef(compileTarget, abstractSyntax, true)») newValue);
					«ELSE»
					«IF esf.upperBound <= 1»
					set«esf.name.toFirstUpper»((«esf.EGenericType.ERawType.scopedTypeRef(compileTarget, abstractSyntax, false)») newValue);
					«ELSE»
					throw new RuntimeException("Not Implemented");
					«ENDIF»
					«ENDIF»
				return;
				«ENDFOR»
				}
				super.eSet(featureID, newValue);
				'''
			]
			
			createdClass.members += clazz.toMethod('eUnset', void.typeRef) [
				parameters += clazz.toParameter('featureID', int.typeRef)
				visibility=JvmVisibility.PUBLIC
				body = '''
				switch (featureID) {
				«FOR esf:clazz.EStructuralFeatures»
				case «compileTarget.packageInterfaceFQN».«esf.name.normalizeUpperField(clazz.name)»:
					«IF esf instanceof EAttribute»
					set«esf.name.toFirstUpper»(«esf.name.toUpperCase»_EDEFAULT);
					«ELSE»
					«IF esf.upperBound <= 1»
					set«esf.name.toFirstUpper»((«esf.EGenericType.ERawType.scopedTypeRef(compileTarget, abstractSyntax, true)») null);
					«ELSE»
					throw new RuntimeException("Not Implemented");
					«ENDIF»
					«ENDIF»
				return;
				«ENDFOR»
				}
				super.eUnset(featureID);
				'''
			]
			
			createdClass.members += clazz.toMethod('eGet', Object.typeRef) [
				parameters += clazz.toParameter('featureID', int.typeRef)
				parameters += clazz.toParameter('resolve', boolean.typeRef)
				parameters += clazz.toParameter('coreType', boolean.typeRef)
				visibility=JvmVisibility.PUBLIC
				body = '''
				switch (featureID) {
				«FOR esf:clazz.EStructuralFeatures»
				case «compileTarget.packageInterfaceFQN».«esf.name.normalizeUpperField(clazz.name)»:
					return get«esf.name.toFirstUpper»();
				«ENDFOR»
				}
				return super.eGet(featureID, resolve, coreType);
				'''
			]
			
			createdClass.members += clazz.toMethod('eIsSet', boolean.typeRef) [
				parameters += clazz.toParameter('featureID', int.typeRef)
				visibility=JvmVisibility.PUBLIC
				body = '''
				switch (featureID) {
				«FOR esf:clazz.EStructuralFeatures»
				case «compileTarget.packageInterfaceFQN».«esf.name.normalizeUpperField(clazz.name)»:
					«IF esf instanceof EAttribute»
					return «esf.name» != «esf.name.toUpperCase»_EDEFAULT;
					«ELSE»
					«IF esf.upperBound <= 1»
					return «esf.name» != null;
					«ELSE»
					throw new RuntimeException("Not Implemented");
					«ENDIF»
					«ENDIF»
				«ENDFOR»
				}
				return super.eIsSet(featureID);
				'''
			]
			
			createdClass.members += alexClass.methods.filter[method | method instanceof ConcreteMethod].map[method | method.toMethod('''«method.name»''', method.type) [
				val m = method as ConcreteMethod
				val block = m.block
				body = block
			]]
			
		]
	}
	

	
	def dispatch scopedTypeRef(EDataType edt, CompileTarget compileTarget, EPackage abstractSyntax, boolean toUpper) {
		if(toUpper) edt.instanceTypeName.toFirstUpper.typeRef
		else edt.instanceTypeName.typeRef
		//edt.instanceClass
	}
	
	

	def dispatch scopedTypeRef(EClass clazz, CompileTarget compileTarget, EPackage abstractSyntax, boolean toUpper) {
		clazz.classFQN(compileTarget).typeRef
	}

	

}
