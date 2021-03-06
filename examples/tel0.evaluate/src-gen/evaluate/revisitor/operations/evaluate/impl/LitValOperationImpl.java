package evaluate.revisitor.operations.evaluate.impl;

import evaluate.revisitor.operations.evaluate.ExpOperation;
import evaluate.revisitor.operations.evaluate.LitValOperation;
import evaluate.revisitor.operations.evaluate.SumOperation;
import evaluate.revisitor.operations.evaluate.impl.ExpOperationImpl;
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
  public long eval() {
    return this.obj.getValue();
  }
}
