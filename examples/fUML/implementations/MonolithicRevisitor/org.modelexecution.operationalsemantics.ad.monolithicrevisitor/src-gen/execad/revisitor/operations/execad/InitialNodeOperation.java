package execad.revisitor.operations.execad;

import activitydiagram.Token;
import execad.revisitor.operations.execad.ActivityNodeOperation;
import execad.revisitor.operations.execad.ControlNodeOperation;
import execad.revisitor.operations.execad.NamedElementOperation;
import java.util.List;

@SuppressWarnings("all")
public interface InitialNodeOperation extends ControlNodeOperation, ActivityNodeOperation, NamedElementOperation {
  public abstract void fire(final List<Token> tokens);
  
  public abstract boolean isReady();
}
