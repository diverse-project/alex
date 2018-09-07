package execad.revisitor.operations.execad;

import execad.revisitor.operations.execad.TokenOperation;

@SuppressWarnings("all")
public interface ForkedTokenOperation extends TokenOperation {
  public abstract void withdraw();
}
