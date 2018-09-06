package execad.revisitor.operations.execad;

import activitydiagram.Token;
import execad.revisitor.operations.execad.NamedElementOperation;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityEdgeOperation extends NamedElementOperation {
  public abstract void sendOffer(final List<Token> tokens);
  
  public abstract List<Token> takeOfferedTokens();
  
  public abstract boolean hasOffer();
}
