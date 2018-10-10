package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.TopLevelCmd;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Expr extends EObject, TopLevelCmd, NodeInterface {
  public abstract Object eval(final EvalCtx ctx);
  
  public abstract void nextLine(final EvalCtx ctx);
  
  public abstract Integer asInt(final Object v);
  
  public abstract Boolean asBool(final Object v);
}
