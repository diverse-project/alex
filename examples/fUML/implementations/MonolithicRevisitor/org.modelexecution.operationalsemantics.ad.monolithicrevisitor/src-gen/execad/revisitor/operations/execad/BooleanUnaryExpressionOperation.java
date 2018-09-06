package execad.revisitor.operations.execad;

import execad.revisitor.operations.execad.BooleanExpressionOperation;
import execad.revisitor.operations.execad.ExpressionOperation;

@SuppressWarnings("all")
public interface BooleanUnaryExpressionOperation extends BooleanExpressionOperation, ExpressionOperation {
  public abstract void execute();
}
