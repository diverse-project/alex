package alex.xtext.jvmmodel

import alex.xtext.alex.AbstractMethod
import alex.xtext.alex.AlexClass
import alex.xtext.alex.AlexFactory
import alex.xtext.alex.AlexRoot
import alex.xtext.alex.ConcreteMethod
import alex.xtext.utils.AlexUtils
import alex.xtext.utils.EcoreUtils
import alex.xtext.utils.NamingUtils
import com.google.inject.Inject
import java.util.Comparator
import java.util.List
import org.eclipse.e4.core.services.log.Logger
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.ui.PlatformUI
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.core.runtime.Platform

class AlexJvmModelInferrer extends AbstractModelInferrer {
	AlexRoot root
	EPackage pkg
	GenModel gm
	List<Pair<ResolvedClass, ResolvedClass>> resolved = newArrayList
	JvmTypeReference cachedRevSignature = null
	
	@Inject extension JvmTypesBuilder
	@Inject extension EcoreUtils
	@Inject extension NamingUtils
	@Inject extension AlexUtils

	@Data
	static class ResolvedClass {
		AlexClass alexCls
		public EClass eCls
		GenClass genCls
	}

	private def preProcess() {
		pkg = root.ecoreImport.uri.loadEPackage
		gm = root.ecoreImport.uri.loadCorrespondingGenmodel

		if (pkg === null || gm === null)
			return false

		// Create missing AlexClasses
		pkg.allClasses.forEach[eCls |
			if (!root.classes.exists[name == eCls.name])
				root.classes += AlexFactory::eINSTANCE.createAlexClass => [
					name = eCls.name
					abstract = eCls.abstract
				]
		]


		val resolved = newArrayList()
		root.classes
			.sortBy[name]
			.forEach[alexCls |
				val eCls = pkg.allClasses.findFirst[name == alexCls.name]
				val genCls = if (eCls !== null) eCls.getGenClass(gm)
				if(alexCls !== null && eCls !== null && genCls !== null)
					resolved += new ResolvedClass(alexCls, eCls, genCls)
				else
					println('''Class «alexCls» has not been resolved''') 
			]
			
		this.resolved = resolved.buildExtendedFactoryNames
	}
	
	def List<Pair<ResolvedClass, ResolvedClass>> buildExtendedFactoryNames(List<ResolvedClass> classes) {

		val List<Pair<ResolvedClass, Iterable<ResolvedClass>>> a = classes.map [
			val List<ResolvedClass> st = newArrayList()
			it.eCls.EAllSuperTypes.forEach[stp|st.add(classes.findFirst[eCls == stp])]
			st.add(it)
			(it -> st.filter[it !== null && it.eCls !== null]
				.map[it.eCls.ESuperTypes].filter[it.size > 1].flatten.map[stp | classes.findFirst[eCls == stp]]
			)
		]

		val List<Pair<ResolvedClass, Iterable<ResolvedClass>>> b = a.sortWith(
			Comparator.comparing([Pair<ResolvedClass, Iterable<ResolvedClass>> t|t.key.eCls.name]).
				thenComparing([ Pair<ResolvedClass, Iterable<ResolvedClass>> t |
					t.key.eCls.EPackage.name
				])
		)

		val List<List<Pair<ResolvedClass, ResolvedClass>>> c = b.map [ p |
			val List<Pair<ResolvedClass, ResolvedClass>> ret = newArrayList();
			val k = p.key
			ret.add((k -> null))
			val pv = p.value
			val List<Pair<ResolvedClass, ResolvedClass>> ll = if (pv !== null) pv.map[l|(k -> l)].toList else newArrayList
			ret.addAll(ll)
			ret
		]

		c.flatten.toList
	}

	def dispatch void infer(AlexRoot modelRoot, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		try {
			root = modelRoot

			preProcess()

			inferRevisitorImplementation(acceptor)

			resolved
				.forEach[
					key.inferOperationInterface(acceptor)

					// Don't infer implementation for @Required classes
					if (!key.eCls.hasRequiredAnnotation && value?.alexCls === null)
						key.inferOperationImplementation(acceptor)
				]
		} catch (Exception e) {
			if (Platform::running) {
				val logger = PlatformUI.getWorkbench().getService(typeof(Logger));
				logger.error(e, e.message)
			} else {
				e.printStackTrace
			}
		}
	}

	private def void inferRevisitorImplementation(IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(root.toClass(root.revisitorInterfaceFqn))[
			interface = true

			superTypes += pkg.revisitorInterfaceFqn.typeRef(resolved.map[key.alexCls.toOperationInterfaceType])

			resolved
				.filter[key.eCls !== null]
				.filter[!key.eCls.abstract]
				.forEach[r |
					val returnType = r.key.alexCls.toOperationInterfaceType

					members += r.key.alexCls.toMethod(r.denotationName, returnType)[
						annotations += Override.annotationRef
						parameters += r.key.alexCls.toParameter(r.key.eCls.varName, r.key.genCls.qualifiedInterfaceName.typeRef)
						body =
							if (r.key.alexCls.generated || r.key.alexCls.findNearestGeneratedParent !== null)
								'''return new «r.key.alexCls.toOperationImplType.qualifiedName»(«r.key.eCls.varName», this);'''
							else
								'''return null;'''
					]
			]
		]
	}
	
	def String getDenotationName(Pair<ResolvedClass,ResolvedClass> pcls) {
		val cls = pcls.key.eCls
		if(pcls.value === null)
			cls.denotationName
		else
			'''«cls.denotationName»__AS__«pcls.value.eCls.denotationName»'''
	}

	private def void inferOperationInterface(ResolvedClass resolved, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(resolved.alexCls.toClass(resolved.alexCls.operationInterfaceFqn))[
			interface = true

			superTypes +=
				resolved.eCls.getAllAlexClasses(root)
				.filter[it != resolved.alexCls && generated]
				.map[operationInterfaceFqn.typeRef]

			members += resolved.alexCls.methods.map[m |
				m.toMethod(m.name, m.type)[
					abstract = true
					parameters += m.params.map[cloneWithProxies]
				]
			]
		]
	}

	private def void inferOperationImplementation(ResolvedClass resolved, IJvmDeclaredTypeAcceptor acceptor) {
		acceptor.accept(resolved.alexCls.toClass(resolved.alexCls.operationImplFqn))[
			val superOp = resolved.alexCls.findNearestGeneratedParent

			abstract = resolved.alexCls.abstract

			superTypes += resolved.alexCls.operationInterfaceFqn.typeRef

			// In case of multiple-inheritance, we should
			// use some kind of delegate instead
			if (superOp !== null && !(superOp.abstract || resolved.eCls.ESuperTypes.exists[hasRequiredAnnotation]))
				superTypes += superOp.operationImplFqn.typeRef

			val asig = algSignature

			members += resolved.alexCls.toField("obj", resolved.genCls.qualifiedInterfaceName.typeRef)
			members += resolved.alexCls.toField("alg", asig)

			members += resolved.alexCls.toConstructor()[
				parameters += resolved.alexCls.toParameter("obj", resolved.genCls.qualifiedInterfaceName.typeRef)
				parameters += resolved.alexCls.toParameter("alg", asig)

				body = '''
«««					«IF superOp !== null»super(obj, alg);«ENDIF»
					«IF superOp !== null && !(superOp.abstract || resolved.eCls.ESuperTypes.exists[hasRequiredAnnotation])»super(obj, alg);«ENDIF»
					this.obj = obj;
					this.alg = alg;
				'''
			]


			val methods = resolved.alexCls.methods
			members += methods.filter[it instanceof ConcreteMethod].map [ m |
				m.toMethod(m.name, m.type) [
					abstract = m instanceof AbstractMethod
					annotations += Override.annotationRef
					parameters += m.params.map[cloneWithProxies]

					if (m instanceof ConcreteMethod)
						if (resolved.alexCls.methods.contains(m))
							body = m.block
				]
			]
		]
	}

	private def JvmTypeReference getAlgSignature() {
		if (cachedRevSignature === null)
			cachedRevSignature = typeRef(pkg.revisitorInterfaceFqn, resolved.map [
				key.alexCls.toOperationInterfaceType.wildcardExtends
			])
		return cachedRevSignature
	}

	private def JvmTypeReference toOperationInterfaceType(AlexClass alexCls) {
		return
			if (alexCls.generated)
				alexCls.operationInterfaceFqn.typeRef
			else if (alexCls.findNearestGeneratedParent !== null)
				alexCls.findNearestGeneratedParent.operationInterfaceFqn.typeRef
			else
				Object.typeRef
	}

	private def JvmTypeReference toOperationImplType(AlexClass alexCls) {
		return
			if (alexCls.generated)
				alexCls.operationImplFqn.typeRef
			else if (alexCls.findNearestGeneratedParent !== null)
				alexCls.findNearestGeneratedParent.operationImplFqn.typeRef
			else
				Object.typeRef
	}
}
