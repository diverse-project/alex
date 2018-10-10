package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.ArithOp;
import execboatruffle.EvalCtx;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface ArithOpTimes extends EObject, ArithOp, NodeInterface {
  public abstract Integer eval(final EvalCtx ctx);
}
