package execboatruffle.impl;

import execboatruffle.ExecboatrufflePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

@SuppressWarnings("all")
public class ExecboatrufflePackageImpl extends EPackageImpl implements ExecboatrufflePackage {
  private static boolean isInited;
  
  private static boolean isCreated;
  
  private static boolean isInitialized;
  
  public static ExecboatrufflePackage init() {
    if (isInited)
    	return (execboatruffle.ExecboatrufflePackage) EPackage.Registry.INSTANCE.getEPackage(execboatruffle.ExecboatrufflePackage.eNS_URI);
    
    // Obtain or create and register package
    Object registeredExecboatrufflePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    execboatruffle.impl.ExecboatrufflePackageImpl theExecboatrufflePackage = registeredExecboatrufflePackage instanceof execboatruffle.impl.ExecboatrufflePackageImpl
    		? (execboatruffle.impl.ExecboatrufflePackageImpl) registeredExecboatrufflePackage
    		: new execboatruffle.impl.ExecboatrufflePackageImpl();
    
    isInited = true;
    
    // Create package meta-data objects
    theExecboatrufflePackage.createPackageContents();
    
    // Initialize created meta-data
    theExecboatrufflePackage.initializePackageContents();
    
    // Mark meta-data to indicate it can't be changed
    theExecboatrufflePackage.freeze();
    
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(theExecboatrufflePackage.eNS_URI, theExecboatrufflePackage);
    return theExecboatrufflePackage;
  }
  
  public void createPackageContents() {
    if(isCreated) return;
    isCreated = true;
    
    fileEClass = createEClass(FILE);
    createEReference(fileEClass, FILE__COMMANDS);
    topLevelCmdEClass = createEClass(TOP_LEVEL_CMD);
    exprEClass = createEClass(EXPR);
    defEClass = createEClass(DEF);
    createEAttribute(defEClass, DEF__NAME);
    createEReference(defEClass, DEF__EXPR);
    appEClass = createEClass(APP);
    createEReference(appEClass, APP__LHS);
    createEReference(appEClass, APP__RHS);
    varEClass = createEClass(VAR);
    createEAttribute(varEClass, VAR__NAME);
    thisEClass = createEClass(THIS);
    boolEClass = createEClass(BOOL);
    createEAttribute(boolEClass, BOOL__VALUE);
    intEClass = createEClass(INT);
    createEAttribute(intEClass, INT__VALUE);
    skipEClass = createEClass(SKIP);
    projectEClass = createEClass(PROJECT);
    createEAttribute(projectEClass, PROJECT__NAME);
    createEReference(projectEClass, PROJECT__EXP);
    bObjectEClass = createEClass(BOBJECT);
    createEReference(bObjectEClass, BOBJECT__FIELDS);
    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__NAME);
    createEReference(fieldEClass, FIELD__VALUE);
    copyEClass = createEClass(COPY);
    createEReference(copyEClass, COPY__COPY);
    withEClass = createEClass(WITH);
    createEReference(withEClass, WITH__LHS);
    createEReference(withEClass, WITH__RHS);
    arithOpEClass = createEClass(ARITH_OP);
    createEReference(arithOpEClass, ARITH_OP__LHS);
    createEReference(arithOpEClass, ARITH_OP__RHS);
    notEClass = createEClass(NOT);
    createEReference(notEClass, NOT__VALUE);
    cmpOpEClass = createEClass(CMP_OP);
    createEReference(cmpOpEClass, CMP_OP__LHS);
    createEReference(cmpOpEClass, CMP_OP__RHS);
    boolOpEClass = createEClass(BOOL_OP);
    ifEClass = createEClass(IF);
    createEReference(ifEClass, IF__COND);
    createEReference(ifEClass, IF__THEN);
    createEReference(ifEClass, IF__ELS);
    letEClass = createEClass(LET);
    createEAttribute(letEClass, LET__NAME);
    createEReference(letEClass, LET__LHS);
    createEReference(letEClass, LET__RHS);
    funEClass = createEClass(FUN);
    createEAttribute(funEClass, FUN__NAME);
    createEReference(funEClass, FUN__BODY);
    assignEClass = createEClass(ASSIGN);
    createEAttribute(assignEClass, ASSIGN__NAME);
    createEReference(assignEClass, ASSIGN__LHS);
    createEReference(assignEClass, ASSIGN__RHS);
    arithOpPlusEClass = createEClass(ARITH_OP_PLUS);
    arithOpMinusEClass = createEClass(ARITH_OP_MINUS);
    arithOpTimesEClass = createEClass(ARITH_OP_TIMES);
    arithOpDivideEClass = createEClass(ARITH_OP_DIVIDE);
    arithOpRemainderEClass = createEClass(ARITH_OP_REMAINDER);
    boolOpAndEClass = createEClass(BOOL_OP_AND);
    createEReference(boolOpAndEClass, BOOL_OP_AND__LHS);
    createEReference(boolOpAndEClass, BOOL_OP_AND__RHS);
    boolOpOrEClass = createEClass(BOOL_OP_OR);
    createEReference(boolOpOrEClass, BOOL_OP_OR__LHS);
    createEReference(boolOpOrEClass, BOOL_OP_OR__RHS);
    seqEClass = createEClass(SEQ);
    createEReference(seqEClass, SEQ__LHS);
    createEReference(seqEClass, SEQ__RHS);
    cmpOpEqualEClass = createEClass(CMP_OP_EQUAL);
    cmpOpUnequalEClass = createEClass(CMP_OP_UNEQUAL);
    cmpOpLessEClass = createEClass(CMP_OP_LESS);
  }
  
  public void initializePackageContents() {
    if (isInitialized)
    	return;
    isInitialized = true;
    
    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);
    
    // Create type parameters
    
    // Set bounds for type parameters
    
    // Add supertypes to classes
    exprEClass.getESuperTypes().add(this.getTopLevelCmd());
    defEClass.getESuperTypes().add(this.getTopLevelCmd());
    appEClass.getESuperTypes().add(this.getExpr());
    varEClass.getESuperTypes().add(this.getExpr());
    thisEClass.getESuperTypes().add(this.getExpr());
    boolEClass.getESuperTypes().add(this.getExpr());
    intEClass.getESuperTypes().add(this.getExpr());
    skipEClass.getESuperTypes().add(this.getExpr());
    projectEClass.getESuperTypes().add(this.getExpr());
    bObjectEClass.getESuperTypes().add(this.getExpr());
    copyEClass.getESuperTypes().add(this.getExpr());
    withEClass.getESuperTypes().add(this.getExpr());
    arithOpEClass.getESuperTypes().add(this.getExpr());
    notEClass.getESuperTypes().add(this.getExpr());
    cmpOpEClass.getESuperTypes().add(this.getExpr());
    boolOpEClass.getESuperTypes().add(this.getExpr());
    ifEClass.getESuperTypes().add(this.getExpr());
    letEClass.getESuperTypes().add(this.getExpr());
    funEClass.getESuperTypes().add(this.getExpr());
    assignEClass.getESuperTypes().add(this.getExpr());
    arithOpPlusEClass.getESuperTypes().add(this.getArithOp());
    arithOpMinusEClass.getESuperTypes().add(this.getArithOp());
    arithOpTimesEClass.getESuperTypes().add(this.getArithOp());
    arithOpDivideEClass.getESuperTypes().add(this.getArithOp());
    arithOpRemainderEClass.getESuperTypes().add(this.getArithOp());
    boolOpAndEClass.getESuperTypes().add(this.getBoolOp());
    boolOpOrEClass.getESuperTypes().add(this.getBoolOp());
    seqEClass.getESuperTypes().add(this.getExpr());
    cmpOpEqualEClass.getESuperTypes().add(this.getCmpOp());
    cmpOpUnequalEClass.getESuperTypes().add(this.getCmpOp());
    cmpOpLessEClass.getESuperTypes().add(this.getCmpOp());
    
    // Initialize classes, features, and operations; add parameters
    initEClass(fileEClass, execboatruffle.File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFile_Commands(), this.getTopLevelCmd(), null, "commands", null, 0, -1, execboatruffle.File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(topLevelCmdEClass, execboatruffle.TopLevelCmd.class, "TopLevelCmd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(exprEClass, execboatruffle.Expr.class, "Expr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(defEClass, execboatruffle.Def.class, "Def", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, execboatruffle.Def.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getDef_Expr(), this.getExpr(), null, "expr", null, 1, 1, execboatruffle.Def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(appEClass, execboatruffle.App.class, "App", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApp_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getApp_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(varEClass, execboatruffle.Var.class, "Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, execboatruffle.Var.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(thisEClass, execboatruffle.This.class, "This", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(boolEClass, execboatruffle.Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBool_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, execboatruffle.Bool.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(intEClass, execboatruffle.Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, execboatruffle.Int.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(skipEClass, execboatruffle.Skip.class, "Skip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(projectEClass, execboatruffle.Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, execboatruffle.Project.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getProject_Exp(), this.getExpr(), null, "exp", null, 1, 1, execboatruffle.Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(bObjectEClass, execboatruffle.BObject.class, "BObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBobject_Fields(), this.getField(), null, "fields", null, 0, -1, execboatruffle.BObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(fieldEClass, execboatruffle.Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, execboatruffle.Field.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getField_Value(), this.getExpr(), null, "value", null, 1, 1, execboatruffle.Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(copyEClass, execboatruffle.Copy.class, "Copy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCopy_Copy(), this.getExpr(), null, "copy", null, 1, 1, execboatruffle.Copy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(withEClass, execboatruffle.With.class, "With", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWith_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.With.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getWith_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.With.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(arithOpEClass, execboatruffle.ArithOp.class, "ArithOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArith_op_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.ArithOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getArith_op_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.ArithOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(notEClass, execboatruffle.Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNot_Value(), this.getExpr(), null, "value", null, 1, 1, execboatruffle.Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(cmpOpEClass, execboatruffle.CmpOp.class, "CmpOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCmp_op_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.CmpOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getCmp_op_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.CmpOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(boolOpEClass, execboatruffle.BoolOp.class, "BoolOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(ifEClass, execboatruffle.If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIf_Cond(), this.getExpr(), null, "cond", null, 1, 1, execboatruffle.If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getIf_Then(), this.getExpr(), null, "then", null, 1, 1, execboatruffle.If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getIf_Els(), this.getExpr(), null, "els", null, 1, 1, execboatruffle.If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(letEClass, execboatruffle.Let.class, "Let", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLet_Name(), ecorePackage.getEString(), "name", null, 0, 1, execboatruffle.Let.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getLet_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.Let.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getLet_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.Let.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(funEClass, execboatruffle.Fun.class, "Fun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFun_Name(), ecorePackage.getEString(), "name", null, 0, 1, execboatruffle.Fun.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getFun_Body(), this.getExpr(), null, "body", null, 1, 1, execboatruffle.Fun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(assignEClass, execboatruffle.Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssign_Name(), ecorePackage.getEString(), "name", null, 0, 1, execboatruffle.Assign.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getAssign_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getAssign_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(arithOpPlusEClass, execboatruffle.ArithOpPlus.class, "ArithOpPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(arithOpMinusEClass, execboatruffle.ArithOpMinus.class, "ArithOpMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(arithOpTimesEClass, execboatruffle.ArithOpTimes.class, "ArithOpTimes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(arithOpDivideEClass, execboatruffle.ArithOpDivide.class, "ArithOpDivide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(arithOpRemainderEClass, execboatruffle.ArithOpRemainder.class, "ArithOpRemainder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(boolOpAndEClass, execboatruffle.BoolOpAnd.class, "BoolOpAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBool_op_and_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.BoolOpAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getBool_op_and_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.BoolOpAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(boolOpOrEClass, execboatruffle.BoolOpOr.class, "BoolOpOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBool_op_or_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.BoolOpOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getBool_op_or_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.BoolOpOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(seqEClass, execboatruffle.Seq.class, "Seq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSeq_Lhs(), this.getExpr(), null, "lhs", null, 1, 1, execboatruffle.Seq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getSeq_Rhs(), this.getExpr(), null, "rhs", null, 1, 1, execboatruffle.Seq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(cmpOpEqualEClass, execboatruffle.CmpOpEqual.class, "CmpOpEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(cmpOpUnequalEClass, execboatruffle.CmpOpUnequal.class, "CmpOpUnequal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(cmpOpLessEClass, execboatruffle.CmpOpLess.class, "CmpOpLess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    // Create resource
    createResource(eNS_URI);
  }
  
  private EClass fileEClass = null;
  
  private EClass topLevelCmdEClass = null;
  
  private EClass exprEClass = null;
  
  private EClass defEClass = null;
  
  private EClass appEClass = null;
  
  private EClass varEClass = null;
  
  private EClass thisEClass = null;
  
  private EClass boolEClass = null;
  
  private EClass intEClass = null;
  
  private EClass skipEClass = null;
  
  private EClass projectEClass = null;
  
  private EClass bObjectEClass = null;
  
  private EClass fieldEClass = null;
  
  private EClass copyEClass = null;
  
  private EClass withEClass = null;
  
  private EClass arithOpEClass = null;
  
  private EClass notEClass = null;
  
  private EClass cmpOpEClass = null;
  
  private EClass boolOpEClass = null;
  
  private EClass ifEClass = null;
  
  private EClass letEClass = null;
  
  private EClass funEClass = null;
  
  private EClass assignEClass = null;
  
  private EClass arithOpPlusEClass = null;
  
  private EClass arithOpMinusEClass = null;
  
  private EClass arithOpTimesEClass = null;
  
  private EClass arithOpDivideEClass = null;
  
  private EClass arithOpRemainderEClass = null;
  
  private EClass boolOpAndEClass = null;
  
  private EClass boolOpOrEClass = null;
  
  private EClass seqEClass = null;
  
  private EClass cmpOpEqualEClass = null;
  
  private EClass cmpOpUnequalEClass = null;
  
  private EClass cmpOpLessEClass = null;
  
  public EClass getFile() {
    return fileEClass;
  }
  
  public EClass getTopLevelCmd() {
    return topLevelCmdEClass;
  }
  
  public EClass getExpr() {
    return exprEClass;
  }
  
  public EClass getDef() {
    return defEClass;
  }
  
  public EClass getApp() {
    return appEClass;
  }
  
  public EClass getVar() {
    return varEClass;
  }
  
  public EClass getThis() {
    return thisEClass;
  }
  
  public EClass getBool() {
    return boolEClass;
  }
  
  public EClass getInt() {
    return intEClass;
  }
  
  public EClass getSkip() {
    return skipEClass;
  }
  
  public EClass getProject() {
    return projectEClass;
  }
  
  public EClass getBObject() {
    return bObjectEClass;
  }
  
  public EClass getField() {
    return fieldEClass;
  }
  
  public EClass getCopy() {
    return copyEClass;
  }
  
  public EClass getWith() {
    return withEClass;
  }
  
  public EClass getArithOp() {
    return arithOpEClass;
  }
  
  public EClass getNot() {
    return notEClass;
  }
  
  public EClass getCmpOp() {
    return cmpOpEClass;
  }
  
  public EClass getBoolOp() {
    return boolOpEClass;
  }
  
  public EClass getIf() {
    return ifEClass;
  }
  
  public EClass getLet() {
    return letEClass;
  }
  
  public EClass getFun() {
    return funEClass;
  }
  
  public EClass getAssign() {
    return assignEClass;
  }
  
  public EClass getArithOpPlus() {
    return arithOpPlusEClass;
  }
  
  public EClass getArithOpMinus() {
    return arithOpMinusEClass;
  }
  
  public EClass getArithOpTimes() {
    return arithOpTimesEClass;
  }
  
  public EClass getArithOpDivide() {
    return arithOpDivideEClass;
  }
  
  public EClass getArithOpRemainder() {
    return arithOpRemainderEClass;
  }
  
  public EClass getBoolOpAnd() {
    return boolOpAndEClass;
  }
  
  public EClass getBoolOpOr() {
    return boolOpOrEClass;
  }
  
  public EClass getSeq() {
    return seqEClass;
  }
  
  public EClass getCmpOpEqual() {
    return cmpOpEqualEClass;
  }
  
  public EClass getCmpOpUnequal() {
    return cmpOpUnequalEClass;
  }
  
  public EClass getCmpOpLess() {
    return cmpOpLessEClass;
  }
  
  public EReference getFile_Commands() {
    return (EReference) fileEClass.getEStructuralFeatures().get(0);
  }
  
  public EAttribute getDef_Name() {
    return (EAttribute) defEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getDef_Expr() {
    return (EReference) defEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getApp_Lhs() {
    return (EReference) appEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getApp_Rhs() {
    return (EReference) appEClass.getEStructuralFeatures().get(1);
  }
  
  public EAttribute getVar_Name() {
    return (EAttribute) varEClass.getEStructuralFeatures().get(0);
  }
  
  public EAttribute getBool_Value() {
    return (EAttribute) boolEClass.getEStructuralFeatures().get(0);
  }
  
  public EAttribute getInt_Value() {
    return (EAttribute) intEClass.getEStructuralFeatures().get(0);
  }
  
  public EAttribute getProject_Name() {
    return (EAttribute) projectEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getProject_Exp() {
    return (EReference) projectEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getBobject_Fields() {
    return (EReference) bObjectEClass.getEStructuralFeatures().get(0);
  }
  
  public EAttribute getField_Name() {
    return (EAttribute) fieldEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getField_Value() {
    return (EReference) fieldEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getCopy_Copy() {
    return (EReference) copyEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getWith_Lhs() {
    return (EReference) withEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getWith_Rhs() {
    return (EReference) withEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getArith_op_Lhs() {
    return (EReference) arithOpEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getArith_op_Rhs() {
    return (EReference) arithOpEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getNot_Value() {
    return (EReference) notEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getCmp_op_Lhs() {
    return (EReference) cmpOpEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getCmp_op_Rhs() {
    return (EReference) cmpOpEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getIf_Cond() {
    return (EReference) ifEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getIf_Then() {
    return (EReference) ifEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getIf_Els() {
    return (EReference) ifEClass.getEStructuralFeatures().get(2);
  }
  
  public EAttribute getLet_Name() {
    return (EAttribute) letEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getLet_Lhs() {
    return (EReference) letEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getLet_Rhs() {
    return (EReference) letEClass.getEStructuralFeatures().get(2);
  }
  
  public EAttribute getFun_Name() {
    return (EAttribute) funEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getFun_Body() {
    return (EReference) funEClass.getEStructuralFeatures().get(1);
  }
  
  public EAttribute getAssign_Name() {
    return (EAttribute) assignEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getAssign_Lhs() {
    return (EReference) assignEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getAssign_Rhs() {
    return (EReference) assignEClass.getEStructuralFeatures().get(2);
  }
  
  public EReference getBool_op_and_Lhs() {
    return (EReference) boolOpAndEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getBool_op_and_Rhs() {
    return (EReference) boolOpAndEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getBool_op_or_Lhs() {
    return (EReference) boolOpOrEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getBool_op_or_Rhs() {
    return (EReference) boolOpOrEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getSeq_Lhs() {
    return (EReference) seqEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getSeq_Rhs() {
    return (EReference) seqEClass.getEStructuralFeatures().get(1);
  }
  
  private ExecboatrufflePackageImpl() {
    super(eNS_URI, execboatruffle.ExecboatruffleFactory.eINSTANCE);
  }
}
