package test.revisitor.operations.test.impl;

import dispatch.D;
import test.revisitor.operations.test.DOperation;
import test.revisitor.operations.test.impl.BOperationImpl;

@SuppressWarnings("all")
public class DOperationImpl extends BOperationImpl implements DOperation {
  private D obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public DOperationImpl(final D obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
