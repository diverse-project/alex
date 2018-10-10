package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.Bool;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.impl.ExprImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Bool")
@SuppressWarnings("all")
public class BoolImpl extends ExprImpl implements Bool {
  private boolean VALUE_EDEFAULT = false;
  
  private boolean value = VALUE_EDEFAULT;
  
  public void setValue(final boolean value) {
    this.value = value;
  }
  
  public boolean isValue() {
    return this.value;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.BOOL;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.BOOL__VALUE:
    	setValue((boolean) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.BOOL__VALUE:
    	setValue(VALUE_EDEFAULT);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.BOOL__VALUE:
    	return isValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.BOOL__VALUE:
    	return value != VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    return Boolean.valueOf(this.value);
  }
}
