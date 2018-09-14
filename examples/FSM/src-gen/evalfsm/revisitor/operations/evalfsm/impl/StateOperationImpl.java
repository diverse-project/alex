package evalfsm.revisitor.operations.evalfsm.impl;

import com.google.common.base.Objects;
import evalfsm.revisitor.operations.evalfsm.FinalStateOperation;
import evalfsm.revisitor.operations.evalfsm.InitialStateOperation;
import evalfsm.revisitor.operations.evalfsm.MachineOperation;
import evalfsm.revisitor.operations.evalfsm.StateOperation;
import evalfsm.revisitor.operations.evalfsm.TransitionOperation;
import fsm.State;
import fsm.Transition;
import fsm.dyn.Context;
import fsm.revisitor.FsmRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State obj;
  
  private FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg;
  
  public StateOperationImpl(final State obj, final FsmRevisitor<? extends FinalStateOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void step(final String event, final Context ctx) {
    ctx.visit(this.obj);
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      String _event = t.getEvent();
      return Boolean.valueOf(Objects.equal(_event, event));
    };
    final Iterable<Transition> next = IterableExtensions.<Transition>filter(this.obj.getOutgoing(), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(next);
    if (_isEmpty) {
      String _name = this.obj.getName();
      String _plus = ("Locked in " + _name);
      String _plus_1 = (_plus + " with ");
      String _plus_2 = (_plus_1 + event);
      throw new RuntimeException(_plus_2);
    }
    int _size = IterableExtensions.size(next);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      String _name_1 = this.obj.getName();
      String _plus_3 = ("Indeterminacy in " + _name_1);
      String _plus_4 = (_plus_3 + " with ");
      String _plus_5 = (_plus_4 + event);
      throw new RuntimeException(_plus_5);
    }
    this.alg.$(IterableExtensions.<Transition>head(next)).fire(ctx);
  }
}
