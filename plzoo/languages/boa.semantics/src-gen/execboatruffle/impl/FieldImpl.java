package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Field;
import execboatruffle.impl.ExprImpl;
import fr.inria.diverse.alex.emf.truffle.MinimalTruffleEObjectImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "Field")
@SuppressWarnings("all")
public class FieldImpl extends MinimalTruffleEObjectImpl.TruffleContainer implements Field {
  private String NAME_EDEFAULT = null;
  
  private String name = NAME_EDEFAULT;
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  private Expr value;
  
  public void setValue(final Expr newValue) {
    if (newValue != value) {
    	NotificationChain msgs = null;
    	if (value != null)
    		msgs = ((InternalEObject) value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.FIELD__VALUE, null, msgs);
    	if (newValue != null)
    		msgs = ((InternalEObject) newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.FIELD__VALUE, null, msgs);
    	msgs = basicSetValue(newValue, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.FIELD__VALUE, newValue, newValue));
  }
  
  public NotificationChain basicSetValue(final Expr newValue, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldValue = value;
    value = newValue;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.FIELD__VALUE,
    			oldValue, newValue);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getValue() {
    return this.value;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.FIELD;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FIELD__NAME:
    	setName((String) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.FIELD__VALUE:
    	setValue((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FIELD__NAME:
    	setName(NAME_EDEFAULT);
    return;
    case execboatruffle.ExecboatrufflePackage.FIELD__VALUE:
    	setValue((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FIELD__NAME:
    	return getName();
    case execboatruffle.ExecboatrufflePackage.FIELD__VALUE:
    	return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FIELD__NAME:
    	return name != NAME_EDEFAULT;
    case execboatruffle.ExecboatrufflePackage.FIELD__VALUE:
    	return value != null;
    }
    return super.eIsSet(featureID);
  }
}
