package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.If;
import execboatruffle.impl.ExprImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "If")
@SuppressWarnings("all")
public class IfImpl extends ExprImpl implements If {
  @Node.Child
  private Expr cond;
  
  public void setCond(final Expr newCond) {
    if (newCond != cond) {
    	NotificationChain msgs = null;
    	if (cond != null)
    		msgs = ((InternalEObject) cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.IF__COND, null, msgs);
    	if (newCond != null)
    		msgs = ((InternalEObject) newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.IF__COND, null, msgs);
    	msgs = basicSetCond(newCond, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.IF__COND, newCond, newCond));
  }
  
  public NotificationChain basicSetCond(final Expr newCond, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldCond = cond;
    cond = newCond;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.IF__COND,
    			oldCond, newCond);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getCond() {
    return this.cond;
  }
  
  @Node.Child
  private Expr then;
  
  public void setThen(final Expr newThen) {
    if (newThen != then) {
    	NotificationChain msgs = null;
    	if (then != null)
    		msgs = ((InternalEObject) then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.IF__THEN, null, msgs);
    	if (newThen != null)
    		msgs = ((InternalEObject) newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.IF__THEN, null, msgs);
    	msgs = basicSetThen(newThen, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.IF__THEN, newThen, newThen));
  }
  
  public NotificationChain basicSetThen(final Expr newThen, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldThen = then;
    then = newThen;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.IF__THEN,
    			oldThen, newThen);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getThen() {
    return this.then;
  }
  
  @Node.Child
  private Expr els;
  
  public void setEls(final Expr newEls) {
    if (newEls != els) {
    	NotificationChain msgs = null;
    	if (els != null)
    		msgs = ((InternalEObject) els).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.IF__ELS, null, msgs);
    	if (newEls != null)
    		msgs = ((InternalEObject) newEls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.IF__ELS, null, msgs);
    	msgs = basicSetEls(newEls, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.IF__ELS, newEls, newEls));
  }
  
  public NotificationChain basicSetEls(final Expr newEls, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldEls = els;
    els = newEls;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.IF__ELS,
    			oldEls, newEls);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getEls() {
    return this.els;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.IF;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.IF__COND:
    	setCond((ExprImpl) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.IF__THEN:
    	setThen((ExprImpl) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.IF__ELS:
    	setEls((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.IF__COND:
    	setCond((ExprImpl) null);
    return;
    case execboatruffle.ExecboatrufflePackage.IF__THEN:
    	setThen((ExprImpl) null);
    return;
    case execboatruffle.ExecboatrufflePackage.IF__ELS:
    	setEls((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.IF__COND:
    	return getCond();
    case execboatruffle.ExecboatrufflePackage.IF__THEN:
    	return getThen();
    case execboatruffle.ExecboatrufflePackage.IF__ELS:
    	return getEls();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.IF__COND:
    	return cond != null;
    case execboatruffle.ExecboatrufflePackage.IF__THEN:
    	return then != null;
    case execboatruffle.ExecboatrufflePackage.IF__ELS:
    	return els != null;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    Object _xblockexpression = null;
    {
      final Boolean c = this.asBool(this.cond.eval(ctx));
      Object _xifexpression = null;
      if ((c).booleanValue()) {
        _xifexpression = this.then.eval(ctx);
      } else {
        _xifexpression = this.els.eval(ctx);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
