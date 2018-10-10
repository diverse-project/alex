package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.BoolOp;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.impl.ExprImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "BoolOp")
@SuppressWarnings("all")
public abstract class BoolOpImpl extends ExprImpl implements BoolOp {
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.BOOLOP;
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
