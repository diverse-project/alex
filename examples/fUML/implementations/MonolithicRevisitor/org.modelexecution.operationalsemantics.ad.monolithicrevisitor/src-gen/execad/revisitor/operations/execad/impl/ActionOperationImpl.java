package execad.revisitor.operations.execad.impl;

import activitydiagram.Action;
import activitydiagram.ActivityEdge;
import activitydiagram.ActivitydiagramFactory;
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
import execad.revisitor.operations.execad.impl.ExecutableNodeOperationImpl;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class ActionOperationImpl extends ExecutableNodeOperationImpl implements ActionOperation {
  private Action obj;
  
  private ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ActionOperationImpl(final Action obj, final ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean isReady() {
    return (this.obj.isRunning() && this.alg.$(this.obj).hasOffers());
  }
  
  @Override
  public void sendOffers() {
    int _size = this.obj.getOutgoing().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final ArrayList<Token> tokens = CollectionLiterals.<Token>newArrayList(
        ActivitydiagramFactory.eINSTANCE.createControlToken());
      this.alg.$(this.obj).addTokens(tokens);
      this.alg.$(IterableExtensions.<ActivityEdge>head(this.obj.getOutgoing())).sendOffer(tokens);
    }
  }
  
  @Override
  public void fire(final List<Token> tokens) {
    this.alg.$(this.obj).doAction();
    this.alg.$(this.obj).sendOffers();
  }
}
