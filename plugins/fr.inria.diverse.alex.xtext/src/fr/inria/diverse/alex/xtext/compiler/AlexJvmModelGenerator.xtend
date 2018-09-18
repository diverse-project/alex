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
		val target = alexRoot.compileTarget

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

		val rsas = rsp.get.createResource(URI.createURI('''platform:/resource/«project»/src-gen/«target.name».ecore'''))
		rsas.contents += asb

		clonegm.initialize(newArrayList(asb))

		rsgm.save(null)
		rsas.save(null)

		super.doGenerate(input, fsa)

	}

}
