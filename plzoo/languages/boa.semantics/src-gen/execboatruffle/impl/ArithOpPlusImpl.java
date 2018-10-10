package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.ArithOpPlus;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.impl.ArithOpImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "ArithOpPlus")
@SuppressWarnings("all")
public class ArithOpPlusImpl extends ArithOpImpl implements ArithOpPlus {
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.ARITHOPPLUS;
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
  
  public Integer eval(final EvalCtx ctx) {
    int _xblockexpression = (int) 0;
    {
      final Object vlhs = this.getLhs().eval(ctx);
      final Object vrhs = this.getRhs().eval(ctx);
      Integer _asInt = this.asInt(vlhs);
      Integer _asInt_1 = this.asInt(vrhs);
      _xblockexpression = ((_asInt).intValue() + (_asInt_1).intValue());
    }
    return Integer.valueOf(_xblockexpression);
  }
}
