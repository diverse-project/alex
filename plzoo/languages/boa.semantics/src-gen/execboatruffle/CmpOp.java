package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface CmpOp extends EObject, Expr, NodeInterface {
  public abstract void setLhs(final Expr lhs);
  
  public abstract Expr getLhs();
  
  public abstract void setRhs(final Expr rhs);
  
  public abstract Expr getRhs();
}
