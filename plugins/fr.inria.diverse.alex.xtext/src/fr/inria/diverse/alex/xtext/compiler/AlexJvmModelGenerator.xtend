package fr.inria.diverse.alex.xtext.compiler

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.utils.AlexUtils
import fr.inria.diverse.alex.xtext.utils.EcoreUtils
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import javax.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.emf.ecore.EPackage

class AlexJvmModelGenerator extends JvmModelGenerator {
	@Inject extension AlexUtils
	@Inject extension EcoreUtils
	@Inject extension NamingUtils
	@Inject Provider<ResourceSet> rsp

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val alexRoot = input.allContents.head as AlexRoot

		val project = alexRoot.eResource.URI.segment(1)

		val gm = alexRoot.ecoreImport.uri.loadGenmodel
		val abstractSyntax = gm.EPackage

		// TODO: Produce a relevant genmodel here
		alexRoot.compileTargets.forEach [ target |

			val clonegm = EcoreUtil2.copy(gm)

			clonegm.modelDirectory = '''/«project»/src-gen'''
			clonegm.modelPluginID = '''«project»'''
			clonegm.modelName = '''«target.name.toFirstUpper»'''
			clonegm.foreignModel.clear
			clonegm.foreignModel += '''./«target.name».ecore'''
			clonegm.genPackages.clear
			
			clonegm.initialize(newArrayList())

			val rsgm = rsp.get.createResource(
				URI.createURI('''platform:/resource/«project»/src-gen/«target.name».genmodel'''))
			rsgm.contents += clonegm


			val asb = EcoreUtil2.copy(abstractSyntax)

			asb.nsURI = '''http://«target.name».«alexRoot.name».«abstractSyntax.name»/'''
			asb.name = target.name
			asb.nsPrefix = target.name

			val rsas = rsp.get.createResource(
				URI.createURI('''platform:/resource/«project»/src-gen/«target.name».ecore'''))
			rsas.contents += asb
			
			clonegm.initialize(newArrayList(asb))

			rsgm.save(null)
			rsas.save(null)

//			fsa.generateFile('''«target.name».genmodel''', '''
//			<?xml version="1.0" encoding="UTF-8"?>
//			<genmodel:GenModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
//			    xmlns:genmodel="http://www.eclipse.org/emf/2002/GenModel" modelDirectory="/«project»/src-gen" modelPluginID="«project»" modelName="«target.name»"
//			    rootExtendsClass="org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container" importerID="org.eclipse.emf.importer.ecore"
//			    complianceLevel="10.0" copyrightFields="false" operationReflection="true" importOrganizing="true">
//			  <foreignModel>«abstractSyntax.eResource.URI»</foreignModel>
//			   <genPackages prefix="«abstractSyntax.name.toFirstUpper»" basePackage="«target.name»" disposableProviderFactory="true"
//			        ecorePackage="«abstractSyntax.eResource.URI.lastSegment»#/">
//			   </genPackages>
//			</genmodel:GenModel>
//			
//			''')
//			
//			/*
//			 * <genPackages prefix="Mod" basePackage="compilA" disposableProviderFactory="true"
//			      ecorePackage="mod.ecore#/">
//			    <genClasses image="false" ecoreClass="mod.ecore#//Expression"/>
//			    <genClasses ecoreClass="mod.ecore#//Sum">
//			      <genFeatures property="None" children="true" createChild="true" ecoreFeature="ecore:EReference mod.ecore#//Sum/lhs"/>
//			      <genFeatures property="None" children="true" createChild="true" ecoreFeature="ecore:EReference mod.ecore#//Sum/rhs"/>
//			    </genClasses>
//			    <genClasses ecoreClass="mod.ecore#//Literal">
//			      <genFeatures createChild="false" ecoreFeature="ecore:EAttribute mod.ecore#//Literal/value"/>
//			    </genClasses>
//			  </genPackages>
//			 */
//			
		]
		super.doGenerate(input, fsa)

	}

}
