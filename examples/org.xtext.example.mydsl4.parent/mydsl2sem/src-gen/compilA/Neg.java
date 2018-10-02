package compilA;

import compilA.Expression;
import compilA.impl.ExpressionImpl;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Neg extends EObject, Expression {
  public abstract void setExp(final ExpressionImpl exp);
  
  public abstract ExpressionImpl getExp();
  
  public abstract long eval();
}
