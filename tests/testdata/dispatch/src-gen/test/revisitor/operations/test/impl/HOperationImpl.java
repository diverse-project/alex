package test.revisitor.operations.test.impl;

import dispatch.H;
import test.revisitor.operations.test.HOperation;
import test.revisitor.operations.test.impl.DOperationImpl;

@SuppressWarnings("all")
public class HOperationImpl extends DOperationImpl implements HOperation {
  private H obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public HOperationImpl(final H obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
