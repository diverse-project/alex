package execad.revisitor.operations.execad;

import activitydiagram.Variable;
import execad.revisitor.operations.execad.ExpressionOperation;

@SuppressWarnings("all")
public interface IntegerExpressionOperation extends ExpressionOperation {
  public abstract int getCurrentValue(final Variable variable);
}
