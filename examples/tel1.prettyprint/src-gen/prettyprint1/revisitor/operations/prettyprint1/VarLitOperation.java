package prettyprint1.revisitor.operations.prettyprint1;

import prettyprint.revisitor.operations.prettyprint.ExpOperation;

@SuppressWarnings("all")
public interface VarLitOperation extends ExpOperation, prettyprint1.revisitor.operations.prettyprint1.ExpOperation {
  public abstract String print();
}
