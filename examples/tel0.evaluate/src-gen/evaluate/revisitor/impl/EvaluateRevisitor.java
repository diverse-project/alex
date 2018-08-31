package evaluate.revisitor.impl;

import evaluate.revisitor.operations.evaluate.ExpOperation;
import evaluate.revisitor.operations.evaluate.LitValOperation;
import evaluate.revisitor.operations.evaluate.SumOperation;
import tel0.model.tel0.LitVal;
import tel0.model.tel0.Sum;
import tel0.revisitor.Tel0Revisitor;

@SuppressWarnings("all")
public interface EvaluateRevisitor extends Tel0Revisitor<ExpOperation, LitValOperation, SumOperation> {
  @Override
  public default LitValOperation tel0__LitVal(final LitVal it) {
    return new evaluate.revisitor.operations.evaluate.impl.LitValOperationImpl(it, this);
  }
  
  @Override
  public default SumOperation tel0__Sum(final Sum it) {
    return new evaluate.revisitor.operations.evaluate.impl.SumOperationImpl(it, this);
  }
}
