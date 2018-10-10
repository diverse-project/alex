package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Skip;
import execboatruffle.impl.ExprImpl;
import java.util.HashMap;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Skip")
@SuppressWarnings("all")
public class SkipImpl extends ExprImpl implements Skip {
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.SKIP;
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
    return new HashMap<String, Object>();
  }
}
