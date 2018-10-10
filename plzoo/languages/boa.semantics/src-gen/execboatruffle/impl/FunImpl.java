package execboatruffle.impl;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import execboatruffle.EvalCtx;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Expr;
import execboatruffle.Fun;
import execboatruffle.Func;
import execboatruffle.impl.ExprImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "Fun")
@SuppressWarnings("all")
public class FunImpl extends ExprImpl implements Fun {
  private String NAME_EDEFAULT = null;
  
  private String name = NAME_EDEFAULT;
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  @Node.Child
  private Expr body;
  
  public void setBody(final Expr newBody) {
    if (newBody != body) {
    	NotificationChain msgs = null;
    	if (body != null)
    		msgs = ((InternalEObject) body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.FUN__BODY, null, msgs);
    	if (newBody != null)
    		msgs = ((InternalEObject) newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecboatrufflePackage.FUN__BODY, null, msgs);
    	msgs = basicSetBody(newBody, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.FUN__BODY, newBody, newBody));
  }
  
  public NotificationChain basicSetBody(final Expr newBody, final NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Expr oldBody = body;
    body = newBody;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecboatrufflePackage.FUN__BODY,
    			oldBody, newBody);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }
  
  public Expr getBody() {
    return this.body;
  }
  
  protected EClass eStaticClass() {
    return ExecboatrufflePackage.Literals.FUN;
  }
  
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FUN__NAME:
    	setName((String) newValue);
    return;
    case execboatruffle.ExecboatrufflePackage.FUN__BODY:
    	setBody((ExprImpl) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }
  
  public void eUnset(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FUN__NAME:
    	setName(NAME_EDEFAULT);
    return;
    case execboatruffle.ExecboatrufflePackage.FUN__BODY:
    	setBody((ExprImpl) null);
    return;
    }
    super.eUnset(featureID);
  }
  
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FUN__NAME:
    	return getName();
    case execboatruffle.ExecboatrufflePackage.FUN__BODY:
    	return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }
  
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    case execboatruffle.ExecboatrufflePackage.FUN__NAME:
    	return name != NAME_EDEFAULT;
    case execboatruffle.ExecboatrufflePackage.FUN__BODY:
    	return body != null;
    }
    return super.eIsSet(featureID);
  }
  
  public Object eval(final EvalCtx ctx) {
    return new Func(this.name, ctx, this.body);
  }
}
