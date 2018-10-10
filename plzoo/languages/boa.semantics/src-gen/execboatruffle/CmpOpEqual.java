package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.CmpOp;
import execboatruffle.EvalCtx;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface CmpOpEqual extends EObject, CmpOp, NodeInterface {
  public abstract Boolean eval(final EvalCtx ctx);
}
