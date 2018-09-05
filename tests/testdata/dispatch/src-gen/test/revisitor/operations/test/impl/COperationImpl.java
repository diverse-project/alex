package test.revisitor.operations.test.impl;

import dispatch.C;
import test.revisitor.operations.test.COperation;
import test.revisitor.operations.test.impl.AOperationImpl;

@SuppressWarnings("all")
public class COperationImpl extends AOperationImpl implements COperation {
  private C obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public COperationImpl(final C obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
