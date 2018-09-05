package test.revisitor.operations.test.impl;

import dispatch.I;
import test.revisitor.operations.test.IOperation;
import test.revisitor.operations.test.impl.FOperationImpl;

@SuppressWarnings("all")
public class IOperationImpl extends FOperationImpl implements IOperation {
  private I obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public IOperationImpl(final I obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
