package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec;

import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerExpressionOperation;

@SuppressWarnings("all")
public interface SEIntegerComparisonExpressionOperation extends SEIntegerExpressionOperation, SEExpressionOperation {
  public abstract Object execute();
}
