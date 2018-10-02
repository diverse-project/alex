package compilA.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import compilA.CompilAPackage;
import compilA.Sum;
import compilA.impl.ExpressionImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Sum")
@SuppressWarnings("all")
public class SumImpl extends ExpressionImpl implements Sum {
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
    return CompilAPackage.Literals.SUM;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case compilA.CompilAPackage.SUM__LHS:
    	setLhs((ExpressionImpl) newValue);
    return;
    case compilA.CompilAPackage.SUM__RHS:
    	setRhs((ExpressionImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case compilA.CompilAPackage.SUM__LHS:
    	setLhs((ExpressionImpl) null);
    return;
    case compilA.CompilAPackage.SUM__RHS:
    	setRhs((ExpressionImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case compilA.CompilAPackage.SUM__LHS:
    	return getLhs();
    case compilA.CompilAPackage.SUM__RHS:
    	return getRhs();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case compilA.CompilAPackage.SUM__LHS:
    	return lhs != null;
    case compilA.CompilAPackage.SUM__RHS:
    	return rhs != null;
    }
    return super.eIsSet(featureID);
  }
  
  public long eval() {
    long _eval = this.lhs.eval();
    long _eval_1 = this.rhs.eval();
    return (_eval + _eval_1);
  }
}
