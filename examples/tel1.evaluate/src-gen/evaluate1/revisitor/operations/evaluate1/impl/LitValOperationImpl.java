package evaluate1.revisitor.operations.evaluate1.impl;

import evaluate1.revisitor.operations.evaluate1.ExpOperation;
import evaluate1.revisitor.operations.evaluate1.LitValOperation;
import evaluate1.revisitor.operations.evaluate1.SumOperation;
import evaluate1.revisitor.operations.evaluate1.VarLitOperation;
import tel0.model.tel0.LitVal;
import tel1.evaluate.Ctx;
import tel1.revisitor.Tel1Revisitor;

@SuppressWarnings("all")
public class LitValOperationImpl extends evaluate.revisitor.operations.evaluate.impl.LitValOperationImpl implements LitValOperation {
  private LitVal obj;
  
  private Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg;
  
  public LitValOperationImpl(final LitVal obj, final Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public long eval(final Ctx ctx) {
    return this.eval();
  }
}
