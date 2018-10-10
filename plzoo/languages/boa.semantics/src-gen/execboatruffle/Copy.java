package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Copy extends EObject, Expr, NodeInterface {
  public abstract void setCopy(final Expr copy);
  
  public abstract Expr getCopy();
  
  public abstract Object eval(final EvalCtx ctx);
}
