package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Var;
import execboatruffle.impl.ExprImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Var")
@SuppressWarnings("all")
public class VarImpl extends ExprImpl implements Var {
  private String NAME_EDEFAULT = null;
  
  private String name = NAME_EDEFAULT;
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.VAR;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.VAR__NAME:
    	setName((String) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.VAR__NAME:
    	setName(NAME_EDEFAULT);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.VAR__NAME:
    	return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.VAR__NAME:
    	return name != NAME_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    Object _xifexpression = null;
    boolean _containsKey = ctx.env.containsKey(this.name);
    if (_containsKey) {
      _xifexpression = ctx.env.get(this.name);
    } else {
      throw new RuntimeException(("no such variable " + this.name));
    }
    return _xifexpression;
  }
}
