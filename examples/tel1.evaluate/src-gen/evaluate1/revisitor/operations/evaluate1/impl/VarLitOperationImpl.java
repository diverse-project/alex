package evaluate1.revisitor.operations.evaluate1.impl;

import evaluate1.revisitor.operations.evaluate1.ExpOperation;
import evaluate1.revisitor.operations.evaluate1.LitValOperation;
import evaluate1.revisitor.operations.evaluate1.SumOperation;
import evaluate1.revisitor.operations.evaluate1.VarLitOperation;
import tel1.evaluate.Ctx;
import tel1.model.tel1.VarLit;
import tel1.revisitor.Tel1Revisitor;

@SuppressWarnings("all")
public class VarLitOperationImpl implements VarLitOperation {
  private VarLit obj;
  
  private Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg;
  
  public VarLitOperationImpl(final VarLit obj, final Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public long eval(final Ctx ctx) {
    return (ctx.ctx.get(this.obj.getName())).longValue();
  }
  
  @Override
  public long eval() {
    throw new RuntimeException("Cannot be called without a context");
  }
}
