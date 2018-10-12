/*
 * generated by Xtext 2.14.0
 */
package boa.xtext.formatting2

import boa.model.boa.Def
import boa.model.boa.File
import boa.xtext.services.BoaGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class BoaFormatter extends AbstractFormatter2 {
	
	@Inject extension BoaGrammarAccess

	def dispatch void format(File file, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (command : file.commands) {
			command.format
		}
	}

	def dispatch void format(Def _def, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		_def.expr.format
	}
	
	// TODO: implement for BObject, Field, Copy, App, Project
}