package activitydiagram.revisitor;

public interface ActivitydiagramRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT, Activitydiagram__BooleanBinaryExpressionT extends Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanExpressionT extends Activitydiagram__ExpressionT, Activitydiagram__BooleanUnaryExpressionT extends Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ControlTokenT extends Activitydiagram__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkedTokenT extends Activitydiagram__TokenT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerCalculationExpressionT extends Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerComparisonExpressionT extends Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerExpressionT extends Activitydiagram__ExpressionT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedElementT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT> {
	Activitydiagram__ActivityT activitydiagram__Activity(final activitydiagram.Activity it);
	Activitydiagram__ActivityFinalNodeT activitydiagram__ActivityFinalNode(final activitydiagram.ActivityFinalNode it);
	Activitydiagram__BooleanBinaryExpressionT activitydiagram__BooleanBinaryExpression(final activitydiagram.BooleanBinaryExpression it);
	Activitydiagram__BooleanUnaryExpressionT activitydiagram__BooleanUnaryExpression(final activitydiagram.BooleanUnaryExpression it);
	Activitydiagram__BooleanValueT activitydiagram__BooleanValue(final activitydiagram.BooleanValue it);
	Activitydiagram__BooleanVariableT activitydiagram__BooleanVariable(final activitydiagram.BooleanVariable it);
	Activitydiagram__ControlFlowT activitydiagram__ControlFlow(final activitydiagram.ControlFlow it);
	Activitydiagram__ControlTokenT activitydiagram__ControlToken(final activitydiagram.ControlToken it);
	Activitydiagram__DecisionNodeT activitydiagram__DecisionNode(final activitydiagram.DecisionNode it);
	Activitydiagram__ForkNodeT activitydiagram__ForkNode(final activitydiagram.ForkNode it);
	Activitydiagram__ForkedTokenT activitydiagram__ForkedToken(final activitydiagram.ForkedToken it);
	Activitydiagram__InitialNodeT activitydiagram__InitialNode(final activitydiagram.InitialNode it);
	Activitydiagram__InputT activitydiagram__Input(final activitydiagram.Input it);
	Activitydiagram__InputValueT activitydiagram__InputValue(final activitydiagram.InputValue it);
	Activitydiagram__IntegerCalculationExpressionT activitydiagram__IntegerCalculationExpression(final activitydiagram.IntegerCalculationExpression it);
	Activitydiagram__IntegerComparisonExpressionT activitydiagram__IntegerComparisonExpression(final activitydiagram.IntegerComparisonExpression it);
	Activitydiagram__IntegerValueT activitydiagram__IntegerValue(final activitydiagram.IntegerValue it);
	Activitydiagram__IntegerVariableT activitydiagram__IntegerVariable(final activitydiagram.IntegerVariable it);
	Activitydiagram__JoinNodeT activitydiagram__JoinNode(final activitydiagram.JoinNode it);
	Activitydiagram__MergeNodeT activitydiagram__MergeNode(final activitydiagram.MergeNode it);
	Activitydiagram__OfferT activitydiagram__Offer(final activitydiagram.Offer it);
	Activitydiagram__OpaqueActionT activitydiagram__OpaqueAction(final activitydiagram.OpaqueAction it);
	Activitydiagram__TraceT activitydiagram__Trace(final activitydiagram.Trace it);

	default Activitydiagram__ActionT $(final activitydiagram.Action it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ActivityT $(final activitydiagram.Activity it) {
		return activitydiagram__Activity(it);
	}
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge it) {
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return activitydiagram__ControlFlow((activitydiagram.ControlFlow) it);
		return null;
	}
	default Activitydiagram__ActivityFinalNodeT $(final activitydiagram.ActivityFinalNode it) {
		return activitydiagram__ActivityFinalNode(it);
	}
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__BooleanBinaryExpressionT $(final activitydiagram.BooleanBinaryExpression it) {
		return activitydiagram__BooleanBinaryExpression(it);
	}
	default Activitydiagram__BooleanExpressionT $(final activitydiagram.BooleanExpression it) {
		if (it.getClass() == activitydiagram.impl.BooleanBinaryExpressionImpl.class)
			return activitydiagram__BooleanBinaryExpression((activitydiagram.BooleanBinaryExpression) it);
		if (it.getClass() == activitydiagram.impl.BooleanUnaryExpressionImpl.class)
			return activitydiagram__BooleanUnaryExpression((activitydiagram.BooleanUnaryExpression) it);
		return null;
	}
	default Activitydiagram__BooleanUnaryExpressionT $(final activitydiagram.BooleanUnaryExpression it) {
		return activitydiagram__BooleanUnaryExpression(it);
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it) {
		return activitydiagram__BooleanValue(it);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it) {
		return activitydiagram__BooleanVariable(it);
	}
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow it) {
		return activitydiagram__ControlFlow(it);
	}
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		return null;
	}
	default Activitydiagram__ControlTokenT $(final activitydiagram.ControlToken it) {
		return activitydiagram__ControlToken(it);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode it) {
		return activitydiagram__DecisionNode(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression it) {
		if (it.getClass() == activitydiagram.impl.BooleanBinaryExpressionImpl.class)
			return activitydiagram__BooleanBinaryExpression((activitydiagram.BooleanBinaryExpression) it);
		if (it.getClass() == activitydiagram.impl.BooleanUnaryExpressionImpl.class)
			return activitydiagram__BooleanUnaryExpression((activitydiagram.BooleanUnaryExpression) it);
		if (it.getClass() == activitydiagram.impl.IntegerCalculationExpressionImpl.class)
			return activitydiagram__IntegerCalculationExpression((activitydiagram.IntegerCalculationExpression) it);
		if (it.getClass() == activitydiagram.impl.IntegerComparisonExpressionImpl.class)
			return activitydiagram__IntegerComparisonExpression((activitydiagram.IntegerComparisonExpression) it);
		return null;
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode it) {
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		return null;
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode it) {
		return activitydiagram__ForkNode(it);
	}
	default Activitydiagram__ForkedTokenT $(final activitydiagram.ForkedToken it) {
		return activitydiagram__ForkedToken(it);
	}
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode it) {
		return activitydiagram__InitialNode(it);
	}
	default Activitydiagram__InputT $(final activitydiagram.Input it) {
		return activitydiagram__Input(it);
	}
	default Activitydiagram__InputValueT $(final activitydiagram.InputValue it) {
		return activitydiagram__InputValue(it);
	}
	default Activitydiagram__IntegerCalculationExpressionT $(final activitydiagram.IntegerCalculationExpression it) {
		return activitydiagram__IntegerCalculationExpression(it);
	}
	default Activitydiagram__IntegerComparisonExpressionT $(final activitydiagram.IntegerComparisonExpression it) {
		return activitydiagram__IntegerComparisonExpression(it);
	}
	default Activitydiagram__IntegerExpressionT $(final activitydiagram.IntegerExpression it) {
		if (it.getClass() == activitydiagram.impl.IntegerCalculationExpressionImpl.class)
			return activitydiagram__IntegerCalculationExpression((activitydiagram.IntegerCalculationExpression) it);
		if (it.getClass() == activitydiagram.impl.IntegerComparisonExpressionImpl.class)
			return activitydiagram__IntegerComparisonExpression((activitydiagram.IntegerComparisonExpression) it);
		return null;
	}
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue it) {
		return activitydiagram__IntegerValue(it);
	}
	default Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable it) {
		return activitydiagram__IntegerVariable(it);
	}
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode it) {
		return activitydiagram__JoinNode(it);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode it) {
		return activitydiagram__MergeNode(it);
	}
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement it) {
		if (it.getClass() == activitydiagram.impl.ActivityImpl.class)
			return activitydiagram__Activity((activitydiagram.Activity) it);
		if (it.getClass() == activitydiagram.impl.ActivityFinalNodeImpl.class)
			return activitydiagram__ActivityFinalNode((activitydiagram.ActivityFinalNode) it);
		if (it.getClass() == activitydiagram.impl.ControlFlowImpl.class)
			return activitydiagram__ControlFlow((activitydiagram.ControlFlow) it);
		if (it.getClass() == activitydiagram.impl.DecisionNodeImpl.class)
			return activitydiagram__DecisionNode((activitydiagram.DecisionNode) it);
		if (it.getClass() == activitydiagram.impl.ForkNodeImpl.class)
			return activitydiagram__ForkNode((activitydiagram.ForkNode) it);
		if (it.getClass() == activitydiagram.impl.InitialNodeImpl.class)
			return activitydiagram__InitialNode((activitydiagram.InitialNode) it);
		if (it.getClass() == activitydiagram.impl.JoinNodeImpl.class)
			return activitydiagram__JoinNode((activitydiagram.JoinNode) it);
		if (it.getClass() == activitydiagram.impl.MergeNodeImpl.class)
			return activitydiagram__MergeNode((activitydiagram.MergeNode) it);
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	default Activitydiagram__OfferT $(final activitydiagram.Offer it) {
		return activitydiagram__Offer(it);
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return activitydiagram__OpaqueAction(it);
	}
	default Activitydiagram__TokenT $(final activitydiagram.Token it) {
		if (it.getClass() == activitydiagram.impl.ControlTokenImpl.class)
			return activitydiagram__ControlToken((activitydiagram.ControlToken) it);
		if (it.getClass() == activitydiagram.impl.ForkedTokenImpl.class)
			return activitydiagram__ForkedToken((activitydiagram.ForkedToken) it);
		return null;
	}
	default Activitydiagram__TraceT $(final activitydiagram.Trace it) {
		return activitydiagram__Trace(it);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value it) {
		if (it.getClass() == activitydiagram.impl.BooleanValueImpl.class)
			return activitydiagram__BooleanValue((activitydiagram.BooleanValue) it);
		if (it.getClass() == activitydiagram.impl.IntegerValueImpl.class)
			return activitydiagram__IntegerValue((activitydiagram.IntegerValue) it);
		return null;
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable it) {
		if (it.getClass() == activitydiagram.impl.BooleanVariableImpl.class)
			return activitydiagram__BooleanVariable((activitydiagram.BooleanVariable) it);
		if (it.getClass() == activitydiagram.impl.IntegerVariableImpl.class)
			return activitydiagram__IntegerVariable((activitydiagram.IntegerVariable) it);
		return null;
	}
}
