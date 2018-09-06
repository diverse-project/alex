package activitydiagramruntime.revisitor;

public interface ActivitydiagramruntimeRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedActivityT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedActivityT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedActivityT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Activitydiagram__ContextT, Activitydiagramruntime__ContextT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ControlTokenT extends Activitydiagram__TokenT, Activitydiagramruntime__ControlTokenT extends Activitydiagramruntime__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkedTokenT extends Activitydiagram__TokenT, Activitydiagramruntime__ForkedTokenT extends Activitydiagramruntime__TokenT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedActivityT, Activitydiagram__OfferT, Activitydiagramruntime__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Activitydiagram__TokenT, Activitydiagramruntime__TokenT, Activitydiagram__TraceT, Activitydiagramruntime__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT>
	extends activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ContextT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__ControlTokenT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__ForkedTokenT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedActivityT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT> {
	Activitydiagramruntime__ContextT activitydiagramruntime__Context(final activitydiagramruntime.Context it);
	Activitydiagramruntime__ControlTokenT activitydiagramruntime__ControlToken(final activitydiagramruntime.ControlToken it);
	Activitydiagramruntime__ForkedTokenT activitydiagramruntime__ForkedToken(final activitydiagramruntime.ForkedToken it);
	Activitydiagramruntime__OfferT activitydiagramruntime__Offer(final activitydiagramruntime.Offer it);
	Activitydiagramruntime__TraceT activitydiagramruntime__Trace(final activitydiagramruntime.Trace it);

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
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue it) {
		return activitydiagram__BooleanValue(it);
	}
	Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable it);
	default Activitydiagram__ContextT $(final activitydiagram.Context it) {
		return activitydiagram__Context(it);
	}
	default Activitydiagramruntime__ContextT $(final activitydiagramruntime.Context it) {
		return activitydiagramruntime__Context(it);
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
	default Activitydiagramruntime__ControlTokenT $(final activitydiagramruntime.ControlToken it) {
		return activitydiagramruntime__ControlToken(it);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode it) {
		return activitydiagram__DecisionNode(it);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode it) {
		if (it.getClass() == activitydiagram.impl.OpaqueActionImpl.class)
			return activitydiagram__OpaqueAction((activitydiagram.OpaqueAction) it);
		return null;
	}
	Activitydiagram__ExpT $(final activitydiagram.Exp it);
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
	default Activitydiagramruntime__ForkedTokenT $(final activitydiagramruntime.ForkedToken it) {
		return activitydiagramruntime__ForkedToken(it);
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
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue it) {
		return activitydiagram__IntegerValue(it);
	}
	Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable it);
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode it) {
		return activitydiagram__JoinNode(it);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode it) {
		return activitydiagram__MergeNode(it);
	}
	default Activitydiagram__NamedActivityT $(final activitydiagram.NamedActivity it) {
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
	default Activitydiagramruntime__OfferT $(final activitydiagramruntime.Offer it) {
		return activitydiagramruntime__Offer(it);
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction it) {
		return activitydiagram__OpaqueAction(it);
	}
	default Activitydiagram__TokenT $(final activitydiagram.Token it) {
		if (it.getClass() == activitydiagram.impl.ControlTokenImpl.class)
			return activitydiagram__ControlToken((activitydiagram.ControlToken) it);
		if (it.getClass() == activitydiagram.impl.ForkedTokenImpl.class)
			return activitydiagram__ForkedToken((activitydiagram.ForkedToken) it);
		return activitydiagram__Token(it);
	}
	default Activitydiagramruntime__TokenT $(final activitydiagramruntime.Token it) {
		if (it.getClass() == activitydiagramruntime.impl.ControlTokenImpl.class)
			return activitydiagramruntime__ControlToken((activitydiagramruntime.ControlToken) it);
		if (it.getClass() == activitydiagramruntime.impl.ForkedTokenImpl.class)
			return activitydiagramruntime__ForkedToken((activitydiagramruntime.ForkedToken) it);
		return null;
	}
	default Activitydiagram__TraceT $(final activitydiagram.Trace it) {
		return activitydiagram__Trace(it);
	}
	default Activitydiagramruntime__TraceT $(final activitydiagramruntime.Trace it) {
		return activitydiagramruntime__Trace(it);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value it) {
		if (it.getClass() == activitydiagram.impl.BooleanValueImpl.class)
			return activitydiagram__BooleanValue((activitydiagram.BooleanValue) it);
		if (it.getClass() == activitydiagram.impl.IntegerValueImpl.class)
			return activitydiagram__IntegerValue((activitydiagram.IntegerValue) it);
		return null;
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable it) {
		return null;
	}
}
