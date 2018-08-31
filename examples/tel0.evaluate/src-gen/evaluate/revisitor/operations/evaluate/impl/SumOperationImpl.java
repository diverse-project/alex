package evaluate.revisitor.operations.evaluate.impl;

import evaluate.revisitor.operations.evaluate.ExpOperation;
import evaluate.revisitor.operations.evaluate.LitValOperation;
import evaluate.revisitor.operations.evaluate.SumOperation;
import tel0.model.tel0.Sum;
import tel0.revisitor.Tel0Revisitor;

@SuppressWarnings("all")
public class SumOperationImpl implements SumOperation {
  private Sum obj;
  
  private Tel0Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation> alg;
  
  public SumOperationImpl(final Sum obj, final Tel0Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public long eval() {
    long _eval = this.alg.$(this.obj.getLhs()).eval();
    long _eval_1 = this.alg.$(this.obj.getRhs()).eval();
    return (_eval + _eval_1);
  }
}
