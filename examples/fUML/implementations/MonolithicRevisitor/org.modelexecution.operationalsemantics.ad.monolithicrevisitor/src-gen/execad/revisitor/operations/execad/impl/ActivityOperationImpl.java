package execad.revisitor.operations.execad.impl;

import activitydiagram.Activity;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.InitialNode;
import activitydiagram.InputValue;
import activitydiagram.Variable;
import activitydiagram.revisitor.ActivitydiagramRevisitor;
import com.google.common.collect.Iterables;
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
import execad.revisitor.operations.execad.impl.NamedElementOperationImpl;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ActivityOperationImpl extends NamedElementOperationImpl implements ActivityOperation {
  private Activity obj;
  
  private ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public ActivityOperationImpl(final Activity obj, final ActivitydiagramRevisitor<? extends ActionOperation, ? extends ActivityOperation, ? extends ActivityEdgeOperation, ? extends ActivityFinalNodeOperation, ? extends ActivityNodeOperation, ? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ControlFlowOperation, ? extends ControlNodeOperation, ? extends ControlTokenOperation, ? extends DecisionNodeOperation, ? extends ExecutableNodeOperation, ? extends ExpressionOperation, ? extends FinalNodeOperation, ? extends ForkNodeOperation, ? extends ForkedTokenOperation, ? extends InitialNodeOperation, ? extends InputOperation, ? extends InputValueOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends JoinNodeOperation, ? extends MergeNodeOperation, ? extends NamedElementOperation, ? extends OfferOperation, ? extends OpaqueActionOperation, ? extends TokenOperation, ? extends TraceOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void main(final List<InputValue> inputValues) {
    this.alg.$(this.obj).initialize(inputValues);
    this.alg.$(this.obj).run();
  }
  
  @Override
  public void initialize(final List<InputValue> inputValues) {
    final Consumer<Variable> _function = (Variable v) -> {
      v.setCurrentValue(v.getInitialValue());
    };
    this.obj.getLocals().forEach(_function);
    if (inputValues!=null) {
      final Consumer<InputValue> _function_1 = (InputValue v) -> {
        Variable _variable = v.getVariable();
        _variable.setCurrentValue(v.getValue());
      };
      inputValues.forEach(_function_1);
    }
    this.obj.setTrace(ActivitydiagramFactory.eINSTANCE.createTrace());
  }
  
  @Override
  public void run() {
    final Consumer<ActivityNode> _function = (ActivityNode n) -> {
      this.alg.$(n).run();
    };
    this.obj.getNodes().forEach(_function);
    this.alg.$(this.obj).fireInitialNode();
    List<ActivityNode> enabled = this.alg.$(this.obj).getEnabledNodes();
    while ((!enabled.isEmpty())) {
      {
        this.alg.$(this.obj).fireNode(IterableExtensions.<ActivityNode>head(enabled));
        enabled = this.alg.$(this.obj).getEnabledNodes();
      }
    }
  }
  
  @Override
  public List<ActivityNode> getEnabledNodes() {
    final Function1<ActivityNode, Boolean> _function = (ActivityNode n) -> {
      return Boolean.valueOf(this.alg.$(n).isReady());
    };
    return IterableExtensions.<ActivityNode>toList(IterableExtensions.<ActivityNode>filter(this.obj.getNodes(), _function));
  }
  
  @Override
  public void fireNode(final ActivityNode node) {
    this.alg.$(node).fire(this.alg.$(node).takeOfferedTokens());
    EList<ActivityNode> _executedNodes = this.obj.getTrace().getExecutedNodes();
    _executedNodes.add(node);
  }
  
  @Override
  public void fireInitialNode() {
    this.alg.$(this.obj).fireNode(this.alg.$(this.obj).getInitialNode());
  }
  
  @Override
  public InitialNode getInitialNode() {
    return IterableExtensions.<InitialNode>head(Iterables.<InitialNode>filter(this.obj.getNodes(), InitialNode.class));
  }
  
  @Override
  public void terminate() {
    final Consumer<ActivityNode> _function = (ActivityNode n) -> {
      this.alg.$(n).terminate();
    };
    this.obj.getNodes().forEach(_function);
  }
}
