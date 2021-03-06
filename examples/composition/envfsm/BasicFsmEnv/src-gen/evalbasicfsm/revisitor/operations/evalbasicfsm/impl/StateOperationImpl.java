package evalbasicfsm.revisitor.operations.evalbasicfsm.impl;

import basicFsmEnv.State;
import basicFsmEnv.Trans;
import basicFsmEnv.VarDecl;
import basicFsmEnv.revisitor.BasicFsmEnvRevisitor;
import basicFsmEnv.runtime.Context;
import com.google.common.base.Objects;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.InitialStateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.MachineOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.TransOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.VarDeclOperation;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State obj;
  
  private BasicFsmEnvRevisitor<? extends ActionOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg;
  
  public StateOperationImpl(final State obj, final BasicFsmEnvRevisitor<? extends ActionOperation, ? extends GuardOperation, ? extends InitialStateOperation, ? extends MachineOperation, ? extends StateOperation, ? extends TransOperation, ? extends VarDeclOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void step(final String event, final Context ctx) {
    ctx.visit(this.obj);
    final Consumer<VarDecl> _function = (VarDecl it) -> {
      this.alg.$(it).eval(ctx);
    };
    this.obj.getDecls().forEach(_function);
    final Function1<Trans, Boolean> _function_1 = (Trans it) -> {
      String _event = it.getEvent();
      return Boolean.valueOf(Objects.equal(event, _event));
    };
    final Trans next = IterableExtensions.<Trans>head(IterableExtensions.<Trans>filter(this.obj.getOut(), _function_1));
    if ((next == null)) {
      String _name = this.obj.getName();
      String _plus = ("Locked in " + _name);
      String _plus_1 = (_plus + " with ");
      String _plus_2 = (_plus_1 + event);
      throw new RuntimeException(_plus_2);
    }
    this.alg.$(next).fire(ctx);
  }
}
