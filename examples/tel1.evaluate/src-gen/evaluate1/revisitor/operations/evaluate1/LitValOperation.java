package evaluate1.revisitor.operations.evaluate1;

import evaluate.revisitor.operations.evaluate.ExpOperation;
import tel1.evaluate.Ctx;

@SuppressWarnings("all")
public interface LitValOperation extends evaluate.revisitor.operations.evaluate.LitValOperation, ExpOperation, evaluate1.revisitor.operations.evaluate1.ExpOperation {
  public abstract long eval(final Ctx ctx);
}
