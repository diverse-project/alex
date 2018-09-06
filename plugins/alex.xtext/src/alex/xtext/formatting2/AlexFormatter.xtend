/*
 * generated by Xtext 2.12.0
 */
package alex.xtext.formatting2

import alex.xtext.alex.AlexClass
import alex.xtext.alex.AlexMethod
import alex.xtext.alex.AlexImport
import alex.xtext.alex.AlexRoot
import alex.xtext.alex.ConcreteMethod
import alex.xtext.services.AlexGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.xbase.formatting2.XbaseFormatter

class AlexFormatter extends XbaseFormatter {
	
	@Inject extension AlexGrammarAccess

	def dispatch void format(AlexRoot alexRoot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		alexRoot.getJavaImports.format;
		alexRoot.getEcoreImport.format;
		for (AlexImport alexImport : alexRoot.getAlexImports()) {
			alexImport.format;
		}
		for (AlexClass alexClass : alexRoot.classes) {
			alexClass.format;
		}
	}

	def dispatch void format(AlexClass alexClass, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc.
		
		val openBracket = alexClass.regionFor.keyword(alexClassAccess.leftCurlyBracketKeyword_4)
		val closeBracket = alexClass.regionFor.keyword(alexClassAccess.rightCurlyBracketKeyword_6)
		
		interior(openBracket, closeBracket)[indent]
			openBracket.append[setNewLines(1,1,2)]
		 
		for (AlexMethod alexMethod : alexClass.getMethods()) {
			alexMethod.format;
		}
	}
	
	def dispatch void format(ConcreteMethod alexMethod, extension IFormattableDocument document) {
			alexMethod.block.format
	}
	
}
