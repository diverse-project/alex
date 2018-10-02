package compilA;

import compilA.Expression;
import compilA.impl.ExpressionImpl;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Mul extends EObject, Expression {
  public abstract void setLhs(final ExpressionImpl lhs);
  
  public abstract ExpressionImpl getLhs();
  
  public abstract void setRhs(final ExpressionImpl rhs);
  
  public abstract ExpressionImpl getRhs();
  
  public abstract long eval();
}
