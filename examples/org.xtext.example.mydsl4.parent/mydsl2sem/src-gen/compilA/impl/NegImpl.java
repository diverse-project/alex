package compilA.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import compilA.CompilAPackage;
import compilA.Neg;
import compilA.impl.ExpressionImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Neg")
@SuppressWarnings("all")
public class NegImpl extends ExpressionImpl implements Neg {
  @Node.Child
  private ExpressionImpl exp;
  
  public void setExp(final ExpressionImpl exp) {
    this.exp = exp;
  }
  
  public ExpressionImpl getExp() {
    return this.exp;
  }
  
  protected EClass eStaticClass() {
    return CompilAPackage.Literals.NEG;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case compilA.CompilAPackage.NEG__EXP:
    	setExp((ExpressionImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case compilA.CompilAPackage.NEG__EXP:
    	setExp((ExpressionImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case compilA.CompilAPackage.NEG__EXP:
    	return getExp();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case compilA.CompilAPackage.NEG__EXP:
    	return exp != null;
    }
    return super.eIsSet(featureID);
  }
  
  public long eval() {
    long _eval = this.exp.eval();
    return (-_eval);
  }
}
