package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.Def;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Sideeffects;
import execboatruffle.impl.ExprImpl;
import execboatruffle.impl.TopLevelCmdImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "Def")
@SuppressWarnings("all")
public class DefImpl extends TopLevelCmdImpl implements Def {
  private String NAME_EDEFAULT = null;
  
  private String name = NAME_EDEFAULT;
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  @Node.Child
  private Expr expr;
  
  public void setExpr(final Expr newExpr) {
    if (newExpr != expr) {
    	NotificationChain msgs = null;
    	if (expr != null)
    		msgs = ((InternalEObject) expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.DEF__EXPR, null, msgs);
    	if (newExpr != null)
    		msgs = ((InternalEObject) newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.DEF__EXPR, null, msgs);
    	msgs = basicSetExpr(newExpr, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.DEF__EXPR, newExpr, newExpr));
  }
  
  public NotificationChain basicSetExpr(final Expr newExpr, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.DEF__EXPR,
    			oldExpr, newExpr);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getExpr() {
    return this.expr;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.DEF;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.DEF__NAME:
    	setName((String) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.DEF__EXPR:
    	setExpr((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.DEF__NAME:
    	setName(NAME_EDEFAULT);
    return;
    case execboatruffle.ExecboatrufflePackage.DEF__EXPR:
    	setExpr((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.DEF__NAME:
    	return getName();
    case execboatruffle.ExecboatrufflePackage.DEF__EXPR:
    	return getExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.DEF__NAME:
    	return name != NAME_EDEFAULT;
    case execboatruffle.ExecboatrufflePackage.DEF__EXPR:
    	return expr != null;
    }
    return super.eIsSet(featureID);
  }
  
  public void nextLine(final EvalCtx ctx) {
    final Object e = this.expr.eval(ctx);
    Sideeffects.println(((this.name + " = ") + e));
    ctx.env.put(this.name, e);
  }
}
