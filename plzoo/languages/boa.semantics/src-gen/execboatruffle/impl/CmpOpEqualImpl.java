package execboatruffle.impl;

import com.google.common.base.Objects;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.CmpOpEqual;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.impl.CmpOpImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "CmpOpEqual")
@SuppressWarnings("all")
public class CmpOpEqualImpl extends CmpOpImpl implements CmpOpEqual {
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.CMPOPEQUAL;
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
  
  public Boolean eval(final EvalCtx ctx) {
    boolean _xblockexpression = false;
    {
      final Object vlhs = this.getLhs().eval(ctx);
      final Object vrhs = this.getRhs().eval(ctx);
      _xblockexpression = Objects.equal(vlhs, vrhs);
    }
    return Boolean.valueOf(_xblockexpression);
  }
}
