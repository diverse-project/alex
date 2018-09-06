package prettyprint1.revisitor.impl;

import prettyprint1.revisitor.operations.prettyprint1.ExpOperation;
import prettyprint1.revisitor.operations.prettyprint1.LitValOperation;
import prettyprint1.revisitor.operations.prettyprint1.SumOperation;
import prettyprint1.revisitor.operations.prettyprint1.VarLitOperation;
import tel0.model.tel0.LitVal;
import tel0.model.tel0.Sum;
import tel1.model.tel1.VarLit;
import tel1.revisitor.Tel1Revisitor;

@SuppressWarnings("all")
public interface Prettyprint1Revisitor extends Tel1Revisitor<ExpOperation, LitValOperation, SumOperation, VarLitOperation> {
  @Override
  public default LitValOperation tel0__LitVal(final LitVal it) {
    return new prettyprint1.revisitor.operations.prettyprint1.impl.LitValOperationImpl(it, this);
  }
  
  @Override
  public default SumOperation tel0__Sum(final Sum it) {
    return new prettyprint1.revisitor.operations.prettyprint1.impl.SumOperationImpl(it, this);
  }
  
  @Override
  public default VarLitOperation tel1__VarLit(final VarLit it) {
    return new prettyprint1.revisitor.operations.prettyprint1.impl.VarLitOperationImpl(it, this);
  }
}
