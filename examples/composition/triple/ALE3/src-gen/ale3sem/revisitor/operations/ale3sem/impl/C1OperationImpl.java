package ale3sem.revisitor.operations.ale3sem.impl;

import ale3.C1;
import ale3.revisitor.Ale3Revisitor;
import ale3sem.revisitor.operations.ale3sem.C1Operation;
import ale3sem.revisitor.operations.ale3sem.C2Operation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class C1OperationImpl implements C1Operation {
  private C1 obj;
  
  private Ale3Revisitor<? extends C1Operation, ? extends C2Operation> alg;
  
  public C1OperationImpl(final C1 obj, final Ale3Revisitor<? extends C1Operation, ? extends C2Operation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void printC() {
    InputOutput.<String>println("C1");
  }
}
