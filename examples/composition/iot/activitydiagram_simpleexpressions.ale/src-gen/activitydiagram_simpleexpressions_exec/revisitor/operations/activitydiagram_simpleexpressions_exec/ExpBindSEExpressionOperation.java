package activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec;

import activitydiagram.Context;
import activitydiagram_simpleexpressions_exec.revisitor.operations.activitydiagram_simpleexpressions_exec.ExpOperation;

@SuppressWarnings("all")
public interface ExpBindSEExpressionOperation extends ExpOperation, activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpOperation {
  public abstract void execute(final Context c);
}
