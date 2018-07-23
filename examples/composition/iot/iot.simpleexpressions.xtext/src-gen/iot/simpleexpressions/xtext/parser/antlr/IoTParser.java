/*
 * generated by Xtext 2.12.0
 */
package iot.simpleexpressions.xtext.parser.antlr;

import com.google.inject.Inject;
import iot.simpleexpressions.xtext.parser.antlr.internal.InternalIoTParser;
import iot.simpleexpressions.xtext.services.IoTGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class IoTParser extends AbstractAntlrParser {

	@Inject
	private IoTGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIoTParser createParser(XtextTokenStream stream) {
		return new InternalIoTParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "System";
	}

	public IoTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IoTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
