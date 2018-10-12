/*
 * generated by Xtext 2.14.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package org.xtext.example.mydsl4.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl4.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getSumParserRuleCall()); }
		ruleSum
		{ after(grammarAccess.getExpressionAccess().getSumParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSum
entryRuleSum
:
{ before(grammarAccess.getSumRule()); }
	 ruleSum
{ after(grammarAccess.getSumRule()); } 
	 EOF 
;

// Rule Sum
ruleSum 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSumAccess().getGroup()); }
		(rule__Sum__Group__0)
		{ after(grammarAccess.getSumAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMul
entryRuleMul
:
{ before(grammarAccess.getMulRule()); }
	 ruleMul
{ after(grammarAccess.getMulRule()); } 
	 EOF 
;

// Rule Mul
ruleMul 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMulAccess().getGroup()); }
		(rule__Mul__Group__0)
		{ after(grammarAccess.getMulAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminal
entryRuleTerminal
:
{ before(grammarAccess.getTerminalRule()); }
	 ruleTerminal
{ after(grammarAccess.getTerminalRule()); } 
	 EOF 
;

// Rule Terminal
ruleTerminal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminalAccess().getAlternatives()); }
		(rule__Terminal__Alternatives)
		{ after(grammarAccess.getTerminalAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNeg
entryRuleNeg
:
{ before(grammarAccess.getNegRule()); }
	 ruleNeg
{ after(grammarAccess.getNegRule()); } 
	 EOF 
;

// Rule Neg
ruleNeg 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNegAccess().getGroup()); }
		(rule__Neg__Group__0)
		{ after(grammarAccess.getNegAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteral
entryRuleLiteral
:
{ before(grammarAccess.getLiteralRule()); }
	 ruleLiteral
{ after(grammarAccess.getLiteralRule()); } 
	 EOF 
;

// Rule Literal
ruleLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralAccess().getGroup()); }
		(rule__Literal__Group__0)
		{ after(grammarAccess.getLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleELong
entryRuleELong
:
{ before(grammarAccess.getELongRule()); }
	 ruleELong
{ after(grammarAccess.getELongRule()); } 
	 EOF 
;

// Rule ELong
ruleELong 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getELongAccess().getINTTerminalRuleCall()); }
		RULE_INT
		{ after(grammarAccess.getELongAccess().getINTTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalAccess().getGroup_0()); }
		(rule__Terminal__Group_0__0)
		{ after(grammarAccess.getTerminalAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminalAccess().getLiteralParserRuleCall_1()); }
		ruleLiteral
		{ after(grammarAccess.getTerminalAccess().getLiteralParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTerminalAccess().getNegParserRuleCall_2()); }
		ruleNeg
		{ after(grammarAccess.getTerminalAccess().getNegParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sum__Group__0__Impl
	rule__Sum__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSumAccess().getMulParserRuleCall_0()); }
	ruleMul
	{ after(grammarAccess.getSumAccess().getMulParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sum__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSumAccess().getGroup_1()); }
	(rule__Sum__Group_1__0)*
	{ after(grammarAccess.getSumAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sum__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sum__Group_1__0__Impl
	rule__Sum__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSumAccess().getGroup_1_0()); }
	(rule__Sum__Group_1_0__0)
	{ after(grammarAccess.getSumAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sum__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSumAccess().getRhsAssignment_1_1()); }
	(rule__Sum__RhsAssignment_1_1)
	{ after(grammarAccess.getSumAccess().getRhsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sum__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sum__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSumAccess().getGroup_1_0_0()); }
	(rule__Sum__Group_1_0_0__0)
	{ after(grammarAccess.getSumAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sum__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sum__Group_1_0_0__0__Impl
	rule__Sum__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSumAccess().getSumLhsAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getSumAccess().getSumLhsAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sum__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sum__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_1()); }
	'+'
	{ after(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mul__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mul__Group__0__Impl
	rule__Mul__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulAccess().getTerminalParserRuleCall_0()); }
	ruleTerminal
	{ after(grammarAccess.getMulAccess().getTerminalParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mul__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulAccess().getGroup_1()); }
	(rule__Mul__Group_1__0)*
	{ after(grammarAccess.getMulAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mul__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mul__Group_1__0__Impl
	rule__Mul__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulAccess().getGroup_1_0()); }
	(rule__Mul__Group_1_0__0)
	{ after(grammarAccess.getMulAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mul__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulAccess().getRhsAssignment_1_1()); }
	(rule__Mul__RhsAssignment_1_1)
	{ after(grammarAccess.getMulAccess().getRhsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mul__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mul__Group_1_0__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulAccess().getGroup_1_0_0()); }
	(rule__Mul__Group_1_0_0__0)
	{ after(grammarAccess.getMulAccess().getGroup_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mul__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mul__Group_1_0_0__0__Impl
	rule__Mul__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulAccess().getMulLhsAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getMulAccess().getMulLhsAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mul__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulAccess().getAsteriskKeyword_1_0_0_1()); }
	'*'
	{ after(grammarAccess.getMulAccess().getAsteriskKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Terminal__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terminal__Group_0__0__Impl
	rule__Terminal__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getTerminalAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terminal__Group_0__1__Impl
	rule__Terminal__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalAccess().getExpressionParserRuleCall_0_1()); }
	ruleExpression
	{ after(grammarAccess.getTerminalAccess().getExpressionParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Terminal__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getTerminalAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Neg__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Neg__Group__0__Impl
	rule__Neg__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Neg__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNegAccess().getNegAction_0()); }
	()
	{ after(grammarAccess.getNegAccess().getNegAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Neg__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Neg__Group__1__Impl
	rule__Neg__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Neg__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNegAccess().getHyphenMinusKeyword_1()); }
	'-'
	{ after(grammarAccess.getNegAccess().getHyphenMinusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Neg__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Neg__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Neg__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNegAccess().getExpAssignment_2()); }
	(rule__Neg__ExpAssignment_2)
	{ after(grammarAccess.getNegAccess().getExpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Literal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Literal__Group__0__Impl
	rule__Literal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLiteralAccess().getLiteralAction_0()); }
	()
	{ after(grammarAccess.getLiteralAccess().getLiteralAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Literal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLiteralAccess().getValueAssignment_1()); }
	(rule__Literal__ValueAssignment_1)
	{ after(grammarAccess.getLiteralAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sum__RhsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSumAccess().getRhsMulParserRuleCall_1_1_0()); }
		ruleMul
		{ after(grammarAccess.getSumAccess().getRhsMulParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mul__RhsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulAccess().getRhsTerminalParserRuleCall_1_1_0()); }
		ruleTerminal
		{ after(grammarAccess.getMulAccess().getRhsTerminalParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Neg__ExpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNegAccess().getExpExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getNegAccess().getExpExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralAccess().getValueELongParserRuleCall_1_0()); }
		ruleELong
		{ after(grammarAccess.getLiteralAccess().getValueELongParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;