package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.EvalCtx;
import execboatruffle.Expr;
import execboatruffle.TopLevelCmd;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Def extends EObject, TopLevelCmd, NodeInterface {
  public abstract void setName(final String name);
  
  public abstract String getName();
  
  public abstract void setExpr(final Expr expr);
  
  public abstract Expr getExpr();
  
  public abstract void nextLine(final EvalCtx ctx);
}
