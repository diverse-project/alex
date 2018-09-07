package ale2sem.revisitor.impl;

import ale2.B;
import ale2.revisitor.Ale2Revisitor;
import ale2sem.revisitor.operations.ale2sem.BOperation;
import ale2sem.revisitor.operations.ale2sem.RBOperation;

@SuppressWarnings("all")
public interface Ale2semRevisitor extends Ale2Revisitor<BOperation, RBOperation> {
  @Override
  public default BOperation ale2__B(final B it) {
    return new ale2sem.revisitor.operations.ale2sem.impl.BOperationImpl(it, this);
  }
}
