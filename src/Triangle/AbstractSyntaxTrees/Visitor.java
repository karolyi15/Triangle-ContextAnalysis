/*
 * @(#)Visitor.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.AbstractSyntaxTrees;

public interface Visitor {
  
  //Packages
  public abstract Object visitPackageIdentifierSimple(PackageIdentifierSimple ast, Object o);
  public abstract Object visitPackageIdentifierEmpty(PackageIdentifierEmpty ast, Object o);
  public abstract Object visitPackageCallDeclaration(PackageCallDeclaration ast, Object o);
  public abstract Object visitPackageSequentialDeclaration(PackageSequentialDeclaration ast, Object o);
  public abstract Object visitPackageEmptyDeclaration(PackageEmptyDeclaration ast, Object o);

  // Commands
  public abstract Object visitAssignCommand(AssignCommand ast, Object o);
  public abstract Object visitCallCommand(CallCommand ast, Object o);
  public abstract Object visitEmptyCommand(EmptyCommand ast, Object o);
  public abstract Object visitIfCommand(IfCommand ast, Object o);
  public abstract Object visitLetCommand(LetCommand ast, Object o);
  public abstract Object visitSequentialCommand(SequentialCommand ast, Object o);

  // Elsif
  public abstract Object visitElsif(Elsif ast, Object o);
  public abstract Object visitElsifSequenceEmpty(ElsifSequenceEmpty ast, Object o);
  public abstract Object visitElsifSequenceSingle(ElsifSequenceSingle ast, Object o);
  public abstract Object visitElsifSequenceMultiple(ElsifSequenceMultiple ast, Object o);

  // Loops
  public abstract Object visitLoopConditional(LoopConditional ast, Object o);
  public abstract Object visitLoopPostDoCommand(LoopPostDoCommand ast, Object o);
  public abstract Object visitLoopPreDoCommand(LoopPreDoCommand ast, Object o);
  public abstract Object visitLoopForCommand(LoopForCommand ast, Object o);
  
  // Choose 
  public abstract Object visitCaseLiteralCharacter(CaseLiteralCharacter ast, Object o);
  public abstract Object visitCaseLiteralInteger(CaseLiteralInteger ast, Object o);
  public abstract Object visitCaseRangeOne(CaseRangeOne ast, Object o);
  public abstract Object visitCaseRangeTwo(CaseRangeTwo ast, Object o);
  public abstract Object visitCaseLiteralsSequenceSingle(CaseLiteralsSequenceSingle ast, Object o);
  public abstract Object visitCaseLiteralsSequenceMultiple(CaseLiteralsSequenceMultiple ast, Object o);
  public abstract Object visitCase(Case ast, Object o);
  public abstract Object visitCaseSequenceSingle(CaseSequenceSingle ast, Object o);
  public abstract Object visitCaseSequenceMultiple(CaseSequenceMultiple ast, Object o);
  public abstract Object visitCases(Cases ast, Object o);
  public abstract Object visitCaseCommand(CaseCommand ast, Object o);
  
  
  // Expressions
  public abstract Object visitArrayExpression(ArrayExpression ast, Object o);
  public abstract Object visitBinaryExpression(BinaryExpression ast, Object o);
  public abstract Object visitCallExpression(CallExpression ast, Object o);
  public abstract Object visitCharacterExpression(CharacterExpression ast, Object o);
  public abstract Object visitEmptyExpression(EmptyExpression ast, Object o);
  public abstract Object visitIfExpression(IfExpression ast, Object o);
  public abstract Object visitIntegerExpression(IntegerExpression ast, Object o);
  public abstract Object visitLetExpression(LetExpression ast, Object o);
  public abstract Object visitRecordExpression(RecordExpression ast, Object o);
  public abstract Object visitUnaryExpression(UnaryExpression ast, Object o);
  public abstract Object visitVnameExpression(VnameExpression ast, Object o);

  // Declarations
  public abstract Object visitBinaryOperatorDeclaration(BinaryOperatorDeclaration ast, Object o);
  public abstract Object visitConstDeclaration(ConstDeclaration ast, Object o);
  public abstract Object visitFuncDeclaration(FuncDeclaration ast, Object o);
  public abstract Object visitProcDeclaration(ProcDeclaration ast, Object o);
  public abstract Object visitSequentialDeclaration(SequentialDeclaration ast, Object o);
  public abstract Object visitTypeDeclaration(TypeDeclaration ast, Object o);
  public abstract Object visitUnaryOperatorDeclaration(UnaryOperatorDeclaration ast, Object o);
  public abstract Object visitVarDeclaration(VarDeclaration ast, Object o);

  // Array Aggregates
  public abstract Object visitMultipleArrayAggregate(MultipleArrayAggregate ast, Object o);
  public abstract Object visitSingleArrayAggregate(SingleArrayAggregate ast, Object o);

  // Record Aggregates
  public abstract Object visitMultipleRecordAggregate(MultipleRecordAggregate ast, Object o);
  public abstract Object visitSingleRecordAggregate(SingleRecordAggregate ast, Object o);

  // Formal Parameters
  public abstract Object visitConstFormalParameter(ConstFormalParameter ast, Object o);
  public abstract Object visitFuncFormalParameter(FuncFormalParameter ast, Object o);
  public abstract Object visitProcFormalParameter(ProcFormalParameter ast, Object o);
  public abstract Object visitVarFormalParameter(VarFormalParameter ast, Object o);

  public abstract Object visitEmptyFormalParameterSequence(EmptyFormalParameterSequence ast, Object o);
  public abstract Object visitMultipleFormalParameterSequence(MultipleFormalParameterSequence ast, Object o);
  public abstract Object visitSingleFormalParameterSequence(SingleFormalParameterSequence ast, Object o);

  // Actual Parameters
  public abstract Object visitConstActualParameter(ConstActualParameter ast, Object o);
  public abstract Object visitFuncActualParameter(FuncActualParameter ast, Object o);
  public abstract Object visitProcActualParameter(ProcActualParameter ast, Object o);
  public abstract Object visitVarActualParameter(VarActualParameter ast, Object o);

  public abstract Object visitEmptyActualParameterSequence(EmptyActualParameterSequence ast, Object o);
  public abstract Object visitMultipleActualParameterSequence(MultipleActualParameterSequence ast, Object o);
  public abstract Object visitSingleActualParameterSequence(SingleActualParameterSequence ast, Object o);

  // Type Denoters
  public abstract Object visitAnyTypeDenoter(AnyTypeDenoter ast, Object o);
  public abstract Object visitArrayTypeDenoter(ArrayTypeDenoter ast, Object o);
  public abstract Object visitBoolTypeDenoter(BoolTypeDenoter ast, Object o);
  public abstract Object visitCharTypeDenoter(CharTypeDenoter ast, Object o);
  public abstract Object visitErrorTypeDenoter(ErrorTypeDenoter ast, Object o);
  public abstract Object visitSimpleTypeDenoter(SimpleTypeDenoter ast, Object o);
  public abstract Object visitIntTypeDenoter(IntTypeDenoter ast, Object o);
  public abstract Object visitRecordTypeDenoter(RecordTypeDenoter ast, Object o);

  public abstract Object visitMultipleFieldTypeDenoter(MultipleFieldTypeDenoter ast, Object o);
  public abstract Object visitSingleFieldTypeDenoter(SingleFieldTypeDenoter ast, Object o);

  // Literals, Identifiers and Operators
  public abstract Object visitCharacterLiteral(CharacterLiteral ast, Object o);
  public abstract Object visitLongIdentifier(LongIdentifier ast, Object o);
  public abstract Object visitIdentifier(Identifier ast, Object o);
  public abstract Object visitIntegerLiteral(IntegerLiteral ast, Object o);
  public abstract Object visitOperator(Operator ast, Object o);

  // Value-or-variable names
  public abstract Object visitVname(Vname ast, Object o);
  public abstract Object visitDotVarName(DotVarName ast, Object o);
  public abstract Object visitSimpleVarName(SimpleVarName ast, Object o);
  public abstract Object visitSubscriptVarName(SubscriptVarName ast, Object o);

  // Programs
  public abstract Object visitProgram(Program ast, Object o);

  // New
    public Object visitProcedureProcFuncDeclaration(ProcedureProcFuncDeclaration aThis, Object o);

    public Object visitFunctionProcFuncDeclaration(FunctionProcFuncDeclaration aThis, Object o);

    public Object visitPrivateCompoundDeclaration(PrivateCompoundDeclaration aThis, Object o);

    public Object visitRecursiveCompoundDeclaration(RecursiveCompoundDeclaration aThis, Object o);

    public Object visitProcFuncSDeclaration(ProcFuncSDeclaration aThis, Object o);

    public Object visitExpressionVarDeclaration(ExpressionVarDeclaration aThis, Object o);

    public Object visitCompoundDeclaration(CompoundDeclaration aThis, Object o);

    public Object visitProcFuncDeclaration(ProcFuncDeclaration aThis, Object o);

}
