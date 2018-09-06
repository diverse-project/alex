package test.revisitor.impl;

import dispatch.A;
import dispatch.B;
import dispatch.C;
import dispatch.Container;
import dispatch.D;
import dispatch.E;
import dispatch.F;
import dispatch.G;
import dispatch.H;
import dispatch.I;
import dispatch.J;
import test.revisitor.operations.test.AOperation;
import test.revisitor.operations.test.BOperation;
import test.revisitor.operations.test.COperation;
import test.revisitor.operations.test.ContainerOperation;
import test.revisitor.operations.test.DOperation;
import test.revisitor.operations.test.EOperation;
import test.revisitor.operations.test.FOperation;
import test.revisitor.operations.test.GOperation;
import test.revisitor.operations.test.HOperation;
import test.revisitor.operations.test.IOperation;
import test.revisitor.operations.test.JOperation;

@SuppressWarnings("all")
public interface TestRevisitor extends dispatch.revisitor.DispatchRevisitor {
  @Override
  public default AOperation dispatch__A(final A it) {
    return new test.revisitor.operations.test.impl.AOperationImpl(it, this);
  }
  
  @Override
  public default BOperation dispatch__B(final B it) {
    return new test.revisitor.operations.test.impl.BOperationImpl(it, this);
  }
  
  @Override
  public default COperation dispatch__C(final C it) {
    return new test.revisitor.operations.test.impl.COperationImpl(it, this);
  }
  
  @Override
  public default ContainerOperation dispatch__Container(final Container it) {
    return new test.revisitor.operations.test.impl.ContainerOperationImpl(it, this);
  }
  
  @Override
  public default DOperation dispatch__D(final D it) {
    return new test.revisitor.operations.test.impl.DOperationImpl(it, this);
  }
  
  @Override
  public default EOperation dispatch__E(final E it) {
    return new test.revisitor.operations.test.impl.EOperationImpl(it, this);
  }
  
  @Override
  public default FOperation dispatch__F(final F it) {
    return new test.revisitor.operations.test.impl.FOperationImpl(it, this);
  }
  
  @Override
  public default GOperation dispatch__G(final G it) {
    return new test.revisitor.operations.test.impl.GOperationImpl(it, this);
  }
  
  @Override
  public default HOperation dispatch__H(final H it) {
    return new test.revisitor.operations.test.impl.HOperationImpl(it, this);
  }
  
  @Override
  public default HOperation dispatch__H__AS__dispatch__D(final H it) {
    return new test.revisitor.operations.test.impl.HOperationImpl(it, this);
  }
  
  @Override
  public default HOperation dispatch__H__AS__dispatch__E(final H it) {
    return new test.revisitor.operations.test.impl.HOperationImpl(it, this);
  }
  
  @Override
  public default IOperation dispatch__I(final I it) {
    return new test.revisitor.operations.test.impl.IOperationImpl(it, this);
  }
  
  @Override
  public default IOperation dispatch__I__AS__dispatch__F(final I it) {
    return new test.revisitor.operations.test.impl.IOperationImpl(it, this);
  }
  
  @Override
  public default IOperation dispatch__I__AS__dispatch__G(final I it) {
    return new test.revisitor.operations.test.impl.IOperationImpl(it, this);
  }
  
  @Override
  public default JOperation dispatch__J(final J it) {
    return new test.revisitor.operations.test.impl.JOperationImpl(it, this);
  }
  
  @Override
  public default JOperation dispatch__J__AS__dispatch__D(final J it) {
    return new test.revisitor.operations.test.impl.JOperationImpl(it, this);
  }
  
  @Override
  public default JOperation dispatch__J__AS__dispatch__E(final J it) {
    return new test.revisitor.operations.test.impl.JOperationImpl(it, this);
  }
  
  @Override
  public default JOperation dispatch__J__AS__dispatch__F(final J it) {
    return new test.revisitor.operations.test.impl.JOperationImpl(it, this);
  }
  
  @Override
  public default JOperation dispatch__J__AS__dispatch__G(final J it) {
    return new test.revisitor.operations.test.impl.JOperationImpl(it, this);
  }
  
  @Override
  public default JOperation dispatch__J__AS__dispatch__H(final J it) {
    return new test.revisitor.operations.test.impl.JOperationImpl(it, this);
  }
  
  @Override
  public default JOperation dispatch__J__AS__dispatch__I(final J it) {
    return new test.revisitor.operations.test.impl.JOperationImpl(it, this);
  }
}
