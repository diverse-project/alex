package test.revisitor.operations.test.impl;

import dispatch.Container;
import test.revisitor.operations.test.ContainerOperation;

@SuppressWarnings("all")
public class ContainerOperationImpl implements ContainerOperation {
  private Container obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public ContainerOperationImpl(final Container obj, final dispatch.revisitor.DispatchRevisitor alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
