package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.BoundFunc;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Func;
import execboatruffle.Project;
import execboatruffle.impl.ExprImpl;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "Project")
@SuppressWarnings("all")
public class ProjectImpl extends ExprImpl implements Project {
  private String NAME_EDEFAULT = null;
  
  private String name = NAME_EDEFAULT;
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  @Node.Child
  private Expr exp;
  
  public void setExp(final Expr newExp) {
    if (newExp != exp) {
    	NotificationChain msgs = null;
    	if (exp != null)
    		msgs = ((InternalEObject) exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.PROJECT__EXP, null, msgs);
    	if (newExp != null)
    		msgs = ((InternalEObject) newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.PROJECT__EXP, null, msgs);
    	msgs = basicSetExp(newExp, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.PROJECT__EXP, newExp, newExp));
  }
  
  public NotificationChain basicSetExp(final Expr newExp, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldExp = exp;
    exp = newExp;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.PROJECT__EXP,
    			oldExp, newExp);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getExp() {
    return this.exp;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.PROJECT;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.PROJECT__EXP:
    	setExp((ExprImpl) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.PROJECT__NAME:
    	setName((String) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.PROJECT__EXP:
    	setExp((ExprImpl) null);
    return;
    case execboatruffle.ExecboatrufflePackage.PROJECT__NAME:
    	setName(NAME_EDEFAULT);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.PROJECT__EXP:
    	return getExp();
    case execboatruffle.ExecboatrufflePackage.PROJECT__NAME:
    	return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.PROJECT__EXP:
    	return exp != null;
    case execboatruffle.ExecboatrufflePackage.PROJECT__NAME:
    	return name != NAME_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    Object _xblockexpression = null;
    {
      Object _eval = this.exp.eval(ctx);
      final Map<String, Object> u = ((Map<String, Object>) _eval);
      Object _xifexpression = null;
      boolean _containsKey = u.containsKey(this.name);
      if (_containsKey) {
        Object _xblockexpression_1 = null;
        {
          final Object x = u.get(this.name);
          Object _xifexpression_1 = null;
          if ((x instanceof Func)) {
            _xifexpression_1 = new BoundFunc(((Func)x), u);
          } else {
            _xifexpression_1 = x;
          }
          _xblockexpression_1 = _xifexpression_1;
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
