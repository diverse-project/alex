package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.Assign;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.impl.ExprImpl;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "Assign")
@SuppressWarnings("all")
public class AssignImpl extends ExprImpl implements Assign {
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
    		msgs = ((InternalEObject) lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.ASSIGN__LHS, null, msgs);
    	if (newLhs != null)
    		msgs = ((InternalEObject) newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.ASSIGN__LHS, null, msgs);
    	msgs = basicSetLhs(newLhs, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.ASSIGN__LHS, newLhs, newLhs));
  }
  
  public NotificationChain basicSetLhs(final Expr newLhs, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.ASSIGN__LHS,
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
    		msgs = ((InternalEObject) rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.ASSIGN__RHS, null, msgs);
    	if (newRhs != null)
    		msgs = ((InternalEObject) newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.ASSIGN__RHS, null, msgs);
    	msgs = basicSetRhs(newRhs, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.ASSIGN__RHS, newRhs, newRhs));
  }
  
  public NotificationChain basicSetRhs(final Expr newRhs, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.ASSIGN__RHS,
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
    return ExecboatrufflePackage.Literals.ASSIGN;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.ASSIGN__LHS:
    	setLhs((ExprImpl) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.ASSIGN__RHS:
    	setRhs((ExprImpl) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.ASSIGN__NAME:
    	setName((String) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.ASSIGN__LHS:
    	setLhs((ExprImpl) null);
    return;
    case execboatruffle.ExecboatrufflePackage.ASSIGN__RHS:
    	setRhs((ExprImpl) null);
    return;
    case execboatruffle.ExecboatrufflePackage.ASSIGN__NAME:
    	setName(NAME_EDEFAULT);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.ASSIGN__LHS:
    	return getLhs();
    case execboatruffle.ExecboatrufflePackage.ASSIGN__RHS:
    	return getRhs();
    case execboatruffle.ExecboatrufflePackage.ASSIGN__NAME:
    	return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.ASSIGN__LHS:
    	return lhs != null;
    case execboatruffle.ExecboatrufflePackage.ASSIGN__RHS:
    	return rhs != null;
    case execboatruffle.ExecboatrufflePackage.ASSIGN__NAME:
    	return name != NAME_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    Object _xblockexpression = null;
    {
      Object _eval = this.lhs.eval(ctx);
      final Map<String, Object> vlhs = ((Map<String, Object>) _eval);
      final Object vrhs = this.rhs.eval(ctx);
      Object _xifexpression = null;
      boolean _containsKey = vlhs.containsKey(this.name);
      if (_containsKey) {
        Object _xblockexpression_1 = null;
        {
          vlhs.put(this.name, vrhs);
          _xblockexpression_1 = vrhs;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        throw new RuntimeException(("no such field " + this.name));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
