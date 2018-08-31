package prettyprint.revisitor.operations.prettyprint.impl;

import prettyprint.revisitor.operations.prettyprint.ExpOperation;
import prettyprint.revisitor.operations.prettyprint.LitValOperation;
import prettyprint.revisitor.operations.prettyprint.SumOperation;
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
