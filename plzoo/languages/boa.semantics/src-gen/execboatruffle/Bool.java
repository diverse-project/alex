package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Bool extends EObject, Expr, NodeInterface {
  public abstract void setValue(final boolean value);
  
  public abstract boolean isValue();
  
  public abstract Object eval(final EvalCtx ctx);
}
