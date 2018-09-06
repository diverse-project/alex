package execad.revisitor.impl;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.ControlToken;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.InitialNode;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.Offer;
import activitydiagram.OpaqueAction;
import activitydiagram.Trace;
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

@SuppressWarnings("all")
public interface ExecadRevisitor extends ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> {
  @Override
  public default ActivityOperation activitydiagram__Activity(final Activity it) {
    return new execad.revisitor.operations.execad.impl.ActivityOperationImpl(it, this);
  }
  
  @Override
  public default ActivityFinalNodeOperation activitydiagram__ActivityFinalNode(final ActivityFinalNode it) {
    return new execad.revisitor.operations.execad.impl.ActivityFinalNodeOperationImpl(it, this);
  }
  
  @Override
  public default BooleanBinaryExpressionOperation activitydiagram__BooleanBinaryExpression(final BooleanBinaryExpression it) {
    return new execad.revisitor.operations.execad.impl.BooleanBinaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanUnaryExpressionOperation activitydiagram__BooleanUnaryExpression(final BooleanUnaryExpression it) {
    return new execad.revisitor.operations.execad.impl.BooleanUnaryExpressionOperationImpl(it, this);
  }
  
  @Override
  public default BooleanValueOperation activitydiagram__BooleanValue(final BooleanValue it) {
    return new execad.revisitor.operations.execad.impl.BooleanValueOperationImpl(it, this);
  }
  
  @Override
  public default BooleanVariableOperation activitydiagram__BooleanVariable(final BooleanVariable it) {
    return new execad.revisitor.operations.execad.impl.BooleanVariableOperationImpl(it, this);
  }
  
  @Override
  public default ControlFlowOperation activitydiagram__ControlFlow(final ControlFlow it) {
    return new execad.revisitor.operations.execad.impl.ControlFlowOperationImpl(it, this);
  }
  
  @Override
  public default ControlTokenOperation activitydiagram__ControlToken(final ControlToken it) {
    return new execad.revisitor.operations.execad.impl.ControlTokenOperationImpl(it, this);
  }
  
  @Override
  public default DecisionNodeOperation activitydiagram__DecisionNode(final DecisionNode it) {
    return new execad.revisitor.operations.execad.impl.DecisionNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkNodeOperation activitydiagram__ForkNode(final ForkNode it) {
    return new execad.revisitor.operations.execad.impl.ForkNodeOperationImpl(it, this);
  }
  
  @Override
  public default ForkedTokenOperation activitydiagram__ForkedToken(final ForkedToken it) {
    return new execad.revisitor.operations.execad.impl.ForkedTokenOperationImpl(it, this);
  }
  
  @Override
  public default InitialNodeOperation activitydiagram__InitialNode(final InitialNode it) {
    return new execad.revisitor.operations.execad.impl.InitialNodeOperationImpl(it, this);
  }
  
  @Override
  public default InputOperation activitydiagram__Input(final Input it) {
    return new execad.revisitor.operations.execad.impl.InputOperationImpl(it, this);
  }
  
  @Override
  public default InputValueOperation activitydiagram__InputValue(final InputValue it) {
    return new execad.revisitor.operations.execad.impl.InputValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerCalculationExpressionOperation activitydiagram__IntegerCalculationExpression(final IntegerCalculationExpression it) {
    return new execad.revisitor.operations.execad.impl.IntegerCalculationExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerComparisonExpressionOperation activitydiagram__IntegerComparisonExpression(final IntegerComparisonExpression it) {
    return new execad.revisitor.operations.execad.impl.IntegerComparisonExpressionOperationImpl(it, this);
  }
  
  @Override
  public default IntegerValueOperation activitydiagram__IntegerValue(final IntegerValue it) {
    return new execad.revisitor.operations.execad.impl.IntegerValueOperationImpl(it, this);
  }
  
  @Override
  public default IntegerVariableOperation activitydiagram__IntegerVariable(final IntegerVariable it) {
    return new execad.revisitor.operations.execad.impl.IntegerVariableOperationImpl(it, this);
  }
  
  @Override
  public default JoinNodeOperation activitydiagram__JoinNode(final JoinNode it) {
    return new execad.revisitor.operations.execad.impl.JoinNodeOperationImpl(it, this);
  }
  
  @Override
  public default MergeNodeOperation activitydiagram__MergeNode(final MergeNode it) {
    return new execad.revisitor.operations.execad.impl.MergeNodeOperationImpl(it, this);
  }
  
  @Override
  public default OfferOperation activitydiagram__Offer(final Offer it) {
    return new execad.revisitor.operations.execad.impl.OfferOperationImpl(it, this);
  }
  
  @Override
  public default OpaqueActionOperation activitydiagram__OpaqueAction(final OpaqueAction it) {
    return new execad.revisitor.operations.execad.impl.OpaqueActionOperationImpl(it, this);
  }
  
  @Override
  public default TraceOperation activitydiagram__Trace(final Trace it) {
    return new execad.revisitor.operations.execad.impl.TraceOperationImpl(it, this);
  }
}
