package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Let extends EObject, Expr, NodeInterface {
  public abstract void setName(final String name);
  
  public abstract String getName();
  
  public abstract void setLhs(final Expr lhs);
  
  public abstract Expr getLhs();
  
  public abstract void setRhs(final Expr rhs);
  
  public abstract Expr getRhs();
  
  public abstract Object eval(final EvalCtx ctx);
}
