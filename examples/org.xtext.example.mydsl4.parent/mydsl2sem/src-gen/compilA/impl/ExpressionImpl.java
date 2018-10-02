package compilA.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import compilA.CompilAPackage;
import compilA.Expression;
import fr.inria.diverse.alex.emf.truffle.MinimalTruffleEObjectImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.InputOutput;

@NodeInfo(description = "Expression")
@SuppressWarnings("all")
public abstract class ExpressionImpl extends MinimalTruffleEObjectImpl.TruffleContainer implements Expression {
  protected EClass eStaticClass() {
    return CompilAPackage.Literals.EXPRESSION;
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
  
  public long main() {
    long _xblockexpression = (long) 0;
    {
      final long ret = this.eval();
      InputOutput.<Long>println(Long.valueOf(ret));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
}
