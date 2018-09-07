package ale1sem.revisitor.impl;

import ale1.A1;
import ale1.revisitor.Ale1Revisitor;
import ale1sem.revisitor.operations.ale1sem.A1Operation;
import ale1sem.revisitor.operations.ale1sem.RA1Operation;
import ale1sem.revisitor.operations.ale1sem.RA2Operation;

@SuppressWarnings("all")
public interface Ale1semRevisitor extends Ale1Revisitor<A1Operation, RA1Operation, RA2Operation> {
  @Override
  public default A1Operation ale1__A1(final A1 it) {
    return new ale1sem.revisitor.operations.ale1sem.impl.A1OperationImpl(it, this);
  }
}
