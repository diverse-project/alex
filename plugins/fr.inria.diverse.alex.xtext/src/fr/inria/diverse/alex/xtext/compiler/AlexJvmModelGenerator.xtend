package fr.inria.diverse.alex.xtext.compiler

import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.utils.AlexUtils
import fr.inria.diverse.alex.xtext.utils.EcoreUtils
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import com.google.inject.Inject
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

class AlexJvmModelGenerator extends JvmModelGenerator {
	@Inject extension AlexUtils
	@Inject extension EcoreUtils
	@Inject extension NamingUtils

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val alexRoot = input.allContents.head as AlexRoot 
//		if (!alexRoot.bindings.empty) {
//			val EPackage ePackage = this.generateEcore(input, alexRoot)
//			this.generateGenmodel(input, ePackage, alexRoot)
//		}
		super.doGenerate(input, fsa)

	}

//	def generateGenmodel(Resource input, EPackage mainPackage, AlexRoot alexRoot) {
//		val projectName = input.URI.segmentsList.get(1)
//		val ecoreFileUri = URI.createPlatformResourceURI('''/«projectName»/model/«alexRoot.name».genmodel''', true)
//
//		val resourceSet = new ResourceSetImpl
//		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("genmodel", new XMIResourceFactoryImpl)
//		val resource = resourceSet.createResource(ecoreFileUri)
//
//		(resource as XMIResource).defaultSaveOptions.put(XMLResource.OPTION_ENCODING, 'UTF-8')
//
//		val ugp = alexRoot.alexImports.map[it.ref.ecoreImport].map[it.uri.loadCorrespondingGenmodel].map [
//			genPackages.toList
//		].flatten.toSet
//
//		if(alexRoot.ecoreImport !== null) ugp.addAll(alexRoot.ecoreImport.uri.loadCorrespondingGenmodel.genPackages)
//
//		val genModel = GenModelFactory.eINSTANCE.createGenModel => [
//			modelDirectory = '''/«projectName»/src-gen'''
//			modelPluginID = projectName
//			modelName = alexRoot.name.toFirstUpper
//			complianceLevel = GenJDKLevel.JDK80_LITERAL
//			copyrightFields = false
//			usedGenPackages += ugp
//			operationReflection = true
//			importOrganizing = true
//			foreignModel += '''«alexRoot.name».ecore'''
//			genPackages += GenModelFactory.eINSTANCE.createGenPackage => [
//				prefix = alexRoot.name.toFirstUpper
//				disposableProviderFactory = true
//				ecorePackage = mainPackage
//				genClasses += mainPackage.EClassifiers.filter(EClass).map [ eClass |
//					GenModelFactory.eINSTANCE.createGenClass => [
//						ecoreClass = eClass
//					]
//				]
//			]
//		]
//
//		resource.contents.add(genModel)
//
//		resource.save(null)
//
//		genModel
//	}

//	def EPackage generateEcore(Resource input, AlexRoot alexRoot) {
//
//		val extension factory = EcoreFactory.eINSTANCE
//
//		val ecoreFileUri = URI.
//			createPlatformResourceURI('''/«input.URI.segmentsList.get(1)»/model/«alexRoot.name».ecore''', true)
//
//		val resourceSet = new ResourceSetImpl
//		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
//		val resource = resourceSet.createResource(ecoreFileUri)
//
//		val ecorePackage = createEPackage => [
//			name = alexRoot.name
//			nsPrefix = alexRoot.name
//			nsURI = '''http://«alexRoot.name»'''
//		]
//
////		alexRoot.bindings.forEach [ classBind |
////			if (!classBind.nothing) {
////				ecorePackage.EClassifiers += createEClass => [
////					name = classBind.bindClassName
////					ESuperTypes += classBind.requiredCls.getMatchingEClass
////					EStructuralFeatures += createEReference => [
////						lowerBound = 1
////						upperBound = 1
////						EType = classBind.providedCls.matchingEClass
////						name = 'delegate'
////					]
////				]
////			}
////		]
//
//		resource.contents.add(ecorePackage)
//		resource.save(null)
//
//		ecorePackage
//	}

}
