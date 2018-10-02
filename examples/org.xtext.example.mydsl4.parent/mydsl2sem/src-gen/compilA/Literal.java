package compilA;

import compilA.Expression;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Literal extends EObject, Expression {
  public abstract void setValue(final long value);
  
  public abstract long getValue();
  
  public abstract long eval();
}
