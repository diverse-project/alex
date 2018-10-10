package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.App;
import execboatruffle.BoundFunc;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Func;
import execboatruffle.impl.ExprImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@NodeInfo(description = "App")
@SuppressWarnings("all")
public class AppImpl extends ExprImpl implements App {
  @Node.Child
  private Expr lhs;
  
  public void setLhs(final Expr newLhs) {
    if (newLhs != lhs) {
    	NotificationChain msgs = null;
    	if (lhs != null)
    		msgs = ((InternalEObject) lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.APP__LHS, null, msgs);
    	if (newLhs != null)
    		msgs = ((InternalEObject) newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.APP__LHS, null, msgs);
    	msgs = basicSetLhs(newLhs, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.APP__LHS, newLhs, newLhs));
  }
  
  public NotificationChain basicSetLhs(final Expr newLhs, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.APP__LHS,
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
    		msgs = ((InternalEObject) rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.APP__RHS, null, msgs);
    	if (newRhs != null)
    		msgs = ((InternalEObject) newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.APP__RHS, null, msgs);
    	msgs = basicSetRhs(newRhs, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.APP__RHS, newRhs, newRhs));
  }
  
  public NotificationChain basicSetRhs(final Expr newRhs, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.APP__RHS,
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
    return ExecboatrufflePackage.Literals.APP;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.APP__LHS:
    	setLhs((ExprImpl) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.APP__RHS:
    	setRhs((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.APP__LHS:
    	setLhs((ExprImpl) null);
    return;
    case execboatruffle.ExecboatrufflePackage.APP__RHS:
    	setRhs((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.APP__LHS:
    	return getLhs();
    case execboatruffle.ExecboatrufflePackage.APP__RHS:
    	return getRhs();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.APP__LHS:
    	return lhs != null;
    case execboatruffle.ExecboatrufflePackage.APP__RHS:
    	return rhs != null;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    Object _xblockexpression = null;
    {
      final Object fct = this.lhs.eval(ctx);
      final Object v2 = this.rhs.eval(ctx);
      Object _xifexpression = null;
      if ((fct instanceof BoundFunc)) {
        Object _xblockexpression_1 = null;
        {
          Optional<Map<String, Object>> _of = Optional.<Map<String, Object>>of(((BoundFunc)fct).th);
          HashMap<String, Object> _hashMap = new HashMap<String, Object>();
          final Procedure1<HashMap<String, Object>> _function = (HashMap<String, Object> it) -> {
            it.putAll(((BoundFunc)fct).func.ctx.env);
            it.put(((BoundFunc)fct).func.name, v2);
          };
          HashMap<String, Object> _doubleArrow = ObjectExtensions.<HashMap<String, Object>>operator_doubleArrow(_hashMap, _function);
          EvalCtx _evalCtx = new EvalCtx(_of, _doubleArrow);
          final Object ret = ((BoundFunc)fct).func.expr.eval(_evalCtx);
          Object _xifexpression_1 = null;
          if ((ret instanceof Func)) {
            _xifexpression_1 = new BoundFunc(((Func)ret), ((BoundFunc)fct).th);
          } else {
            _xifexpression_1 = ret;
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        Object _xifexpression_1 = null;
        if ((fct instanceof Func)) {
          HashMap<String, Object> _hashMap = new HashMap<String, Object>();
          final Procedure1<HashMap<String, Object>> _function = (HashMap<String, Object> it) -> {
            it.putAll(((Func)fct).ctx.env);
            it.put(((Func)fct).name, v2);
          };
          HashMap<String, Object> _doubleArrow = ObjectExtensions.<HashMap<String, Object>>operator_doubleArrow(_hashMap, _function);
          EvalCtx _evalCtx = new EvalCtx(ctx.th, _doubleArrow);
          _xifexpression_1 = ((Func)fct).expr.eval(_evalCtx);
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
