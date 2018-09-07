package test.revisitor.operations.test.impl;

import dispatch.F;
import test.revisitor.operations.test.FOperation;
import test.revisitor.operations.test.impl.COperationImpl;

@SuppressWarnings("all")
public class FOperationImpl extends COperationImpl implements FOperation {
  private F obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public FOperationImpl(final F obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
