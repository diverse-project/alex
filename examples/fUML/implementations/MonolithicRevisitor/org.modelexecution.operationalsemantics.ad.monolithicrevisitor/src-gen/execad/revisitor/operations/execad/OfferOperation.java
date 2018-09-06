package execad.revisitor.operations.execad;

@SuppressWarnings("all")
public interface OfferOperation {
  public abstract boolean hasTokens();
  
  public abstract void removeWithdrawnTokens();
}
