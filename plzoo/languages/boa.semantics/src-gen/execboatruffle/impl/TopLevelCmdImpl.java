package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.TopLevelCmd;
import fr.inria.diverse.alex.emf.truffle.MinimalTruffleEObjectImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "TopLevelCmd")
@SuppressWarnings("all")
public abstract class TopLevelCmdImpl extends MinimalTruffleEObjectImpl.TruffleContainer implements TopLevelCmd {
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.TOPLEVELCMD;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    }
    return super.eIsSet(featureID);
  }
}
