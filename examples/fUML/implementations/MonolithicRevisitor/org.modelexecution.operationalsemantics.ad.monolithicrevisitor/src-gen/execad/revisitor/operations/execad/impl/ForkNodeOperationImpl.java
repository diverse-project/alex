package execad.revisitor.operations.execad.impl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.Token;
import activitydiagram.revisitor.ActivitydiagramRevisitor;
import execad.revisitor.operations.execad.ActionOperation;
import execad.revisitor.operations.execad.ActivityEdgeOperation;
import execad.revisitor.operations.execad.ActivityFinalNodeOperation;
import execad.revisitor.operations.execad.ActivityNodeOperation;
import execad.revisitor.operations.execad.ActivityOperation;
import execad.revisitor.operations.execad.BooleanBinaryExpressionOperation;
import execad.revisitor.operations.execad.BooleanExpressionOperation;
import execad.revisitor.operations.execad.BooleanUnaryExpressionOperation;
import execad.revisitor.operations.execad.BooleanValueOperation;
import execad.revisitor.operations.execad.BooleanVariableOperation;
import execad.revisitor.operations.execad.ControlFlowOperation;
import execad.revisitor.operations.execad.ControlNodeOperation;
import execad.revisitor.operations.execad.ControlTokenOperation;
import execad.revisitor.operations.execad.DecisionNodeOperation;
import execad.revisitor.operations.execad.ExecutableNodeOperation;
import execad.revisitor.operations.execad.ExpressionOperation;
import execad.revisitor.operations.execad.FinalNodeOperation;
import execad.revisitor.operations.execad.ForkNodeOperation;
import execad.revisitor.operations.execad.ForkedTokenOperation;
import execad.revisitor.operations.execad.InitialNodeOperation;
import execad.revisitor.operations.execad.InputOperation;
import execad.revisitor.operations.execad.InputValueOperation;
import execad.revisitor.operations.execad.IntegerCalculationExpressionOperation;
import execad.revisitor.operations.execad.IntegerComparisonExpressionOperation;
import execad.revisitor.operations.execad.IntegerExpressionOperation;
import execad.revisitor.operations.execad.IntegerValueOperation;
import execad.revisitor.operations.execad.IntegerVariableOperation;
import execad.revisitor.operations.execad.JoinNodeOperation;
import execad.revisitor.operations.execad.MergeNodeOperation;
import execad.revisitor.operations.execad.NamedElementOperation;
import execad.revisitor.operations.execad.OfferOperation;
import execad.revisitor.operations.execad.OpaqueActionOperation;
import execad.revisitor.operations.execad.TokenOperation;
import execad.revisitor.operations.execad.TraceOperation;
import execad.revisitor.operations.execad.ValueOperation;
import execad.revisitor.operations.execad.VariableOperation;
import execad.revisitor.operations.execad.impl.ControlNodeOperationImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ForkNodeOperationImpl extends ControlNodeOperationImpl implements ForkNodeOperation {
  private ForkNode obj;
  
  private ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ForkNodeOperationImpl(final ForkNode obj, final ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void fire(final List<Token> tokens) {
    final ArrayList<Token> forkedTokens = CollectionLiterals.<Token>newArrayList();
    final Consumer<Token> _function = (Token t) -> {
      ForkedToken _createForkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken();
      final Procedure1<ForkedToken> _function_1 = (ForkedToken it) -> {
        it.setBaseToken(t);
        it.setRemainingOffersCount(this.obj.getOutgoing().size());
      };
      ForkedToken _doubleArrow = ObjectExtensions.<ForkedToken>operator_doubleArrow(_createForkedToken, _function_1);
      forkedTokens.add(_doubleArrow);
    };
    tokens.forEach(_function);
    this.alg.$(this.obj).addTokens(forkedTokens);
    this.alg.$(this.obj).sendOffers(forkedTokens);
  }
}
