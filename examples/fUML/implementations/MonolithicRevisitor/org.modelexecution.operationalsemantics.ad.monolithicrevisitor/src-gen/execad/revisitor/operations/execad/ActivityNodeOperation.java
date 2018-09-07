package execad.revisitor.operations.execad;

import activitydiagram.Token;
import execad.revisitor.operations.execad.NamedElementOperation;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityNodeOperation extends NamedElementOperation {
  public abstract void run();
  
  public abstract boolean isReady();
  
  public abstract void sendOffers(final List<Token> tokens);
  
  public abstract List<Token> takeOfferedTokens();
  
  public abstract void addTokens(final List<Token> tokens);
  
  public abstract void removeToken(final Token token);
  
  public abstract boolean hasOffers();
  
  public abstract void terminate();
  
  public abstract void fire(final List<Token> tokens);
}
