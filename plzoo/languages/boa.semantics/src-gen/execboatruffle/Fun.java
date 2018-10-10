package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Fun extends EObject, Expr, NodeInterface {
  public abstract void setName(final String name);
  
  public abstract String getName();
  
  public abstract void setBody(final Expr body);
  
  public abstract Expr getBody();
  
  public abstract Object eval(final EvalCtx ctx);
}
