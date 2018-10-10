package execboatruffle;

import com.oracle.truffle.api.nodes.NodeInterface;
import execboatruffle.TopLevelCmd;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface File extends EObject, NodeInterface {
  public abstract EList<TopLevelCmd> getCommands();
  
  public abstract void eval();
}
