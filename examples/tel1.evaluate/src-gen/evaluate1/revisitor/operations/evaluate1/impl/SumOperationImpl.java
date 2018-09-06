package evaluate1.revisitor.operations.evaluate1.impl;

import evaluate1.revisitor.operations.evaluate1.ExpOperation;
import evaluate1.revisitor.operations.evaluate1.LitValOperation;
import evaluate1.revisitor.operations.evaluate1.SumOperation;
import evaluate1.revisitor.operations.evaluate1.VarLitOperation;
import tel0.model.tel0.Sum;
import tel1.evaluate.Ctx;
import tel1.revisitor.Tel1Revisitor;

@SuppressWarnings("all")
public class SumOperationImpl extends evaluate.revisitor.operations.evaluate.impl.SumOperationImpl implements SumOperation {
  private Sum obj;
  
  private Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg;
  
  public SumOperationImpl(final Sum obj, final Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public long eval(final Ctx ctx) {
    long _eval = this.alg.$(this.obj.getLhs()).eval(ctx);
    long _eval_1 = this.alg.$(this.obj.getRhs()).eval(ctx);
    return (_eval + _eval_1);
  }
}
