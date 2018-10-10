package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import execboatruffle.Field;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface BObject extends EObject, Expr, NodeInterface {
  public abstract EList<Field> getFields();
  
  public abstract Object eval(final EvalCtx ctx);
}
