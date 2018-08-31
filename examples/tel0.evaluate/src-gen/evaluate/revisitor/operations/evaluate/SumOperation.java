package evaluate.revisitor.operations.evaluate;

import evaluate.revisitor.operations.evaluate.ExpOperation;

@SuppressWarnings("all")
public interface SumOperation extends ExpOperation {
  public abstract long eval();
}
