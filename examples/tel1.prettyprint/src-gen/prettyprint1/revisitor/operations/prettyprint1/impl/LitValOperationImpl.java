package prettyprint1.revisitor.operations.prettyprint1.impl;

import prettyprint1.revisitor.operations.prettyprint1.ExpOperation;
import prettyprint1.revisitor.operations.prettyprint1.LitValOperation;
import prettyprint1.revisitor.operations.prettyprint1.SumOperation;
import prettyprint1.revisitor.operations.prettyprint1.VarLitOperation;
import tel0.model.tel0.LitVal;
import tel1.revisitor.Tel1Revisitor;

@SuppressWarnings("all")
public class LitValOperationImpl extends prettyprint.revisitor.operations.prettyprint.impl.LitValOperationImpl implements LitValOperation {
  private LitVal obj;
  
  private Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg;
  
  public LitValOperationImpl(final LitVal obj, final Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
