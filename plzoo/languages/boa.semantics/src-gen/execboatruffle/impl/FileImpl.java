package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.File;
import execboatruffle.TopLevelCmd;
import execboatruffle.impl.TopLevelCmdImpl;
import fr.inria.diverse.alex.emf.truffle.MinimalTruffleEObjectImpl;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

@NodeInfo(description = "File")
@SuppressWarnings("all")
public class FileImpl extends MinimalTruffleEObjectImpl.TruffleContainer implements File {
  private EList<TopLevelCmd> commands;
  
  public EList<TopLevelCmd> getCommands() {
    if(commands == null) {
    	commands = new EObjectContainmentEList<TopLevelCmd>(TopLevelCmd.class, this, ExecboatrufflePackage.FILE__COMMANDS);
    }
    return commands;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.FILE;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FILE__COMMANDS:
    	getCommands().clear();
    	getCommands().addAll((Collection<? extends TopLevelCmdImpl>) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FILE__COMMANDS:
    	getCommands().clear();
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FILE__COMMANDS:
    	return getCommands();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FILE__COMMANDS:
    	return commands != null;
    }
    return super.eIsSet(featureID);
  }
  
  public void eval() {
    Optional<Map<String, Object>> _empty = Optional.<Map<String, Object>>empty();
    HashMap<String, Object> _hashMap = new HashMap<String, Object>();
    EvalCtx ctx = new EvalCtx(_empty, _hashMap);
    for (final TopLevelCmd tlc : this.commands) {
      tlc.nextLine(ctx);
    }
  }
}
