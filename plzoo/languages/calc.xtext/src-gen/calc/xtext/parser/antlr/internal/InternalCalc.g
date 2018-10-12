/*
 * generated by Xtext 2.14.0
 */
grammar InternalCalc;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package calc.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package calc.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import calc.xtext.services.CalcGrammarAccess;

}

@parser::members {

 	private CalcGrammarAccess grammarAccess;

    public InternalCalcParser(TokenStream input, CalcGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Start";
   	}

   	@Override
   	protected CalcGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStart
entryRuleStart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStartRule()); }
	iv_ruleStart=ruleStart
	{ $current=$iv_ruleStart.current; }
	EOF;

// Rule Start
ruleStart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getStartAccess().getExpressionParserRuleCall());
	}
	this_Expression_0=ruleExpression
	{
		$current = $this_Expression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getMinusParserRuleCall());
	}
	this_Minus_0=ruleMinus
	{
		$current = $this_Minus_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleMinus
entryRuleMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMinusRule()); }
	iv_ruleMinus=ruleMinus
	{ $current=$iv_ruleMinus.current; }
	EOF;

// Rule Minus
ruleMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMinusAccess().getPlusParserRuleCall_0());
		}
		this_Plus_0=rulePlus
		{
			$current = $this_Plus_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					'-'
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getMinusAccess().getMinusLhsAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='-'
					{
						newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_0_0_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMinusAccess().getRhsPlusParserRuleCall_1_1_0());
					}
					lv_rhs_3_0=rulePlus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMinusRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_3_0,
							"calc.xtext.Calc.Plus");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePlus
entryRulePlus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusRule()); }
	iv_rulePlus=rulePlus
	{ $current=$iv_rulePlus.current; }
	EOF;

// Rule Plus
rulePlus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusAccess().getDivideParserRuleCall_0());
		}
		this_Divide_0=ruleDivide
		{
			$current = $this_Divide_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					'+'
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getPlusAccess().getPlusLhsAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='+'
					{
						newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_0_0_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusAccess().getRhsDivideParserRuleCall_1_1_0());
					}
					lv_rhs_3_0=ruleDivide
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_3_0,
							"calc.xtext.Calc.Divide");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleDivide
entryRuleDivide returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDivideRule()); }
	iv_ruleDivide=ruleDivide
	{ $current=$iv_ruleDivide.current; }
	EOF;

// Rule Divide
ruleDivide returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDivideAccess().getTimesParserRuleCall_0());
		}
		this_Times_0=ruleTimes
		{
			$current = $this_Times_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					'/'
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getDivideAccess().getDivideLhsAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='/'
					{
						newLeafNode(otherlv_2, grammarAccess.getDivideAccess().getSolidusKeyword_1_0_0_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getDivideAccess().getRhsTimesParserRuleCall_1_1_0());
					}
					lv_rhs_3_0=ruleTimes
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDivideRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_3_0,
							"calc.xtext.Calc.Times");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTimes
entryRuleTimes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimesRule()); }
	iv_ruleTimes=ruleTimes
	{ $current=$iv_ruleTimes.current; }
	EOF;

// Rule Times
ruleTimes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTimesAccess().getTerminalsParserRuleCall_0());
		}
		this_Terminals_0=ruleTerminals
		{
			$current = $this_Terminals_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				((
					(
					)
					'*'
				)
				)=>
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getTimesAccess().getTimesLhsAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='*'
					{
						newLeafNode(otherlv_2, grammarAccess.getTimesAccess().getAsteriskKeyword_1_0_0_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTimesAccess().getRhsTerminalsParserRuleCall_1_1_0());
					}
					lv_rhs_3_0=ruleTerminals
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTimesRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_3_0,
							"calc.xtext.Calc.Terminals");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTerminals
entryRuleTerminals returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalsRule()); }
	iv_ruleTerminals=ruleTerminals
	{ $current=$iv_ruleTerminals.current; }
	EOF;

// Rule Terminals
ruleTerminals returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getTerminalsAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getTerminalsAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getTerminalsAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalsAccess().getNegateAction_1_0(),
						$current);
				}
			)
			otherlv_4='-'
			{
				newLeafNode(otherlv_4, grammarAccess.getTerminalsAccess().getHyphenMinusKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminalsAccess().getVExpressionParserRuleCall_1_2_0());
					}
					lv_v_5_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminalsRule());
						}
						set(
							$current,
							"v",
							lv_v_5_0,
							"calc.xtext.Calc.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getTerminalsAccess().getNumeralParserRuleCall_2());
		}
		this_Numeral_6=ruleNumeral
		{
			$current = $this_Numeral_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNumeral
entryRuleNumeral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumeralRule()); }
	iv_ruleNumeral=ruleNumeral
	{ $current=$iv_ruleNumeral.current; }
	EOF;

// Rule Numeral
ruleNumeral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNumeralAccess().getNumeralAction_0(),
					$current);
			}
		)
		(
			(
				lv_n_1_0=RULE_INT
				{
					newLeafNode(lv_n_1_0, grammarAccess.getNumeralAccess().getNINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumeralRule());
					}
					setWithLastConsumed(
						$current,
						"n",
						lv_n_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;