package execad.revisitor.operations.execad;

import activitydiagram.Token;
import execad.revisitor.operations.execad.ActivityNodeOperation;
import execad.revisitor.operations.execad.ExecutableNodeOperation;
import execad.revisitor.operations.execad.NamedElementOperation;
import java.util.List;

@SuppressWarnings("all")
public interface ActionOperation extends ExecutableNodeOperation, ActivityNodeOperation, NamedElementOperation {
  public abstract void doAction();
  
  public abstract boolean isReady();
  
  public abstract void sendOffers();
  
  public abstract void fire(final List<Token> tokens);
}
