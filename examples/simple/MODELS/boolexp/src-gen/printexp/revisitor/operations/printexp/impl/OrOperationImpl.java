package printexp.revisitor.operations.printexp.impl;

import boolexp.Or;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.printexp.AndOperation;
import printexp.revisitor.operations.printexp.BinaryExpOperation;
import printexp.revisitor.operations.printexp.ExpOperation;
import printexp.revisitor.operations.printexp.FalsOperation;
import printexp.revisitor.operations.printexp.LitOperation;
import printexp.revisitor.operations.printexp.OrOperation;
import printexp.revisitor.operations.printexp.TruOperation;
import printexp.revisitor.operations.printexp.impl.BinaryExpOperationImpl;

@SuppressWarnings("all")
public class OrOperationImpl extends BinaryExpOperationImpl implements OrOperation {
  private Or obj;
  
  private BoolexpRevisitor<? extends AndOperation, ? extends BinaryExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends LitOperation, ? extends OrOperation, ? extends TruOperation> alg;
  
  public OrOperationImpl(final Or obj, final BoolexpRevisitor<? extends AndOperation, ? extends BinaryExpOperation, ? extends ExpOperation, ? extends FalsOperation, ? extends LitOperation, ? extends OrOperation, ? extends TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.$(this.obj.getLhs()).print();
    String _plus = ("(" + _print);
    String _plus_1 = (_plus + " \u2228 ");
    String _print_1 = this.alg.$(this.obj.getRhs()).print();
    String _plus_2 = (_plus_1 + _print_1);
    return (_plus_2 + ")");
  }
}
