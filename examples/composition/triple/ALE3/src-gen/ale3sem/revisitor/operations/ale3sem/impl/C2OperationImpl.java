package ale3sem.revisitor.operations.ale3sem.impl;

import ale3.C2;
import ale3.revisitor.Ale3Revisitor;
import ale3sem.revisitor.operations.ale3sem.C1Operation;
import ale3sem.revisitor.operations.ale3sem.C2Operation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class C2OperationImpl implements C2Operation {
  private C2 obj;
  
  private Ale3Revisitor<? extends C1Operation, ? extends C2Operation> alg;
  
  public C2OperationImpl(final C2 obj, final Ale3Revisitor<? extends C1Operation, ? extends C2Operation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void printC() {
    InputOutput.<String>println("C1");
  }
}
