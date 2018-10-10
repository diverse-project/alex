package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Let;
import execboatruffle.impl.ExprImpl;
import java.util.HashMap;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@NodeInfo(description = "Let")
@SuppressWarnings("all")
public class LetImpl extends ExprImpl implements Let {
  private String NAME_EDEFAULT = null;
  
  private String name = NAME_EDEFAULT;
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  @Node.Child
  private Expr lhs;
  
  public void setLhs(final Expr newLhs) {
    if (newLhs != lhs) {
    	NotificationChain msgs = null;
    	if (lhs != null)
    		msgs = ((InternalEObject) lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.LET__LHS, null, msgs);
    	if (newLhs != null)
    		msgs = ((InternalEObject) newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.LET__LHS, null, msgs);
    	msgs = basicSetLhs(newLhs, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.LET__LHS, newLhs, newLhs));
  }
  
  public NotificationChain basicSetLhs(final Expr newLhs, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.LET__LHS,
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
  
  @Node.Child
  private Expr rhs;
  
  public void setRhs(final Expr newRhs) {
    if (newRhs != rhs) {
    	NotificationChain msgs = null;
    	if (rhs != null)
    		msgs = ((InternalEObject) rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.LET__RHS, null, msgs);
    	if (newRhs != null)
    		msgs = ((InternalEObject) newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.LET__RHS, null, msgs);
    	msgs = basicSetRhs(newRhs, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.LET__RHS, newRhs, newRhs));
  }
  
  public NotificationChain basicSetRhs(final Expr newRhs, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.LET__RHS,
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
    return ExecboatrufflePackage.Literals.LET;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.LET__NAME:
    	setName((String) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.LET__LHS:
    	setLhs((ExprImpl) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.LET__RHS:
    	setRhs((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.LET__NAME:
    	setName(NAME_EDEFAULT);
    return;
    case execboatruffle.ExecboatrufflePackage.LET__LHS:
    	setLhs((ExprImpl) null);
    return;
    case execboatruffle.ExecboatrufflePackage.LET__RHS:
    	setRhs((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.LET__NAME:
    	return getName();
    case execboatruffle.ExecboatrufflePackage.LET__LHS:
    	return getLhs();
    case execboatruffle.ExecboatrufflePackage.LET__RHS:
    	return getRhs();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.LET__NAME:
    	return name != NAME_EDEFAULT;
    case execboatruffle.ExecboatrufflePackage.LET__LHS:
    	return lhs != null;
    case execboatruffle.ExecboatrufflePackage.LET__RHS:
    	return rhs != null;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    Object _xblockexpression = null;
    {
      final Object vlhs = this.lhs.eval(ctx);
      HashMap<String, Object> _hashMap = new HashMap<String, Object>();
      final Procedure1<HashMap<String, Object>> _function = (HashMap<String, Object> it) -> {
        it.putAll(ctx.env);
        it.put(this.name, vlhs);
      };
      HashMap<String, Object> _doubleArrow = ObjectExtensions.<HashMap<String, Object>>operator_doubleArrow(_hashMap, _function);
      EvalCtx _evalCtx = new EvalCtx(ctx.th, _doubleArrow);
      _xblockexpression = this.rhs.eval(_evalCtx);
    }
    return _xblockexpression;
  }
}
