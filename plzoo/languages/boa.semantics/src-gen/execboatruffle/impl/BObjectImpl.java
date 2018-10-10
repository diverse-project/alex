package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.BObject;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Field;
import execboatruffle.impl.ExprImpl;
import execboatruffle.impl.FieldImpl;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

@NodeInfo(description = "BObject")
@SuppressWarnings("all")
public class BObjectImpl extends ExprImpl implements BObject {
  private EList<Field> fields;
  
  public EList<Field> getFields() {
    if(fields == null) {
    	fields = new EObjectContainmentEList<Field>(Field.class, this, ExecboatrufflePackage.BOBJECT__FIELDS);
    }
    return fields;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.BOBJECT;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.BOBJECT__FIELDS:
    	getFields().clear();
    	getFields().addAll((Collection<? extends FieldImpl>) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.BOBJECT__FIELDS:
    	getFields().clear();
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.BOBJECT__FIELDS:
    	return getFields();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.BOBJECT__FIELDS:
    	return fields != null;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    HashMap<String, Object> _xifexpression = null;
    if ((this.fields != null)) {
      HashMap<String, Object> _xblockexpression = null;
      {
        final HashMap<String, Object> ret = new HashMap<String, Object>();
        final Consumer<Field> _function = (Field it) -> {
          Expr _value = it.getValue();
          EvalCtx _evalCtx = new EvalCtx(ctx.th, ctx.env);
          ret.put(it.getName(), _value.eval(_evalCtx));
        };
        this.fields.forEach(_function);
        _xblockexpression = ret;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = new HashMap<String, Object>();
    }
    return _xifexpression;
  }
}
