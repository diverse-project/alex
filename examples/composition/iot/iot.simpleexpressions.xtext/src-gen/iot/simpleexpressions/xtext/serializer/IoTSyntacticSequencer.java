/*
 * generated by Xtext 2.12.0
 */
package iot.simpleexpressions.xtext.serializer;

import com.google.inject.Inject;
import iot.simpleexpressions.xtext.services.IoTGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class IoTSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IoTGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Actuator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Board___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q;
	protected AbstractElementAlias match_Parenthesis_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_Parenthesis_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_Sensor___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IoTGrammarAccess) access;
		match_Actuator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_2_2()));
		match_Board___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_6_2()));
		match_Parenthesis_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		match_Parenthesis_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		match_Sensor___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Actuator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Actuator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Board___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q.equals(syntax))
				emit_Board___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parenthesis_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_Parenthesis_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parenthesis_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_Parenthesis_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Sensor___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Sensor___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Actuator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=BoardType ']' (ambiguity) (rule end)
	 */
	protected void emit_Board___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'rand' '(' min=INTEGER
	 *     (rule start) (ambiguity) name=ID
	 *     (rule start) (ambiguity) val=INTEGER
	 *     (rule start) (ambiguity) {ArithMinus.lhs=}
	 *     (rule start) (ambiguity) {ArithPlus.lhs=}
	 */
	protected void emit_Parenthesis_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'rand' '(' min=INTEGER
	 *     (rule start) (ambiguity) name=ID
	 *     (rule start) (ambiguity) val=INTEGER
	 *     (rule start) (ambiguity) {ArithMinus.lhs=}
	 *     (rule start) (ambiguity) {ArithPlus.lhs=}
	 */
	protected void emit_Parenthesis_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Sensor___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
