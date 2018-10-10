package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Project extends EObject, Expr, NodeInterface {
  public abstract void setName(final String name);
  
  public abstract String getName();
  
  public abstract void setExp(final Expr exp);
  
  public abstract Expr getExp();
  
  public abstract Object eval(final EvalCtx ctx);
}
