package activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.impl;

import activitydiagram_simpleexpressions.revisitor.Activitydiagram_simpleexpressionsRevisitor;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActivityEdgeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActivityFinalNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActivityNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ActivityOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.BooleanValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.BooleanVariableBindSEBooleanVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.BooleanVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ContextOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ControlFlowOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ControlNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ControlTokenOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.DecisionNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ExecutableNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ExpBindSEExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ExpOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.FinalNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ForkNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ForkedTokenOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.InitialNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.InputOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.InputValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.IntegerValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.IntegerVariableBindSEIntegerVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.IntegerVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.JoinNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.MergeNodeOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.NamedActivityOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.OfferOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.OpaqueActionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanBinaryExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanUnaryExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEBooleanVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerCalculationExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerComparisonExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerExpressionOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEIntegerVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.SEVariableOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.TokenOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.TraceOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ValueOperation;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.VariableOperation;
import simpleexpressions.SEValue;

@SuppressWarnings("all")
public abstract class SEValueOperationImpl implements SEValueOperation {
  private SEValue obj;
  
  private Activitydiagram_simpleexpressionsRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends BooleanVariableBindSEBooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends ExpBindSEExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends IntegerVariableBindSEIntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public SEValueOperationImpl(final SEValue obj, final Activitydiagram_simpleexpressionsRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends BooleanVariableBindSEBooleanVariableOperation, ? extends ContextOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpOperation, ? extends ExpBindSEExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends IntegerVariableBindSEIntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedActivityOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
