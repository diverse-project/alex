/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl4.serializer;

import com.google.inject.Inject;
import compilA.CompilAPackage;
import compilA.Literal;
import compilA.Mul;
import compilA.Neg;
import compilA.Sum;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CompilAPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CompilAPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case CompilAPackage.MUL:
				sequence_Mul(context, (Mul) semanticObject); 
				return; 
			case CompilAPackage.NEG:
				sequence_Neg(context, (Neg) semanticObject); 
				return; 
			case CompilAPackage.SUM:
				sequence_Sum(context, (Sum) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns Literal
	 *     Sum returns Literal
	 *     Sum.Sum_1_0_0_0 returns Literal
	 *     Mul returns Literal
	 *     Mul.Mul_1_0_0_0 returns Literal
	 *     Terminal returns Literal
	 *     Literal returns Literal
	 *
	 * Constraint:
	 *     value=ELong
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CompilAPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompilAPackage.Literals.LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralAccess().getValueELongParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Mul
	 *     Sum returns Mul
	 *     Sum.Sum_1_0_0_0 returns Mul
	 *     Mul returns Mul
	 *     Mul.Mul_1_0_0_0 returns Mul
	 *     Terminal returns Mul
	 *
	 * Constraint:
	 *     (lhs=Mul_Mul_1_0_0_0 rhs=Terminal)
	 */
	protected void sequence_Mul(ISerializationContext context, Mul semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CompilAPackage.Literals.MUL__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompilAPackage.Literals.MUL__LHS));
			if (transientValues.isValueTransient(semanticObject, CompilAPackage.Literals.MUL__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompilAPackage.Literals.MUL__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMulAccess().getMulLhsAction_1_0_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getMulAccess().getRhsTerminalParserRuleCall_1_1_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Neg
	 *     Sum returns Neg
	 *     Sum.Sum_1_0_0_0 returns Neg
	 *     Mul returns Neg
	 *     Mul.Mul_1_0_0_0 returns Neg
	 *     Terminal returns Neg
	 *     Neg returns Neg
	 *
	 * Constraint:
	 *     exp=Expression
	 */
	protected void sequence_Neg(ISerializationContext context, Neg semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CompilAPackage.Literals.NEG__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompilAPackage.Literals.NEG__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNegAccess().getExpExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Sum
	 *     Sum returns Sum
	 *     Sum.Sum_1_0_0_0 returns Sum
	 *     Mul returns Sum
	 *     Mul.Mul_1_0_0_0 returns Sum
	 *     Terminal returns Sum
	 *
	 * Constraint:
	 *     (lhs=Sum_Sum_1_0_0_0 rhs=Mul)
	 */
	protected void sequence_Sum(ISerializationContext context, Sum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CompilAPackage.Literals.SUM__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompilAPackage.Literals.SUM__LHS));
			if (transientValues.isValueTransient(semanticObject, CompilAPackage.Literals.SUM__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompilAPackage.Literals.SUM__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumAccess().getSumLhsAction_1_0_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getSumAccess().getRhsMulParserRuleCall_1_1_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
}