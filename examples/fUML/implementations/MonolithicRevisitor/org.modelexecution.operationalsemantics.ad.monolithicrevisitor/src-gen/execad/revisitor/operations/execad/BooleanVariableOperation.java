package execad.revisitor.operations.execad;

import activitydiagram.Value;
import execad.revisitor.operations.execad.VariableOperation;

@SuppressWarnings("all")
public interface BooleanVariableOperation extends VariableOperation {
  public abstract Value getCurrentValue();
  
  public abstract void setCurrentValue(final Value value);
}
