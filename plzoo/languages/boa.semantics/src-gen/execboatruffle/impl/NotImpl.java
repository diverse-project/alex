package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Not;
import execboatruffle.impl.ExprImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "Not")
@SuppressWarnings("all")
public class NotImpl extends ExprImpl implements Not {
  @Node.Child
  private Expr value;
  
  public void setValue(final Expr newValue) {
    if (newValue != value) {
    	NotificationChain msgs = null;
    	if (value != null)
    		msgs = ((InternalEObject) value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.NOT__VALUE, null, msgs);
    	if (newValue != null)
    		msgs = ((InternalEObject) newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.NOT__VALUE, null, msgs);
    	msgs = basicSetValue(newValue, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.NOT__VALUE, newValue, newValue));
  }
  
  public NotificationChain basicSetValue(final Expr newValue, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldValue = value;
    value = newValue;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.NOT__VALUE,
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
    return ExecboatrufflePackage.Literals.NOT;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.NOT__VALUE:
    	setValue((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.NOT__VALUE:
    	setValue((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.NOT__VALUE:
    	return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.NOT__VALUE:
    	return value != null;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    Boolean _asBool = this.asBool(this.value.eval(ctx));
    return Boolean.valueOf((!(_asBool).booleanValue()));
  }
}
