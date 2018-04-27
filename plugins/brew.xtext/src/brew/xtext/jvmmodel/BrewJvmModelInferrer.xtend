/*
 * generated by Xtext 2.12.0
 */
package brew.xtext.jvmmodel

import ale.xtext.ale.AleClass
import ale.xtext.ale.AleFactory
import ale.xtext.ale.AleRoot
import ale.xtext.ale.ConcreteMethod
import ale.xtext.utils.AleUtils
import ale.xtext.utils.EcoreUtils
import brew.xtext.brew.BrewRoot
import brew.xtext.brew.ClassBind
import brew.xtext.util.NamingUtils
import com.google.inject.Inject
import java.util.Comparator
import java.util.List
import java.util.function.Function
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class BrewJvmModelInferrer extends AbstractModelInferrer {

	/**
	 * convenience API to build and initialize JVM types and their members.
	 */
	@Inject extension JvmTypesBuilder
	@Inject extension NamingUtils
	@Inject extension EcoreUtils
	@Inject extension AleUtils

	@Data
	public static class ResolvedClass {
		AleClass aleCls
		public EClass eCls
		GenClass genCls
		ClassBind clsBind
		boolean isBrew
	}

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the lambda you pass as the last argument.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	def dispatch void infer(BrewRoot brewRoot, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {

		val projectName = brewRoot.eResource.URI.segment(1)
		val String ecorePath = '''/«projectName»/model/«brewRoot.name».ecore'''
		val EPackage pkg = ecorePath.loadEPackage
		val gm = ecorePath.loadCorrespondingGenmodel

		val virtualAleRoot = AleFactory.eINSTANCE.createAleRoot => [
			name = brewRoot.name
			ecoreImport = AleFactory.eINSTANCE.createEcoreImport => [
				uri = ecorePath
			]
			aleImports += brewRoot.importSemantics.map [ brewImport |
				AleFactory.eINSTANCE.createAleImport => [
					ref = brewImport.ale
				]
			]
		]

		val r = new ResourceImpl

		r.contents.add(virtualAleRoot)
		
		

		val List<EClass> allClasses = (pkg.allClasses + pkg.getComplementaryFromEPackage[it.key.loadEPackage.allClasses]).toMap(['''«it.EPackage.name».«it.name»'''], [it]).values.toList

		val resolved = allClasses.map [ eCls |
			val allCls = brewRoot.importSemantics.map[it.ale.classes].flatten
			val existingAleClass = allCls.findFirst [ cls |
				val ePkg = EcoreUtil2.getContainerOfType(cls, AleRoot).ecoreImport.uri.loadEPackage.getAllClasses.
					findFirst[it.name == cls.name].EPackage.name
				val itName = cls.name

				val eClsName = eCls.name
				val eClsPkg = eCls.EPackage.name
				itName == eClsName && ePkg == eClsPkg
			]

			val isBrew = existingAleClass === null
			val genCls = if(eCls !== null) eCls.getGenClass(gm)
			if (!isBrew) {
				new ResolvedClass(existingAleClass, eCls, genCls, null, false)
			} else {
				val aleCls = eCls.createAleClassFromBrew(virtualAleRoot, brewRoot)
				val relatedBind = brewRoot.bound.findFirst [
					eCls.name.startsWith('''«it.requiredCls.name»Bind''')
				]

				// TODO <- here some binding is needed but undetected (eg Activity)
				// we should either derive a bind class and/or require a binding definition explicitly in brew
				new ResolvedClass(aleCls, eCls, genCls, relatedBind, true)
			}
		].toList
//		
//		println('''
//		resolved «resolved.size»
//		filtered «resolved.map[ECls].toSet.size»
//		''')
		brewRoot.inferRevisitorImpl(pkg, acceptor, resolved)

		// only generating brew defined classes (one interface by bound class)
		resolved.filter[isBrew].forEach [
			inferOperationInterface(acceptor, virtualAleRoot)
			inferOperationImplementation(acceptor, pkg, resolved, brewRoot)
		]

	}

	def AleClass createAleClassFromBrew(EClass eCls, AleRoot virtualAleRoot, BrewRoot brewRoot) {
		// unicity control
		if (!virtualAleRoot.classes.exists[it.name == eCls.name]) {
			AleFactory.eINSTANCE.createAleClass => [
				// TODO: for new we create virtual ale class for the bound class
				name = eCls.name
				val relatedBind = brewRoot.bound.findFirst [
					eCls.name.startsWith('''«it.requiredCls.name»Bind''')
				]

				if (relatedBind !== null)
					methods += relatedBind.requiredCls.methods.map [ clonedMethod |
						AleFactory.eINSTANCE.createOverrideMethod => [
							name = clonedMethod.name
							params += EcoreUtil2.copyAll(clonedMethod.params)
							type = EcoreUtil2.copy(clonedMethod.type)
						]
					]

				virtualAleRoot.classes += it
			]

		} else {
			virtualAleRoot.classes.findFirst[it.name == eCls.name]
		}
	}

	private def void inferOperationInterface(ResolvedClass r, IJvmDeclaredTypeAcceptor acceptor, AleRoot root) {
		val opInterfaceName = r.aleCls.operationInterfaceFqn
		acceptor.accept(r.aleCls.toClass(opInterfaceName)) [
			interface = true

			/*
			 * The super types are the interface types of the hierarchy of current eClass.
			 */
			val z = r
			val clsBind = z.getClsBind
			val requiredCls = clsBind.requiredCls
			val fqn = requiredCls.operationInterfaceFqn
			superTypes += fqn.typeRef

			members += r.aleCls.methods.map [ m |
				m.toMethod(m.name, m.type) [
					abstract = true
					parameters += m.params.map[cloneWithProxies]
				]
			]
		]
	}
	
	def sortByName(List<ResolvedClass> lst) {
		lst.sortWith(Comparator.comparing(new Function<ResolvedClass, String>() {
				
				override apply(ResolvedClass t) {
					t.eCls.name
				}
				
			}).thenComparing(new Function<ResolvedClass, String>() {
				
				override apply(ResolvedClass t) {
					t.eCls.EPackage.name
				}
				
			}))
	}

	def inferRevisitorImpl(BrewRoot brewRoot, EPackage pkg, IJvmDeclaredTypeAcceptor acceptor,
		List<ResolvedClass> resolved) {
		acceptor.accept(brewRoot.toClass(brewRoot.getRevisitorInterfaceFqn)) [
			interface = true
			val bond = resolved.sortByName.map [
				aleCls.toOperationInterfaceType
			]

			superTypes += pkg.revisitorInterfaceFqn.typeRef(bond)

			resolved.filter[!eCls.abstract].forEach [ r |
				val returnType = r.aleCls.toOperationInterfaceType

				members += r.aleCls.toMethod(r.eCls.denotationName, returnType) [
					annotations += Override.annotationRef
					parameters += r.aleCls.toParameter(r.eCls.varName, r.genCls.qualifiedInterfaceName.typeRef)
					body = if (r.aleCls.generated || r.aleCls.findNearestGeneratedParent !== null)
						'''return new «r.aleCls.toOperationImplType.qualifiedName»(«r.eCls.varName», this);'''
					else
						'''return null;'''
				]

				r.eCls.ESuperTypes.drop(1).forEach [ cls |
					members += r.aleCls.toMethod(cls.getDenotationName(r.eCls), returnType) [
						annotations += Override.annotationRef
						parameters += r.aleCls.toParameter(r.eCls.varName, r.genCls.qualifiedInterfaceName.typeRef)
						body = if (r.aleCls.generated || r.aleCls.findNearestGeneratedParent !== null)
							'''return new «r.aleCls.toOperationImplType.qualifiedName»(«r.eCls.varName», this);'''
						else
							'''return null;'''
					]
				]
			]
		]
	}

	private def JvmTypeReference toOperationImplType(AleClass aleCls) {
		return if (aleCls.generated)
			aleCls.operationImplFqn.typeRef
		else if (aleCls.findNearestGeneratedParent !== null)
			aleCls.findNearestGeneratedParent.operationImplFqn.typeRef
		else
			Object.typeRef
	}

	private def JvmTypeReference toOperationInterfaceType(AleClass aleCls) {
		return if (aleCls.generated)
			aleCls.operationInterfaceFqn.typeRef
		else if (aleCls.findNearestGeneratedParent !== null)
			aleCls.findNearestGeneratedParent.operationInterfaceFqn.typeRef
		else
			Object.typeRef
	}

	private def void inferOperationImplementation(ResolvedClass r, IJvmDeclaredTypeAcceptor acceptor, EPackage pkg,
		List<ResolvedClass> resolved, BrewRoot brewRoot) {

		r.getInterestingMethods(brewRoot).map [ m |
			val classBind = brewRoot.bound.findFirst [
				r.aleCls.name.startsWith('''«it.requiredCls.name»Bind''')
			]
			classBind.methodsBound.findFirst [
				it.abstractMethod.name == m.name
			]
		].filter[converter].forEach [ methodBind |

			val converterName = methodBind.converterClassFqn
			acceptor.accept(methodBind.toClass(converterName)) [
				members += methodBind.abstractMethod.params.map [
					toField(it.name, it.parameterType) [
						final = true
					]
				]
				members += methodBind.toConstructor [
					parameters += methodBind.abstractMethod.params.map[toParameter(it.name, it.parameterType)]
					body = '''
						«FOR p : methodBind.abstractMethod.params»
							this.«p.name» = «p.name»;
						«ENDFOR»
					'''
				]

				if (methodBind.initConverter !== null) {
					members += methodBind.toMethod('doInit', typeRef(Void.TYPE)) [
						body = methodBind.initConverter.body
					]
				}

				members += methodBind.paramsConverters.map [ pc |
					val type = pc.paramName.parameterType
					val setter = pc.toSetter(pc.name, type)
					val field = pc.toField(pc.name, type)
					val method = pc.toMethod('''adapt«pc.paramName.name»''', type) [
						body = pc.converter.body
					]
					#[setter, field, method]
				].flatten

				if (methodBind.closeConverter !== null) {
					members += methodBind.toMethod('doInverse', typeRef(Void.TYPE)) [
//						parameters += methodBind.concreteMethod.params.map[it.toParameter(it.name, it.parameterType)]
						body = methodBind.closeConverter.body
					]
				}

				members += methodBind.concreteMethod.params.map [
					methodBind.concreteMethod.toMethod('''conversion«it.name»''', it.parameterType) [
						body = '''return null;'''
					]
				]

				if (methodBind.abstractMethod.type.type != typeRef(Void.TYPE).type) {
					members += methodBind.toMethod('''convertReturn''', methodBind.abstractMethod.type) [
						parameters += methodBind.concreteMethod.toParameter('''value''', methodBind.concreteMethod.type)

						// FIXME: potential optimization. if both return types are compatible and no conversion is specified, the convertReturn call and generation is useless.
						if (methodBind.returnConverter !== null) {
							body = methodBind.returnConverter.body
						} else {
							body = '''return value;'''
						}
					]
				}
			]
		]

		acceptor.accept(r.aleCls.toClass(r.aleCls.operationImplFqn)) [
//			val superOp = r.aleCls.findNearestGeneratedParent
			
			

			abstract = r.aleCls.abstract

			superTypes += r.aleCls.operationInterfaceFqn.typeRef
//			superTypes += r.clsBind.requiredCls.operationImplFqn.typeRef

			// In case of multiple-inheritance, we should
			// use some kind of delegate instead
//			if (superOp !== null && !superOp.matchingEClass.hasRequiredAnnotation)
//			superTypes += r.getClsBind.requiredCls.operationImplFqn.typeRef

			members += r.aleCls.toField("obj", r.genCls.qualifiedInterfaceName.typeRef)
			members += r.aleCls.toField("alg", getAlgSignature(pkg, resolved))

			members += r.aleCls.toConstructor() [
				parameters += r.aleCls.toParameter("obj", r.genCls.qualifiedInterfaceName.typeRef)
				parameters += r.aleCls.toParameter("alg", getAlgSignature(pkg, resolved))

				body = '''
«««					«IF superOp !== null && !superOp.matchingEClass.hasRequiredAnnotation»super(obj, alg);«ENDIF»
					this.obj = obj;
					this.alg = alg;
				'''
			]

			members += r.getClsBind.methodsBound.map[it.abstractMethod].map [ m |
				m.toMethod(m.name, m.type) [
//					abstract = m instanceof AbstractMethod
					annotations += Override.annotationRef
					parameters += m.params.map[cloneWithProxies]

					val classBind = brewRoot.bound.findFirst [
						r.aleCls.name.startsWith('''«it.requiredCls.name»Bind''')
					]
					val methodBind = classBind.methodsBound.findFirst [
						it.abstractMethod.name == m.name
					]

//					if (superOp.matchingEClass.hasRequiredAnnotation) {
					if (methodBind !== null) {

						/**
						 * Lookup for the concrete method to which the call must be delegated
						 */
						val cm = methodBind.concreteMethod

						val voidType = typeRef(Void.TYPE)
						val isNotVoidType = m.type.type != voidType.type
						if (!methodBind.converter)
							body = '''
								«IF isNotVoidType»return «ENDIF»alg.$(obj.getDelegate()).«cm.name»(«FOR p : methodBind.concreteMethod.params SEPARATOR ', '»«p.name»«ENDFOR»);
							'''
						else {

							/* In case of converter, we generate the method specific converter */
							body = '''
								«methodBind.converterClassFqn» convert =  new «methodBind.converterClassFqn»(«FOR param : methodBind.abstractMethod.params»«param.name»«ENDFOR»);
								«IF methodBind.initConverter !== null»
									convert.doInit();
								«ENDIF»
								
								
								«FOR p : methodBind.concreteMethod.params»
									«IF methodBind.paramsConverters.exists[it.paramName.name == p.name] »
										«val paramConv = methodBind.paramsConverters.findFirst[it.paramName.name == p.name]»
										«paramConv.paramName.parameterType.identifier» «paramConv.name» = convert.adapt«p.name»();
										convert.set«paramConv.name.toFirstUpper»(«paramConv.name»);
									«ENDIF»
									
								«ENDFOR»
								
								«val params = '''«FOR p : methodBind.concreteMethod.params SEPARATOR ', '»«IF methodBind.paramsConverters.exists[it.paramName.name == p.name] »«val paramConv = methodBind.paramsConverters.findFirst[it.paramName.name == p.name]»«paramConv.name»«ELSE»«p.name»«ENDIF»«ENDFOR»'''»
								«IF isNotVoidType»
									«m.type.fullType» res = convert.convertReturn(alg.$(obj.getDelegate()).«cm.name»(«params»));
								«ELSE»
									alg.$(obj.getDelegate()).«cm.name»(«params»);
								«ENDIF»
								
								«IF methodBind.closeConverter !== null»
									convert.doInverse();
								«ENDIF»
								
								«IF isNotVoidType»return res;«ENDIF»
							'''

						}
					} else if (m instanceof ConcreteMethod)
						if (r.aleCls.methods.contains(m))
							body = m.block
				]
			]
		]
	}

	def getInterestingMethods(ResolvedClass r, BrewRoot brewRoot) {
		r.aleCls.methods.filter [ m |
			val classBind = brewRoot.bound.findFirst [
				r.aleCls.name.startsWith('''«it.requiredCls.name»Bind''')
			]
			val methodBind = classBind.methodsBound.findFirst [
				it.abstractMethod.name == m.name
			]

			methodBind !== null
		]
	}

	def fullType(JvmTypeReference type) '''«type.identifier»'''

	private def JvmTypeReference getAlgSignature(EPackage pkg, List<ResolvedClass> resolved) {
		return typeRef(
			pkg.revisitorInterfaceFqn,
			resolved.sortByName.map[aleCls.toOperationInterfaceType]
		)
	}

}
