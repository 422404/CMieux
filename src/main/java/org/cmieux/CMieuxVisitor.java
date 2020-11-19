// Generated from /home/elyan/Documents/CMieux/src/main/antlr/org/cmieux/CMieux.g4 by ANTLR 4.8
package org.cmieux;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMieuxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMieuxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#autoStructDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoStructDeclaration(CMieuxParser.AutoStructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#autoStructBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoStructBody(CMieuxParser.AutoStructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#autoStructAllocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoStructAllocation(CMieuxParser.AutoStructAllocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#deferStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferStatement(CMieuxParser.DeferStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#freeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeStatement(CMieuxParser.FreeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CMieuxParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(CMieuxParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#autoCastExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoCastExpression(CMieuxParser.AutoCastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#lineDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineDirective(CMieuxParser.LineDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CMieuxParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(CMieuxParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatingConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingConstant(CMieuxParser.FloatingConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharacterConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(CMieuxParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(CMieuxParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(CMieuxParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericSelectionExpression}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelectionExpression(CMieuxParser.GenericSelectionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CMieuxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinVaArg}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinVaArg(CMieuxParser.BuiltinVaArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinOffsetOf}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinOffsetOf(CMieuxParser.BuiltinOffsetOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(CMieuxParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericTypeAssoc}
	 * labeled alternative in {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeAssoc(CMieuxParser.GenericTypeAssocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericDefaultAssoc}
	 * labeled alternative in {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDefaultAssoc(CMieuxParser.GenericDefaultAssocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementAfter}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementAfter(CMieuxParser.IncrementAfterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(CMieuxParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementAfter}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementAfter(CMieuxParser.DecrementAfterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Postfix_PrimaryExpression}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_PrimaryExpression(CMieuxParser.Postfix_PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineStructInit}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineStructInit(CMieuxParser.InlineStructInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CMieuxParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(CMieuxParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineExtensionStructInit}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineExtensionStructInit(CMieuxParser.InlineExtensionStructInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAcessPtr}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAcessPtr(CMieuxParser.FieldAcessPtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(CMieuxParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary_PostfixExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_PostfixExpression(CMieuxParser.Unary_PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementBefore}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementBefore(CMieuxParser.IncrementBeforeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementBefore}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementBefore(CMieuxParser.DecrementBeforeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOpAndCast}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpAndCast(CMieuxParser.UnaryOpAndCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SizeofUnaryExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeofUnaryExpression(CMieuxParser.SizeofUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SizeofExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeofExpression(CMieuxParser.SizeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlignofExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignofExpression(CMieuxParser.AlignofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelAddress}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelAddress(CMieuxParser.LabelAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CMieuxParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cast}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(CMieuxParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExtensionCast}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionCast(CMieuxParser.ExtensionCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastUnaryExpression}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastUnaryExpression(CMieuxParser.CastUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastDigitSequence}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastDigitSequence(CMieuxParser.CastDigitSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul_CastExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_CastExpression(CMieuxParser.Mul_CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(CMieuxParser.ModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(CMieuxParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(CMieuxParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(CMieuxParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(CMieuxParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add_MulExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_MulExpression(CMieuxParser.Add_MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LShiftExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLShiftExpression(CMieuxParser.LShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RShiftExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRShiftExpression(CMieuxParser.RShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Shift_AddExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_AddExpression(CMieuxParser.Shift_AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GTEExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTEExpression(CMieuxParser.GTEExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LTEExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLTEExpression(CMieuxParser.LTEExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LTExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLTExpression(CMieuxParser.LTExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rel_ShiftExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_ShiftExpression(CMieuxParser.Rel_ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GTExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTExpression(CMieuxParser.GTExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeqExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqExpression(CMieuxParser.NeqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_RelExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_RelExpression(CMieuxParser.Eq_RelExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(CMieuxParser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryAndExpression}
	 * labeled alternative in {@link CMieuxParser#binAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAndExpression(CMieuxParser.BinaryAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryAnd_EqExpression}
	 * labeled alternative in {@link CMieuxParser#binAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAnd_EqExpression(CMieuxParser.BinaryAnd_EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XorExpression}
	 * labeled alternative in {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(CMieuxParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xor_AndExpression}
	 * labeled alternative in {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_AndExpression(CMieuxParser.Xor_AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOr_XorExpression}
	 * labeled alternative in {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOr_XorExpression(CMieuxParser.BinaryOr_XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOrExpression}
	 * labeled alternative in {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOrExpression(CMieuxParser.BinaryOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CMieuxParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And_BinaryOrExpression}
	 * labeled alternative in {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_BinaryOrExpression(CMieuxParser.And_BinaryOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or_AndExpression}
	 * labeled alternative in {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_AndExpression(CMieuxParser.Or_AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(CMieuxParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ternary_OrExpression}
	 * labeled alternative in {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_OrExpression(CMieuxParser.Ternary_OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(CMieuxParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CMieuxParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CMieuxParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CMieuxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CMieuxParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CMieuxParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(CMieuxParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(CMieuxParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(CMieuxParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(CMieuxParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(CMieuxParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(CMieuxParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(CMieuxParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSpecifier_Atomic}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier_Atomic(CMieuxParser.TypeSpecifier_AtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PointerTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerTypeSpecifier(CMieuxParser.PointerTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSpecifier_StructOrUnion}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier_StructOrUnion(CMieuxParser.TypeSpecifier_StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSpecifier_Enum}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier_Enum(CMieuxParser.TypeSpecifier_EnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeofTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofTypeSpecifier(CMieuxParser.TypeofTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeSpecifier_TypedefName}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier_TypedefName(CMieuxParser.TypeSpecifier_TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExtensionTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionTypeSpecifier(CMieuxParser.ExtensionTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructSpecifier}
	 * labeled alternative in {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructSpecifier(CMieuxParser.StructSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnionSpecifier}
	 * labeled alternative in {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSpecifier(CMieuxParser.UnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(CMieuxParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CMieuxParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(CMieuxParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(CMieuxParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(CMieuxParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Enum}
	 * labeled alternative in {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(CMieuxParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumType}
	 * labeled alternative in {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(CMieuxParser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(CMieuxParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(CMieuxParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(CMieuxParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(CMieuxParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(CMieuxParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAttribute(CMieuxParser.FunctionAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GCCFunctionAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGCCFunctionAttribute(CMieuxParser.GCCFunctionAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclSpecAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecAttribute(CMieuxParser.DeclSpecAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(CMieuxParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CMieuxParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaratorArgNamesOnly}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaratorArgNamesOnly(CMieuxParser.FunctionDeclaratorArgNamesOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitField}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitField(CMieuxParser.BitFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionPointer}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPointer(CMieuxParser.FunctionPointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarator1(CMieuxParser.ArrayDeclarator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableName}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(CMieuxParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarator2(CMieuxParser.ArrayDeclarator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclarator3}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarator3(CMieuxParser.ArrayDeclarator3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclarator4}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarator4(CMieuxParser.ArrayDeclarator4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenDeclarator}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenDeclarator(CMieuxParser.ParenDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarator}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarator(CMieuxParser.FunctionDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(CMieuxParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#gccAsmDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAsmDeclarator(CMieuxParser.GccAsmDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(CMieuxParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(CMieuxParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(CMieuxParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PointerComponent}
	 * labeled alternative in {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerComponent(CMieuxParser.PointerComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockPointerComponent}
	 * labeled alternative in {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockPointerComponent(CMieuxParser.BlockPointerComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(CMieuxParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleParameterList}
	 * labeled alternative in {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleParameterList(CMieuxParser.SimpleParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarArgParameterList}
	 * labeled alternative in {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArgParameterList(CMieuxParser.VarArgParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CMieuxParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleParameterDeclaration}
	 * labeled alternative in {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleParameterDeclaration(CMieuxParser.SimpleParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbstractParameterDeclaration}
	 * labeled alternative in {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractParameterDeclaration(CMieuxParser.AbstractParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(CMieuxParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(CMieuxParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(CMieuxParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAbstractDeclarator4}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAbstractDeclarator4(CMieuxParser.ArrayAbstractDeclarator4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAbstractDeclarator5}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAbstractDeclarator5(CMieuxParser.ArrayAbstractDeclarator5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAbstractDeclarator6}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAbstractDeclarator6(CMieuxParser.ArrayAbstractDeclarator6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionAbstractDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAbstractDeclarator2(CMieuxParser.FunctionAbstractDeclarator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionAbstractDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAbstractDeclarator1(CMieuxParser.FunctionAbstractDeclarator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAbstractDeclarator7}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAbstractDeclarator7(CMieuxParser.ArrayAbstractDeclarator7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAbstractDeclarator8}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAbstractDeclarator8(CMieuxParser.ArrayAbstractDeclarator8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenAbstractDeclarator}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenAbstractDeclarator(CMieuxParser.ParenAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAbstractDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAbstractDeclarator1(CMieuxParser.ArrayAbstractDeclarator1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAbstractDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAbstractDeclarator2(CMieuxParser.ArrayAbstractDeclarator2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAbstractDeclarator3}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAbstractDeclarator3(CMieuxParser.ArrayAbstractDeclarator3Context ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(CMieuxParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CMieuxParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#arrayOrStructInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOrStructInitializer(CMieuxParser.ArrayOrStructInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(CMieuxParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#initializerListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerListItem(CMieuxParser.InitializerListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#arrayElementInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementInit(CMieuxParser.ArrayElementInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#arrayIndexedInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexedInit(CMieuxParser.ArrayIndexedInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#structFieldInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldInit(CMieuxParser.StructFieldInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(CMieuxParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CMieuxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#asmStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmStatement(CMieuxParser.AsmStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Label}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(CMieuxParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseLabel}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseLabel(CMieuxParser.CaseLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseDefaultLabel}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseDefaultLabel(CMieuxParser.CaseDefaultLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CMieuxParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(CMieuxParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CMieuxParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CMieuxParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CMieuxParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(CMieuxParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(CMieuxParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(CMieuxParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(CMieuxParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(CMieuxParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(CMieuxParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CMieuxParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GCCDynamicGotoStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGCCDynamicGotoStatement(CMieuxParser.GCCDynamicGotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CMieuxParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#topLevelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelStatement(CMieuxParser.TopLevelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(CMieuxParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CMieuxParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(CMieuxParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#digitSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitSequence(CMieuxParser.DigitSequenceContext ctx);
}