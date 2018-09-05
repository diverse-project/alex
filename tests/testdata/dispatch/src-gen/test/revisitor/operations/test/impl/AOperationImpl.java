package test.revisitor.operations.test.impl;

import dispatch.A;
import test.revisitor.operations.test.AOperation;

@SuppressWarnings("all")
public class AOperationImpl implements AOperation {
  private A obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public AOperationImpl(final A obj, final dispatch.revisitor.DispatchRevisitor alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
