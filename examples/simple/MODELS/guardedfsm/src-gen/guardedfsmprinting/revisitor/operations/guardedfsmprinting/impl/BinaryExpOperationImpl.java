package guardedfsmprinting.revisitor.operations.guardedfsmprinting.impl;

import boolexp.BinaryExp;
import guardedfsm.revisitor.GuardedfsmRevisitor;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.AndOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.BinaryExpOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.ExpOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.FalsOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.FinalStateOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.GuardedOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.LitOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.MachineOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.OrOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.StateOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.TransitionOperation;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.TruOperation;

@SuppressWarnings("all")
public abstract class BinaryExpOperationImpl extends printexp.revisitor.operations.printexp.impl.BinaryExpOperationImpl implements BinaryExpOperation {
  private BinaryExp obj;
  
  private GuardedfsmRevisitor<? extends AndOperation, ? extends BinaryExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends FinalStateOperation, ? extends GuardedOperation, ? extends LitOperation, ? extends MachineOperation, ? extends OrOperation, ? extends StateOperation, ? extends TransitionOperation, ? extends TruOperation> alg;
  
  public BinaryExpOperationImpl(final BinaryExp obj, final GuardedfsmRevisitor<? extends AndOperation, ? extends BinaryExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends FinalStateOperation, ? extends GuardedOperation, ? extends LitOperation, ? extends MachineOperation, ? extends OrOperation, ? extends StateOperation, ? extends TransitionOperation, ? extends TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
