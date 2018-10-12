package fr.inria.diverse.alex.xtext.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.alex.emf.truffle.MinimalTruffleEObjectImpl
import fr.inria.diverse.alex.xtext.alex.AlexClass
import fr.inria.diverse.alex.xtext.alex.CompileTarget
import fr.inria.diverse.alex.xtext.alex.ConcreteMethod
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import java.util.Collection
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.notify.NotificationChain
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.impl.ENotificationImpl
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.eclipse.emf.ecore.util.EObjectContainmentEList
import org.eclipse.emf.ecore.util.InternalEList
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class EClassImplementationCompiler {
	
	@Inject extension JvmTypesBuilder jvmTypesBuilder
	@Inject extension NamingUtils namingUtils
	@Inject extension CompilerUtils compilerUtils
	
	def compileEClassImplementation(EClass clazz, IJvmDeclaredTypeAcceptor acceptor, CompileTarget compileTarget, EPackage abstractSyntax, AlexClass alexClass, extension JvmAnnotationReferenceBuilder annotationsBuilder, extension JvmTypeReferenceBuilder jvmTypeReferenceBuilder) {
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
				createdClass.superTypes += clazz.ESuperTypes.head.scopedTypeRef(compileTarget, abstractSyntax, false, jvmTypeReferenceBuilder)
			else {
				//extendedClass = 'fr.inria.diverse.alex.emf.truffle.MinimalTruffleEObjectImpl$TruffleContainer'.typeRef
				if(compileTarget.truffle)
					createdClass.superTypes += 	MinimalTruffleEObjectImpl.TruffleContainer.typeRef
				else createdClass.superTypes += MinimalEObjectImpl.Container.typeRef
			}

			createdClass.superTypes += interfaceName.typeRef

			clazz.EAttributes.forEach [ field |
				// EDataType
				val type = field.EType.scopedTypeRef(compileTarget, abstractSyntax, false,jvmTypeReferenceBuilder)
				createdClass.members += field.toField('''«field.name.toUpperCase»_EDEFAULT''', type) [
					initializer = '''«IF field.defaultValue === null || field.defaultValue.toString == ''»null«ELSE»«field.defaultValue»«ENDIF»'''
				]
				createdClass.members += field.toField(field.name, type) [
					initializer = '''«field.name.toUpperCase»_EDEFAULT'''
				]
				createdClass.members += field.toSetter(field.name, type)
				createdClass.members += field.toGetter(field.name, type)
				
			]
			
			clazz.EReferences.forEach [ field |
				val rt = field.EGenericType.ERawType.scopedInterfaceTypeRef(compileTarget, abstractSyntax, jvmTypeReferenceBuilder)
				val isMultiple = field.upperBound > 1 || field.upperBound < 0
				val type = if(isMultiple) EList.typeRef(rt) else rt
				val isMutable = alexClass !== null && alexClass.mutables.exists[
					it.name == field.name
				]
				createdClass.members += field.toField(field.name, type) => [
					// println('''«clazz.name».«field.name» child=«compileTarget.child» isMultiple=«isMultiple» isMutable=«isMutable»''')
					if(compileTarget.child && !isMultiple && !isMutable && field.isContainment) {
						annotations += 'com.oracle.truffle.api.nodes.Node$Child'.annotationRef
					}
				]
				if(!isMultiple) {
					createdClass.members += field.toMethod('''set«field.name.toFirstUpper»''', void.typeRef) [
						val newName = '''new«field.name.toFirstUpper»'''
						val name = field.name
						parameters += field.toParameter(newName, rt)
						
						
						body = '''
						if («newName» != «name») {
							«NotificationChain.typeRef» msgs = null;
							«IF field.EOpposite !== null»
							if («name» != null)
								msgs = ((«InternalEObject.typeRef») «name»).eInverseRemove(this, «compileTarget.packageInterfaceFQN.typeRef».«field.EOpposite.name.normalizeUpperField((field.EOpposite.eContainer as EClass).name)», «rt».class, msgs);
							if («newName» != null)
								msgs = ((«InternalEObject.typeRef») «newName»).eInverseAdd(this, «compileTarget.packageInterfaceFQN.typeRef».«field.EOpposite.name.normalizeUpperField((field.EOpposite.eContainer as EClass).name)», «rt».class,
										msgs);
							«ELSE»
							if («name» != null)
								msgs = ((«InternalEObject.typeRef») «name»).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - «compileTarget.packageInterfaceFQN.typeRef».«field.name.normalizeUpperField(clazz.name)», null, msgs);
							if («newName» != null)
								msgs = ((«InternalEObject.typeRef») «newName»).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - «compileTarget.packageInterfaceFQN.typeRef».«field.name.normalizeUpperField(clazz.name)», null, msgs);
							«ENDIF»
							msgs = basicSet«name.toFirstUpper»(«newName», msgs);
							if (msgs != null)
								msgs.dispatch();
						} else if (eNotificationRequired())
							eNotify(new «ENotificationImpl.typeRef»(this, «Notification.typeRef».SET, «compileTarget.packageInterfaceFQN.typeRef».«field.name.normalizeUpperField(clazz.name)», «newName», «newName»));
						'''
					]
					
					createdClass.members += field.toMethod('''basicSet«field.name.toFirstUpper»''', NotificationChain.typeRef) [
						parameters += field.toParameter('''new«field.name.toFirstUpper»''', type)
						parameters += field.toParameter('msgsp', NotificationChain.typeRef)
						
						val newName = '''new«field.name.toFirstUpper»'''
						val oldName = '''old«field.name.toFirstUpper»'''
						val name = field.name
						
						body = '''
						«NotificationChain.typeRef» msgs = msgsp;
						«type» «oldName» = «name»;
						«name» = «newName»;
						if (eNotificationRequired()) {
							«ENotificationImpl.typeRef» notification = new «ENotificationImpl.typeRef»(this, «Notification.typeRef».SET, «compileTarget.packageInterfaceFQN.typeRef».«field.name.normalizeUpperField(clazz.name)»,
									«oldName», «newName»);
							if (msgs == null)
								msgs = notification;
							else
								msgs.add(notification);
						}
						return msgs;
						'''
					]
					
				}
				if(isMultiple) {
					createdClass.members += field.toMethod('''get«field.name.toFirstUpper»''', type) [
						body= '''
						if(«field.name» == null) {
							«field.name» = new «EObjectContainmentEList.typeRef(rt)»(«rt».class, this, «compileTarget.packageInterfaceFQN.typeRef».«field.name.normalizeUpperField(clazz.name)»);
						}
						return «field.name»;
						'''
					] //(field.name, type) 
				} else {
					createdClass.members += field.toGetter(field.name, type)
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
					set«esf.name.toFirstUpper»((«esf.EType.scopedTypeRef(compileTarget, abstractSyntax, true, jvmTypeReferenceBuilder)») newValue);
					«ELSE»
					«IF esf.upperBound <= 1 && esf.upperBound >= 0»
					set«esf.name.toFirstUpper»((«esf.EGenericType.ERawType.scopedTypeRef(compileTarget, abstractSyntax, false, jvmTypeReferenceBuilder)») newValue);
					«ELSE»
					get«esf.name.toFirstUpper»().clear();
					get«esf.name.toFirstUpper»().addAll((«Collection.typeRef»<? extends «esf.EType.scopedTypeRef(compileTarget, abstractSyntax, true, jvmTypeReferenceBuilder)»>) newValue);
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
					«IF esf.upperBound <= 1 && esf.upperBound >= 0»
					set«esf.name.toFirstUpper»((«esf.EGenericType.ERawType.scopedTypeRef(compileTarget, abstractSyntax, true, jvmTypeReferenceBuilder)») null);
					«ELSE»
					get«esf.name.toFirstUpper»().clear();
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
					return «IF esf.EType.name == "EBoolean"»is«ELSE»get«ENDIF»«esf.name.toFirstUpper»();
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
			
			if(!clazz.EReferences.filter[it.EOpposite !== null].empty) {
				createdClass.members += clazz.toMethod('eInverseAdd', NotificationChain.typeRef) [
					// InternalEObject otherEnd, int featureID, NotificationChain msgs
					parameters += clazz.toParameter('otherEnd', InternalEObject.typeRef);
					parameters += clazz.toParameter('featureID', int.typeRef);
					parameters += clazz.toParameter('msgs2', NotificationChain.typeRef);
					
					body = '''
					«NotificationChain.typeRef» msgs = msgs2;
					switch (featureID) {
					«FOR ref: clazz.EReferences.filter[it.EOpposite !== null]»
					
					case «compileTarget.packageInterfaceFQN».«ref.name.normalizeUpperField(clazz.name)»:
						«IF ref.upperBound == 0 || ref.upperBound == 1»
						if («ref.name» != null)
							msgs = ((«InternalEObject.typeRef») «ref.name»).eInverseRemove(this, «compileTarget.packageInterfaceFQN».«ref.EOpposite.name.normalizeUpperField((ref.EOpposite.eContainer as EClass).name)», «(ref.EOpposite.eContainer as EClass).name».class,
									msgs);
						return basicSet«ref.name.toFirstUpper»((«(ref.EOpposite.eContainer as EClass).interfaceFQN(compileTarget).typeRef») otherEnd, msgs);
						«ELSE»
						return ((«InternalEList.typeRef(InternalEObject.typeRef)») (InternalEList<?>) get«ref.name.toFirstUpper»()).basicAdd(otherEnd, msgs);
						«ENDIF»
					«ENDFOR»
					}
					return super.eInverseAdd(otherEnd, featureID, msgs);
					'''
				]
				
				// TODO: eInverseRemove etc!!!
			}
			
			if(alexClass !== null) {
				
				if(alexClass.methods.contains[dispatch]) {
					alexClass.toConstructor [
						body = '''
						«FOR dispatchMethod: alexClass.methods.filter[dispatch]»
						
						«ENDFOR»
						'''
					]
				}
				
				createdClass.members += alexClass.methods.filter[dispatch].map[dispatchMethod|
					dispatchMethod.toField('''dispatch«dispatchMethod.name.toFirstUpper»''', Object.typeRef) [
						
					]
				]
				
				createdClass.members += alexClass.methods
					.filter[method | method instanceof ConcreteMethod]
					.map[method | method.toMethod('''«method.name»''', method.type) [
						parameters += method.params.map[cloneWithProxies]
						
						if (method.dispatch) { 
							body =  '''return null;'''
							visibility = JvmVisibility.PRIVATE	
						} 
						else 
							body = (method as ConcreteMethod).block
					]]
				
			
			}
		]
	}
}