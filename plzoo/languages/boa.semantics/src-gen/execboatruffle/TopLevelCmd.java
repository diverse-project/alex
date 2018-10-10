package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface TopLevelCmd extends EObject, NodeInterface {
  public abstract void nextLine(final EvalCtx ctx);
}
