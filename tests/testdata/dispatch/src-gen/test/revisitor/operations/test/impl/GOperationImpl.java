package test.revisitor.operations.test.impl;

import dispatch.G;
import test.revisitor.operations.test.GOperation;
import test.revisitor.operations.test.impl.COperationImpl;

@SuppressWarnings("all")
public class GOperationImpl extends COperationImpl implements GOperation {
  private G obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public GOperationImpl(final G obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
