package prettyprint.revisitor.impl;

import prettyprint.revisitor.operations.prettyprint.ExpOperation;
import prettyprint.revisitor.operations.prettyprint.LitValOperation;
import prettyprint.revisitor.operations.prettyprint.SumOperation;
import tel0.model.tel0.LitVal;
import tel0.model.tel0.Sum;
import tel0.revisitor.Tel0Revisitor;

@SuppressWarnings("all")
public interface PrettyprintRevisitor extends Tel0Revisitor<ExpOperation, LitValOperation, SumOperation> {
  @Override
  public default LitValOperation tel0__LitVal(final LitVal it) {
    return new prettyprint.revisitor.operations.prettyprint.impl.LitValOperationImpl(it, this);
  }
  
  @Override
  public default SumOperation tel0__Sum(final Sum it) {
    return new prettyprint.revisitor.operations.prettyprint.impl.SumOperationImpl(it, this);
  }
}
