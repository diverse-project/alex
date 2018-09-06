package test.revisitor.operations.test.impl;

import dispatch.E;
import test.revisitor.operations.test.EOperation;
import test.revisitor.operations.test.impl.BOperationImpl;

@SuppressWarnings("all")
public class EOperationImpl extends BOperationImpl implements EOperation {
  private E obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public EOperationImpl(final E obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
