package test.revisitor.operations.test.impl;

import dispatch.B;
import test.revisitor.operations.test.BOperation;
import test.revisitor.operations.test.impl.AOperationImpl;

@SuppressWarnings("all")
public class BOperationImpl extends AOperationImpl implements BOperation {
  private B obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public BOperationImpl(final B obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
