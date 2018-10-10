package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.CmpOpLess;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.impl.CmpOpImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "CmpOpLess")
@SuppressWarnings("all")
public class CmpOpLessImpl extends CmpOpImpl implements CmpOpLess {
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.CMPOPLESS;
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
      Integer _asInt = this.asInt(vlhs);
      Integer _asInt_1 = this.asInt(vrhs);
      _xblockexpression = (_asInt.compareTo(_asInt_1) < 0);
    }
    return Boolean.valueOf(_xblockexpression);
  }
}
