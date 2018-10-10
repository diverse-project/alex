package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Int;
import execboatruffle.impl.ExprImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Int")
@SuppressWarnings("all")
public class IntImpl extends ExprImpl implements Int {
  private int VALUE_EDEFAULT = 0;
  
  private int value = VALUE_EDEFAULT;
  
  public void setValue(final int value) {
    this.value = value;
  }
  
  public int getValue() {
    return this.value;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.INT;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.INT__VALUE:
    	setValue((int) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.INT__VALUE:
    	setValue(VALUE_EDEFAULT);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.INT__VALUE:
    	return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.INT__VALUE:
    	return value != VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    return Integer.valueOf(this.value);
  }
}
