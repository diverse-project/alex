package compilA.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import compilA.CompilAPackage;
import compilA.Mul;
import compilA.impl.ExpressionImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Mul")
@SuppressWarnings("all")
public class MulImpl extends ExpressionImpl implements Mul {
  @Node.Child
  private ExpressionImpl lhs;
  
  public void setLhs(final ExpressionImpl lhs) {
    this.lhs = lhs;
  }
  
  public ExpressionImpl getLhs() {
    return this.lhs;
  }
  
  @Node.Child
  private ExpressionImpl rhs;
  
  public void setRhs(final ExpressionImpl rhs) {
    this.rhs = rhs;
  }
  
  public ExpressionImpl getRhs() {
    return this.rhs;
  }
  
  protected EClass eStaticClass() {
    return CompilAPackage.Literals.MUL;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case compilA.CompilAPackage.MUL__LHS:
    	setLhs((ExpressionImpl) newValue);
    return;
    case compilA.CompilAPackage.MUL__RHS:
    	setRhs((ExpressionImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case compilA.CompilAPackage.MUL__LHS:
    	setLhs((ExpressionImpl) null);
    return;
    case compilA.CompilAPackage.MUL__RHS:
    	setRhs((ExpressionImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case compilA.CompilAPackage.MUL__LHS:
    	return getLhs();
    case compilA.CompilAPackage.MUL__RHS:
    	return getRhs();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case compilA.CompilAPackage.MUL__LHS:
    	return lhs != null;
    case compilA.CompilAPackage.MUL__RHS:
    	return rhs != null;
    }
    return super.eIsSet(featureID);
  }
  
  public long eval() {
    long _eval = this.lhs.eval();
    long _eval_1 = this.rhs.eval();
    return (_eval * _eval_1);
  }
}
