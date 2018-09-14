package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.utils.AlexUtils
import fr.inria.diverse.alex.xtext.utils.EcoreUtils
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.impl.EPackageImpl
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.xtext.common.types.JvmVisibility
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
			alexRoot.compileTargets.forEach[compile(alexRoot, acceptor)]
		}
	}

	def compile(CompileTarget compileTarget, AlexRoot alexRoot, IJvmDeclaredTypeAcceptor acceptor) {
		val abstractSyntax = alexRoot.ecoreImport.uri.loadGenmodel.EPackage

		acceptor.accept(abstractSyntax.toInterface(compileTarget.factoryInterfaceName(abstractSyntax), []))

		val packageInterfaceFQN = compileTarget.packageInterfaceFQN(abstractSyntax)
		acceptor.accept(abstractSyntax.toInterface(packageInterfaceFQN, [

			superTypes += EPackage.typeRef
			members += abstractSyntax.toField('eINSTANCE', packageInterfaceFQN.typeRef) [
				it.initializer = '''«compileTarget.packageImplName(abstractSyntax)».init()'''
				it.visibility = JvmVisibility.DEFAULT
			]

			// String eNS_URI = "http://www.example.org/mod";
			members += abstractSyntax.toField('eNS_URI', String.typeRef) [
				static = true
				visibility = JvmVisibility.PUBLIC
				it.initializer = '''"http://«compileTarget.name».«alexRoot.name».«abstractSyntax.name»/"'''
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
				members += abstractSyntax.allClasses.map[clazz|it.toField(clazz.name.toUpperCase, EClass.typeRef) [
					visibility = JvmVisibility.PUBLIC
					static = true
					initializer = '''eINSTANCE.get«clazz.name.toFirstUpper»()'''					
				]]
			]
			
			
			members += abstractSyntax.allClasses.map[clazz|it.toGetter(clazz.name, EClass.typeRef) => [
				body = null as XExpression
							abstract = true
			]]
		]))

		val packageImplFQN = compileTarget.packageClassFQN(abstractSyntax)
		acceptor.accept(abstractSyntax.toClass(packageImplFQN)) [
			superTypes += EPackageImpl.typeRef
			superTypes += packageInterfaceFQN.typeRef

			// private static boolean isInited = false;
			members += abstractSyntax.toField('isInited', boolean.typeRef) [
				visibility = JvmVisibility.PRIVATE
				static = true
			]

			members += abstractSyntax.toMethod('init', packageInterfaceFQN.typeRef) [
				static = true

				val packageInterfaceName = abstractSyntax.packageInterfaceName
				val packageClassFQN = compileTarget.packageClassFQN(abstractSyntax)

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
					//the«packageInterfaceName».createPackageContents();
					
					// Initialize created meta-data
					//the«packageInterfaceName».initializePackageContents();
					
					// Mark meta-data to indicate it can't be changed
					the«packageInterfaceName».freeze();
					
					// Update the registry and return the package
					EPackage.Registry.INSTANCE.put(the«packageInterfaceName».eNS_URI, the«packageInterfaceName»);
					return the«packageInterfaceName»;
				'''
			]
		]

		abstractSyntax.allClasses.forEach [ clazz |

			val interfaceName = clazz.interfaceFQN(compileTarget, abstractSyntax)

			acceptor.accept(clazz.toInterface(interfaceName) [
				superTypes += EObject.typeRef
				superTypes += clazz.ESuperTypes.map [
					interfaceFQN(compileTarget, abstractSyntax).typeRef
				]

				clazz.EAllStructuralFeatures.forEach [ field |
					if (field instanceof EAttribute) {
						// EDataType
						val type = field.EType.scopedTypeRef(compileTarget, abstractSyntax)
						members += field.toSetter(field.name, type) => [
							body = null as XExpression
							abstract = true
						]
						members += field.toGetter(field.name, type) => [
							body = null as XExpression
							abstract = true
						]
					} else if (field instanceof EReference) {
						val rt = field.EGenericType.ERawType.scopedTypeRef(compileTarget, abstractSyntax)
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
			])

			acceptor.accept(clazz.toClass(clazz.classFQN(compileTarget, abstractSyntax))) [
				abstract = clazz.abstract

				if (!clazz.ESuperTypes.empty)
					it.superTypes += clazz.ESuperTypes.head.scopedTypeRef(compileTarget, abstractSyntax)
				else superTypes += MinimalEObjectImpl.Container.typeRef

				it.superTypes += interfaceName.typeRef

				clazz.EAllStructuralFeatures.forEach [ field |
					if (field instanceof EAttribute) {
						// EDataType
						val type = field.EType.scopedTypeRef(compileTarget, abstractSyntax)
						members += field.toField(field.name, type)
						members += field.toSetter(field.name, type)
						members += field.toGetter(field.name, type)
					} else if (field instanceof EReference) {
						val rt = field.EGenericType.ERawType.scopedTypeRef(compileTarget, abstractSyntax)
						val type = if(field.upperBound > 1) EList.typeRef(rt) else rt
						members += field.toField(field.name, type)
						members += field.toSetter(field.name, type)
						members += field.toGetter(field.name, type)
					} else {
						println(field)
					}
				]
			]
		]
	}

	def dispatch scopedTypeRef(EDataType edt, CompileTarget compileTarget, EPackage abstractSyntax) {
		edt.instanceClass.typeRef
	}

	def dispatch scopedTypeRef(EClass clazz, CompileTarget compileTarget, EPackage abstractSyntax) {
		clazz.classFQN(compileTarget, abstractSyntax).typeRef
	}

	def String interfaceFQN(EClass clazz, CompileTarget compileTarget, EPackage abstractSyntax) {
		'''«compileTarget.basePackage(abstractSyntax)».«clazz.name»'''
	}

	def String classFQN(EClass clazz, CompileTarget compileTarget, EPackage abstractSyntax) {
		'''«compileTarget.basePackage(abstractSyntax)».impl.«clazz.name»Impl'''
	}

	def String basePackage(CompileTarget compileTarget, EPackage abstractSyntax) {
		'''«compileTarget.name».«abstractSyntax.name»'''
	}

	def String factoryInterfaceName(CompileTarget compileTarget, EPackage abstractSyntax) {
		'''«compileTarget.basePackage(abstractSyntax)».«abstractSyntax.name.toFirstUpper»Factory'''
	}

	def String packageInterfaceFQN(CompileTarget compileTarget, EPackage abstractSyntax) {
		'''«compileTarget.basePackage(abstractSyntax)».«abstractSyntax.name.toFirstUpper»Package'''
	}

	def String packageClassFQN(CompileTarget compileTarget, EPackage abstractSyntax) {
		'''«compileTarget.basePackage(abstractSyntax)».impl.«abstractSyntax.packageClassName»'''
	}

	def String packageClassName(EPackage abstractSyntax) {
		'''«abstractSyntax.name.toFirstUpper»PackageImpl'''
	}

	def String packageInterfaceName(EPackage abstractSyntax) {
		'''«abstractSyntax.name.toFirstUpper»Package'''
	}

	def String packageImplName(CompileTarget compileTarget, EPackage abstractSyntax) {
		'''«compileTarget.basePackage(abstractSyntax)».impl.«abstractSyntax.name.toFirstUpper»PackageImpl'''
	}

}
