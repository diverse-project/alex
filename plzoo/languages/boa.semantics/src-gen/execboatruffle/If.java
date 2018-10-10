package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface If extends EObject, Expr, NodeInterface {
  public abstract void setCond(final Expr cond);
  
  public abstract Expr getCond();
  
  public abstract void setThen(final Expr then);
  
  public abstract Expr getThen();
  
  public abstract void setEls(final Expr els);
  
  public abstract Expr getEls();
  
  public abstract Object eval(final EvalCtx ctx);
}
