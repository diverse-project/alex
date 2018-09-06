package test.revisitor.operations.test.impl;

import dispatch.J;
import test.revisitor.operations.test.JOperation;
import test.revisitor.operations.test.impl.HOperationImpl;

@SuppressWarnings("all")
public class JOperationImpl extends HOperationImpl implements JOperation {
  private J obj;
  
  private dispatch.revisitor.DispatchRevisitor alg;
  
  public JOperationImpl(final J obj, final dispatch.revisitor.DispatchRevisitor alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
