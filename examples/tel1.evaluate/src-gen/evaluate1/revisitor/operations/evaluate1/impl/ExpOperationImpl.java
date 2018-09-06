package evaluate1.revisitor.operations.evaluate1.impl;

import evaluate1.revisitor.operations.evaluate1.ExpOperation;
import evaluate1.revisitor.operations.evaluate1.LitValOperation;
import evaluate1.revisitor.operations.evaluate1.SumOperation;
import evaluate1.revisitor.operations.evaluate1.VarLitOperation;
import tel0.model.tel0.Exp;
import tel1.revisitor.Tel1Revisitor;

@SuppressWarnings("all")
public abstract class ExpOperationImpl implements ExpOperation {
  private Exp obj;
  
  private Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg;
  
  public ExpOperationImpl(final Exp obj, final Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}
