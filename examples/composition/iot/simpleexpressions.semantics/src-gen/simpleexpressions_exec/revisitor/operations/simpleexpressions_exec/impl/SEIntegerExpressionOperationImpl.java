package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import simpleexpressions.SEIntegerExpression;
import simpleexpressions.revisitor.SimpleexpressionsRevisitor;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanBinaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanUnaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEBooleanVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerCalculationExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerComparisonExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEIntegerVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.SEVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.SEExpressionOperationImpl;

@SuppressWarnings("all")
public abstract class SEIntegerExpressionOperationImpl extends SEExpressionOperationImpl implements SEIntegerExpressionOperation {
  private SEIntegerExpression obj;
  
  private SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg;
  
  public SEIntegerExpressionOperationImpl(final SEIntegerExpression obj, final SimpleexpressionsRevisitor<? extends SEBooleanBinaryExpressionOperation, ? extends SEBooleanExpressionOperation, ? extends SEBooleanUnaryExpressionOperation, ? extends SEBooleanValueOperation, ? extends SEBooleanVariableOperation, ? extends SEExpressionOperation, ? extends SEIntegerCalculationExpressionOperation, ? extends SEIntegerComparisonExpressionOperation, ? extends SEIntegerExpressionOperation, ? extends SEIntegerValueOperation, ? extends SEIntegerVariableOperation, ? extends SEValueOperation, ? extends SEVariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
