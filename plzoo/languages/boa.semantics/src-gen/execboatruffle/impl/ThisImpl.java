package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.This;
import execboatruffle.impl.ExprImpl;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "This")
@SuppressWarnings("all")
public class ThisImpl extends ExprImpl implements This {
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.THIS;
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
  
  public Object eval(final EvalCtx ctx) {
    Map<String, Object> _xifexpression = null;
    boolean _isPresent = ctx.th.isPresent();
    if (_isPresent) {
      _xifexpression = ctx.th.get();
    } else {
      throw new RuntimeException("invalid use of \'this\'");
    }
    return _xifexpression;
  }
}
