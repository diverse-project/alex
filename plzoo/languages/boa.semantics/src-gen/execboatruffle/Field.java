package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.Expr;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Field extends EObject, NodeInterface {
  public abstract void setName(final String name);
  
  public abstract String getName();
  
  public abstract void setValue(final Expr value);
  
  public abstract Expr getValue();
}
