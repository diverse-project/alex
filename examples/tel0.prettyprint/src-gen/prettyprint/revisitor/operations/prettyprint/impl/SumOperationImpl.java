package prettyprint.revisitor.operations.prettyprint.impl;

import prettyprint.revisitor.operations.prettyprint.ExpOperation;
import prettyprint.revisitor.operations.prettyprint.LitValOperation;
import prettyprint.revisitor.operations.prettyprint.SumOperation;
import prettyprint.revisitor.operations.prettyprint.impl.ExpOperationImpl;
import tel0.model.tel0.Sum;
import tel0.revisitor.Tel0Revisitor;

@SuppressWarnings("all")
public class SumOperationImpl extends ExpOperationImpl implements SumOperation {
  private Sum obj;
  
  private Tel0Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation> alg;
  
  public SumOperationImpl(final Sum obj, final Tel0Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.$(this.obj.getLhs()).print();
    String _plus = (_print + " + ");
    String _print_1 = this.alg.$(this.obj.getRhs()).print();
    return (_plus + _print_1);
  }
}
