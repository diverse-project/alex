package execboatruffle.impl;

import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.ArithOp;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.impl.ExprImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "ArithOp")
@SuppressWarnings("all")
public abstract class ArithOpImpl extends ExprImpl implements ArithOp {
  private Expr lhs;
  
  public void setLhs(final Expr newLhs) {
    if (newLhs != lhs) {
    	NotificationChain msgs = null;
    	if (lhs != null)
    		msgs = ((InternalEObject) lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.ARITH_OP__LHS, null, msgs);
    	if (newLhs != null)
    		msgs = ((InternalEObject) newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.ARITH_OP__LHS, null, msgs);
    	msgs = basicSetLhs(newLhs, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.ARITH_OP__LHS, newLhs, newLhs));
  }
  
  public NotificationChain basicSetLhs(final Expr newLhs, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.ARITH_OP__LHS,
    			oldLhs, newLhs);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getLhs() {
    return this.lhs;
  }
  
  private Expr rhs;
  
  public void setRhs(final Expr newRhs) {
    if (newRhs != rhs) {
    	NotificationChain msgs = null;
    	if (rhs != null)
    		msgs = ((InternalEObject) rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.ARITH_OP__RHS, null, msgs);
    	if (newRhs != null)
    		msgs = ((InternalEObject) newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.ARITH_OP__RHS, null, msgs);
    	msgs = basicSetRhs(newRhs, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.ARITH_OP__RHS, newRhs, newRhs));
  }
  
  public NotificationChain basicSetRhs(final Expr newRhs, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.ARITH_OP__RHS,
    			oldRhs, newRhs);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getRhs() {
    return this.rhs;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.ARITHOP;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.ARITH_OP__LHS:
    	setLhs((ExprImpl) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.ARITH_OP__RHS:
    	setRhs((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.ARITH_OP__LHS:
    	setLhs((ExprImpl) null);
    return;
    case execboatruffle.ExecboatrufflePackage.ARITH_OP__RHS:
    	setRhs((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.ARITH_OP__LHS:
    	return getLhs();
    case execboatruffle.ExecboatrufflePackage.ARITH_OP__RHS:
    	return getRhs();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.ARITH_OP__LHS:
    	return lhs != null;
    case execboatruffle.ExecboatrufflePackage.ARITH_OP__RHS:
    	return rhs != null;
    }
    return super.eIsSet(featureID);
  }
}
