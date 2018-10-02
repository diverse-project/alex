package compilA.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import compilA.CompilAPackage;
import compilA.Literal;
import compilA.impl.ExpressionImpl;
import org.eclipse.emf.ecore.EClass;

@NodeInfo(description = "Literal")
@SuppressWarnings("all")
public class LiteralImpl extends ExpressionImpl implements Literal {
  private long VALUE_EDEFAULT = 0;
  
  private long value = VALUE_EDEFAULT;
  
  public void setValue(final long value) {
    this.value = value;
  }
  
  public long getValue() {
    return this.value;
  }
  
  protected EClass eStaticClass() {
    return CompilAPackage.Literals.LITERAL;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case compilA.CompilAPackage.LITERAL__VALUE:
    	setValue((Long) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case compilA.CompilAPackage.LITERAL__VALUE:
    	setValue(VALUE_EDEFAULT);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case compilA.CompilAPackage.LITERAL__VALUE:
    	return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case compilA.CompilAPackage.LITERAL__VALUE:
    	return value != VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }
  
  public long eval() {
    return this.value;
  }
}
