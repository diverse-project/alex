package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Int extends EObject, Expr, NodeInterface {
  public abstract void setValue(final int value);
  
  public abstract int getValue();
  
  public abstract Object eval(final EvalCtx ctx);
}
