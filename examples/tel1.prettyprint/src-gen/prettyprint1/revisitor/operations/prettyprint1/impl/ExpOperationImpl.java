package prettyprint1.revisitor.operations.prettyprint1.impl;

import prettyprint1.revisitor.operations.prettyprint1.ExpOperation;
import prettyprint1.revisitor.operations.prettyprint1.LitValOperation;
import prettyprint1.revisitor.operations.prettyprint1.SumOperation;
import prettyprint1.revisitor.operations.prettyprint1.VarLitOperation;
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
