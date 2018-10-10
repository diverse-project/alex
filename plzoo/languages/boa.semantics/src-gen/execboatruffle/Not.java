package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Not extends EObject, Expr, NodeInterface {
  public abstract void setValue(final Expr value);
  
  public abstract Expr getValue();
  
  public abstract Object eval(final EvalCtx ctx);
}
