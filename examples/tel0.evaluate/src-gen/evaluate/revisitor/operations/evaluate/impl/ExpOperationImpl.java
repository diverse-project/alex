package evaluate.revisitor.operations.evaluate.impl;

import evaluate.revisitor.operations.evaluate.ExpOperation;
import evaluate.revisitor.operations.evaluate.LitValOperation;
import evaluate.revisitor.operations.evaluate.SumOperation;
import tel0.model.tel0.Exp;
import tel0.revisitor.Tel0Revisitor;

@SuppressWarnings("all")
public abstract class ExpOperationImpl implements ExpOperation {
  private Exp obj;
  
  private Tel0Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation> alg;
  
  public ExpOperationImpl(final Exp obj, final Tel0Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
