package execad.revisitor.operations.execad;

import execad.revisitor.operations.execad.ExpressionOperation;
import execad.revisitor.operations.execad.IntegerExpressionOperation;

@SuppressWarnings("all")
public interface IntegerComparisonExpressionOperation extends IntegerExpressionOperation, ExpressionOperation {
  public abstract void execute();
}
