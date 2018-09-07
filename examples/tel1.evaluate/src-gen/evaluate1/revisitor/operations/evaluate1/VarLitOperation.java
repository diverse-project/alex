package evaluate1.revisitor.operations.evaluate1;

import evaluate1.revisitor.operations.evaluate1.ExpOperation;
import tel1.evaluate.Ctx;

@SuppressWarnings("all")
public interface VarLitOperation extends ExpOperation, evaluate.revisitor.operations.evaluate.ExpOperation {
  public abstract long eval(final Ctx ctx);
  
  public abstract long eval();
}
