package execad.revisitor.operations.execad.impl;

import activitydiagram.ForkedToken;
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
import execad.revisitor.operations.execad.impl.TokenOperationImpl;

@SuppressWarnings("all")
public class ForkedTokenOperationImpl extends TokenOperationImpl implements ForkedTokenOperation {
  private ForkedToken obj;
  
  private ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ForkedTokenOperationImpl(final ForkedToken obj, final ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void withdraw() {
    boolean _isWithdrawn = this.alg.$(this.obj.getBaseToken()).isWithdrawn();
    boolean _not = (!_isWithdrawn);
    if (_not) {
      this.alg.$(this.obj.getBaseToken()).withdraw();
    }
    int _remainingOffersCount = this.obj.getRemainingOffersCount();
    boolean _greaterThan = (_remainingOffersCount > 0);
    if (_greaterThan) {
      int _remainingOffersCount_1 = this.obj.getRemainingOffersCount();
      int _minus = (_remainingOffersCount_1 - 1);
      this.obj.setRemainingOffersCount(_minus);
    }
    int _remainingOffersCount_2 = this.obj.getRemainingOffersCount();
    boolean _equals = (_remainingOffersCount_2 == 0);
    if (_equals) {
      super.withdraw();
    }
  }
}
