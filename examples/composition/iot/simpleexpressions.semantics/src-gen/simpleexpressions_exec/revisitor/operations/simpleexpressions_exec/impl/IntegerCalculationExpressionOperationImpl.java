package simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl;

import simpleexpressions.IntegerCalculationExpression;
import simpleexpressions.IntegerCalculationOperator;
import simpleexpressions.IntegerValue;
import simpleexpressions.Value;
import simpleexpressions.revisitor.SimpleexpressionsRevisitor;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanBinaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanUnaryExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.BooleanVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerCalculationExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerComparisonExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerExpressionOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.IntegerVariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.ValueOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.VariableOperation;
import simpleexpressions_exec.revisitor.operations.simpleexpressions_exec.impl.IntegerExpressionOperationImpl;

@SuppressWarnings("all")
public class IntegerCalculationExpressionOperationImpl extends IntegerExpressionOperationImpl implements IntegerCalculationExpressionOperation {
  private IntegerCalculationExpression obj;
  
  private SimpleexpressionsRevisitor<? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ExpressionOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends ValueOperation, ? extends VariableOperation> alg;
  
  public IntegerCalculationExpressionOperationImpl(final IntegerCalculationExpression obj, final SimpleexpressionsRevisitor<? extends BooleanBinaryExpressionOperation, ? extends BooleanExpressionOperation, ? extends BooleanUnaryExpressionOperation, ? extends BooleanValueOperation, ? extends BooleanVariableOperation, ? extends ExpressionOperation, ? extends IntegerCalculationExpressionOperation, ? extends IntegerComparisonExpressionOperation, ? extends IntegerExpressionOperation, ? extends IntegerValueOperation, ? extends IntegerVariableOperation, ? extends ValueOperation, ? extends VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute() {
    int _value = this.obj.getOperator().getValue();
    boolean _equals = (_value == IntegerCalculationOperator.ADD_VALUE);
    if (_equals) {
      Value _currentValue = this.obj.getAssignee().getCurrentValue();
      Value _currentValue_1 = this.obj.getOperand1().getCurrentValue();
      int _value_1 = ((IntegerValue) _currentValue_1).getValue();
      Value _currentValue_2 = this.obj.getOperand2().getCurrentValue();
      int _value_2 = ((IntegerValue) _currentValue_2).getValue();
      int _plus = (_value_1 + _value_2);
      ((IntegerValue) _currentValue).setValue(_plus);
    } else {
      int _value_3 = this.obj.getOperator().getValue();
      boolean _equals_1 = (_value_3 == IntegerCalculationOperator.SUBRACT_VALUE);
      if (_equals_1) {
        Value _currentValue_3 = this.obj.getAssignee().getCurrentValue();
        Value _currentValue_4 = this.obj.getOperand1().getCurrentValue();
        int _value_4 = ((IntegerValue) _currentValue_4).getValue();
        Value _currentValue_5 = this.obj.getOperand2().getCurrentValue();
        int _value_5 = ((IntegerValue) _currentValue_5).getValue();
        int _minus = (_value_4 - _value_5);
        ((IntegerValue) _currentValue_3).setValue(_minus);
      }
    }
  }
}
