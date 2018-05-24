package iotlua.revisitor.operations.iotlua.impl;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ContextOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlFlowOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.DecisionNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExpressionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ForkedTokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InitialNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.InputValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OfferOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TokenOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.TraceOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ValueOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.VariableOperation;
import activitydiagramruntime.Context;
import iotlua.IntegerVariableBindStatement_Assignment;
import iotlua.revisitor.IotluaRevisitor;
import iotlua.revisitor.operations.iotlua.BooleanValueBindExpressionOperation;
import iotlua.revisitor.operations.iotlua.BooleanVariableBindStatement_AssignmentOperation;
import iotlua.revisitor.operations.iotlua.ExpressionBindStatementOperation;
import iotlua.revisitor.operations.iotlua.IntegerValueBindExpression_NumberOperation;
import iotlua.revisitor.operations.iotlua.IntegerVariableBindStatement_AssignmentOperation;
import iotlua.revisitor.operations.iotlua.ValueBindExpressionOperation;
import lua_exec.revisitor.operations.lua_exec.BlockOperation;
import lua_exec.revisitor.operations.lua_exec.ChunkOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AccessArrayOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AccessMemberOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_AndOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_CallFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ConcatenationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_DivisionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ExponentiationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_FalseOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_FunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_InvertOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_LargerOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Larger_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_LengthOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_MinusOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_ModuloOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_MultiplicationOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NegateOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NilOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Not_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_NumberOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_OrOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_PlusOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_SmallerOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_Smaller_EqualOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_StringOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_TableConstructorOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_TrueOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_VarArgsOperation;
import lua_exec.revisitor.operations.lua_exec.Expression_VariableNameOperation;
import lua_exec.revisitor.operations.lua_exec.FieldOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AddEntryToTableOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AddEntryToTable_BracketsOperation;
import lua_exec.revisitor.operations.lua_exec.Field_AppendEntryToTableOperation;
import lua_exec.revisitor.operations.lua_exec.FunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Functioncall_ArgumentsOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatementOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_BreakOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_ReturnOperation;
import lua_exec.revisitor.operations.lua_exec.LastStatement_ReturnWithValueOperation;
import lua_exec.revisitor.operations.lua_exec.StatementOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_AssignmentOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_BlockOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_CallFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_CallMemberFunctionOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_For_GenericOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_For_NumericOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_FunctioncallOrAssignmentOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_GlobalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_If_Then_ElseOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_If_Then_Else_ElseIfPartOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_LocalFunction_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_Local_Variable_DeclarationOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_RepeatOperation;
import lua_exec.revisitor.operations.lua_exec.Statement_WhileOperation;

@SuppressWarnings("all")
public class IntegerVariableBindStatement_AssignmentOperationImpl implements IntegerVariableBindStatement_AssignmentOperation {
  private IntegerVariableBindStatement_Assignment obj;
  
  private IotluaRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BlockOperation, BooleanValueOperation, BooleanValueBindExpressionOperation, BooleanVariableOperation, BooleanVariableBindStatement_AssignmentOperation, ChunkOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, lua_exec.revisitor.operations.lua_exec.ExpressionOperation, ExpressionBindStatementOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, FunctionOperation, Functioncall_ArgumentsOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerValueBindExpression_NumberOperation, IntegerVariableOperation, IntegerVariableBindStatement_AssignmentOperation, JoinNodeOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation, TokenOperation, TraceOperation, ValueOperation, ValueBindExpressionOperation, VariableOperation> alg;
  
  public IntegerVariableBindStatement_AssignmentOperationImpl(final IntegerVariableBindStatement_Assignment obj, final IotluaRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BlockOperation, BooleanValueOperation, BooleanValueBindExpressionOperation, BooleanVariableOperation, BooleanVariableBindStatement_AssignmentOperation, ChunkOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, lua_exec.revisitor.operations.lua_exec.ExpressionOperation, ExpressionBindStatementOperation, Expression_AccessArrayOperation, Expression_AccessMemberOperation, Expression_AndOperation, Expression_CallFunctionOperation, Expression_CallMemberFunctionOperation, Expression_ConcatenationOperation, Expression_DivisionOperation, Expression_EqualOperation, Expression_ExponentiationOperation, Expression_FalseOperation, Expression_FunctionOperation, Expression_InvertOperation, Expression_LargerOperation, Expression_Larger_EqualOperation, Expression_LengthOperation, Expression_MinusOperation, Expression_ModuloOperation, Expression_MultiplicationOperation, Expression_NegateOperation, Expression_NilOperation, Expression_Not_EqualOperation, Expression_NumberOperation, Expression_OrOperation, Expression_PlusOperation, Expression_SmallerOperation, Expression_Smaller_EqualOperation, Expression_StringOperation, Expression_TableConstructorOperation, Expression_TrueOperation, Expression_VarArgsOperation, Expression_VariableNameOperation, FieldOperation, Field_AddEntryToTableOperation, Field_AddEntryToTable_BracketsOperation, Field_AppendEntryToTableOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, FunctionOperation, Functioncall_ArgumentsOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerValueOperation, IntegerValueBindExpression_NumberOperation, IntegerVariableOperation, IntegerVariableBindStatement_AssignmentOperation, JoinNodeOperation, LastStatementOperation, LastStatement_BreakOperation, LastStatement_ReturnOperation, LastStatement_ReturnWithValueOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, StatementOperation, Statement_AssignmentOperation, Statement_BlockOperation, Statement_CallFunctionOperation, Statement_CallMemberFunctionOperation, Statement_For_GenericOperation, Statement_For_NumericOperation, Statement_FunctioncallOrAssignmentOperation, Statement_GlobalFunction_DeclarationOperation, Statement_If_Then_ElseOperation, Statement_If_Then_Else_ElseIfPartOperation, Statement_LocalFunction_DeclarationOperation, Statement_Local_Variable_DeclarationOperation, Statement_RepeatOperation, Statement_WhileOperation, TokenOperation, TraceOperation, ValueOperation, ValueBindExpressionOperation, VariableOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute(final Context c) {
    iotlua.converters.IntegerVariableToStatement_AssignmentWithexecuteToexecute convert =  new iotlua.converters.IntegerVariableToStatement_AssignmentWithexecuteToexecute(c);
    
    
    org.xtext.lua.semantics.model.Environment c3 = convert.adaptc();
    convert.setC3(c3);
    
    
    alg.$(obj.getDelegate()).execute(c3);
    
    
  }
  
  @Override
  public String print() {
    return alg.$(obj.getDelegate()).print();
  }
  
  @Override
  public void init(final Context c) {
    alg.$(obj.getDelegate()).init();
  }
}