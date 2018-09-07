package ale3sem.revisitor.impl;

import ale3.C1;
import ale3.C2;
import ale3.revisitor.Ale3Revisitor;
import ale3sem.revisitor.operations.ale3sem.C1Operation;
import ale3sem.revisitor.operations.ale3sem.C2Operation;

@SuppressWarnings("all")
public interface Ale3semRevisitor extends Ale3Revisitor<C1Operation, C2Operation> {
  @Override
  public default C1Operation ale3__C1(final C1 it) {
    return new ale3sem.revisitor.operations.ale3sem.impl.C1OperationImpl(it, this);
  }
  
  @Override
  public default C2Operation ale3__C2(final C2 it) {
    return new ale3sem.revisitor.operations.ale3sem.impl.C2OperationImpl(it, this);
  }
}
