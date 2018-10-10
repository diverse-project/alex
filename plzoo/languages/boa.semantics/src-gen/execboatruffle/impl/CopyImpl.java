package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.Copy;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.impl.ExprImpl;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "Copy")
@SuppressWarnings("all")
public class CopyImpl extends ExprImpl implements Copy {
  @Node.Child
  private Expr copy;
  
  public void setCopy(final Expr newCopy) {
    if (newCopy != copy) {
    	NotificationChain msgs = null;
    	if (copy != null)
    		msgs = ((InternalEObject) copy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.COPY__COPY, null, msgs);
    	if (newCopy != null)
    		msgs = ((InternalEObject) newCopy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.COPY__COPY, null, msgs);
    	msgs = basicSetCopy(newCopy, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.COPY__COPY, newCopy, newCopy));
  }
  
  public NotificationChain basicSetCopy(final Expr newCopy, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldCopy = copy;
    copy = newCopy;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.COPY__COPY,
    			oldCopy, newCopy);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getCopy() {
    return this.copy;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.COPY;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.COPY__COPY:
    	setCopy((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.COPY__COPY:
    	setCopy((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.COPY__COPY:
    	return getCopy();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.COPY__COPY:
    	return copy != null;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    HashMap<String, Object> _xblockexpression = null;
    {
      Object _eval = this.copy.eval(ctx);
      final Map<String, Object> vcopy = ((Map<String, Object>) _eval);
      _xblockexpression = new HashMap<String, Object>(vcopy);
    }
    return _xblockexpression;
  }
}
