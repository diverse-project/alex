package evaluate1.revisitor.operations.evaluate1;

import tel1.evaluate.Ctx;

@SuppressWarnings("all")
public interface ExpOperation extends evaluate.revisitor.operations.evaluate.ExpOperation {
  public abstract long eval(final Ctx ctx);
}
