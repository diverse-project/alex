package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Sideeffects;
import execboatruffle.impl.TopLevelCmdImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Expr")
@SuppressWarnings("all")
public abstract class ExprImpl extends TopLevelCmdImpl implements Expr {
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.EXPR;
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
  
  public void nextLine(final EvalCtx ctx) {
    Sideeffects.println(this.eval(ctx));
  }
  
  public Integer asInt(final Object v) {
    Integer _xifexpression = null;
    if ((v instanceof Integer)) {
      _xifexpression = ((Integer)v);
    } else {
      throw new RuntimeException("integer expected");
    }
    return _xifexpression;
  }
  
  public Boolean asBool(final Object v) {
    Boolean _xifexpression = null;
    if ((v instanceof Boolean)) {
      _xifexpression = ((Boolean)v);
    } else {
      throw new RuntimeException("boolean expected");
    }
    return _xifexpression;
  }
}
