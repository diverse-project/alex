package iot.revisitor.operations.iot.impl;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ContextOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlFlowOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.DecisionNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpressionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkedTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InitialNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OfferOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TraceOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;
import iot.ValueBindValue;
import iot.revisitor.IotRevisitor;
import iot.revisitor.operations.iot.BooleanValueBindBooleanValueOperation;
import iot.revisitor.operations.iot.BooleanVariableBindBooleanVariableOperation;
import iot.revisitor.operations.iot.ExpressionBindExpressionOperation;
import iot.revisitor.operations.iot.IntegerValueBindIntegerValueOperation;
import iot.revisitor.operations.iot.IntegerVariableBindIntegerVariableOperation;
import iot.revisitor.operations.iot.ValueBindValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanBinaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanUnaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerCalculationExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerComparisonExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerExpressionOperation;

@SuppressWarnings("all")
public class ValueBindValueOperationImpl implements ValueBindValueOperation {
  private ValueBindValue obj;
  
  private IotRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanValueOperation, BooleanValueBindBooleanValueOperation, BooleanVariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanVariableOperation, BooleanVariableBindBooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ExpressionOperation, ExpressionBindExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerValueOperation, IntegerValueBindIntegerValueOperation, IntegerVariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerVariableOperation, IntegerVariableBindIntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ValueOperation, ValueBindValueOperation, VariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.VariableOperation> alg;
  
  public ValueBindValueOperationImpl(final ValueBindValue obj, final IotRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanValueOperation, BooleanValueBindBooleanValueOperation, BooleanVariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanVariableOperation, BooleanVariableBindBooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ExpressionOperation, ExpressionBindExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerValueOperation, IntegerValueBindIntegerValueOperation, IntegerVariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerVariableOperation, IntegerVariableBindIntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ValueOperation, ValueBindValueOperation, VariableOperation, simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
