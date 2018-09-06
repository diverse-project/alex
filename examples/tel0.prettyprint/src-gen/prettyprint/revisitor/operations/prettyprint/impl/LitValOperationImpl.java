package prettyprint.revisitor.operations.prettyprint.impl;

import prettyprint.revisitor.operations.prettyprint.ExpOperation;
import prettyprint.revisitor.operations.prettyprint.LitValOperation;
import prettyprint.revisitor.operations.prettyprint.SumOperation;
import prettyprint.revisitor.operations.prettyprint.impl.ExpOperationImpl;
import tel0.model.tel0.LitVal;
import tel0.revisitor.Tel0Revisitor;

@SuppressWarnings("all")
public class LitValOperationImpl extends ExpOperationImpl implements LitValOperation {
  private LitVal obj;
  
  private Tel0Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation> alg;
  
  public LitValOperationImpl(final LitVal obj, final Tel0Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    return Long.valueOf(this.obj.getValue()).toString();
  }
}
