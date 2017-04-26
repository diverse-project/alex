/*
 * generated by Xtext 2.10.0
 */
package ale.xtext.validation

import ale.xtext.ale.AleClass
import ale.xtext.ale.AlePackage
import ale.xtext.ale.ImportEcore
import ale.xtext.ale.Root
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check
import ale.utils.AleEcoreUtil
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AleValidator extends AbstractAleValidator {

	String SYNTAX_URI_NOT_FOUND = "syntax.uri.not.found"
	String SEMANTICS_IMPORT_LOOP = "semantics.import.loop"
	String ALE_CLASS_NAME_ERROR = "ale.class.name"

	/**
	 * TODO
	 * Check non cyclic inheritance of the semantics
	 * Check non conflicting ecore classnames
	 */

	@Check
	def checkValidSyntax(ImportEcore syntax) {
		val ePackage = new AleEcoreUtil().loadEPackageByEcorePath(syntax.ref, new ResourceSetImpl)
		if (ePackage == null) {
			error(
				"Package path can't be resolve",
				syntax,
				AlePackage.Literals.IMPORT_ECORE__REF,
				SYNTAX_URI_NOT_FOUND
			)
		}
	}

	private def void loadAllSemantics(Root root, List<Root> sems) {
		val List<Root> ales = root.importsAle.map[ref]
		for (ale : ales) {
			if (!sems.contains(ale)) {
				sems.add(ale)
				ale.loadAllSemantics(sems)
			}
		}
	}

	@Check
	def checkImportSemanticNonCyclic(Root root) {
		val recDeps = newArrayList()
		root.loadAllSemantics(recDeps)
		if (recDeps.contains(root)) {
			error("Ale dependencies loop", root, AlePackage.Literals.ROOT__NAME, SEMANTICS_IMPORT_LOOP)
		}
	}
	
	
	/**
	 * Check if the name of the open class matches the name of an imported EClass element
	 */
	@Check
	def checkIsOpenClassImported(AleClass aleClass) {
		val name = aleClass.name
		val root = EcoreUtil2.getRootContainer(aleClass) as Root
		val aeu = new AleEcoreUtil
		val rs = new ResourceSetImpl
		val allEClasses = root.importsEcore.map[aeu.loadEPackageByEcorePath(it.ref, rs)].map[it.eAllContents.filter[it instanceof EClass].map[it as EClass].toList].flatten
		if(!allEClasses.exists[it.name == name]) {
			error("Non existing EClass for the Ale Class", aleClass, 
				AlePackage.Literals.ALE_CLASS__NAME, ALE_CLASS_NAME_ERROR
			)
		}
	}
}
