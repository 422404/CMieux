// Generated from /home/elyan/Documents/CMieux/src/main/antlr/org/cmieux/CMieux.g4 by ANTLR 4.8
package org.cmieux;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMieuxParser}.
 */
public interface CMieuxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#autoStructDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAutoStructDeclaration(CMieuxParser.AutoStructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#autoStructDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAutoStructDeclaration(CMieuxParser.AutoStructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#autoStructBody}.
	 * @param ctx the parse tree
	 */
	void enterAutoStructBody(CMieuxParser.AutoStructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#autoStructBody}.
	 * @param ctx the parse tree
	 */
	void exitAutoStructBody(CMieuxParser.AutoStructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#autoStructAllocation}.
	 * @param ctx the parse tree
	 */
	void enterAutoStructAllocation(CMieuxParser.AutoStructAllocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#autoStructAllocation}.
	 * @param ctx the parse tree
	 */
	void exitAutoStructAllocation(CMieuxParser.AutoStructAllocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeferStatement(CMieuxParser.DeferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeferStatement(CMieuxParser.DeferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#freeStatement}.
	 * @param ctx the parse tree
	 */
	void enterFreeStatement(CMieuxParser.FreeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#freeStatement}.
	 * @param ctx the parse tree
	 */
	void exitFreeStatement(CMieuxParser.FreeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CMieuxParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CMieuxParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(CMieuxParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(CMieuxParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#autoCastExpression}.
	 * @param ctx the parse tree
	 */
	void enterAutoCastExpression(CMieuxParser.AutoCastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#autoCastExpression}.
	 * @param ctx the parse tree
	 */
	void exitAutoCastExpression(CMieuxParser.AutoCastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#lineDirective}.
	 * @param ctx the parse tree
	 */
	void enterLineDirective(CMieuxParser.LineDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#lineDirective}.
	 * @param ctx the parse tree
	 */
	void exitLineDirective(CMieuxParser.LineDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CMieuxParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CMieuxParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(CMieuxParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(CMieuxParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatingConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFloatingConstant(CMieuxParser.FloatingConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatingConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFloatingConstant(CMieuxParser.FloatingConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(CMieuxParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterConstant}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(CMieuxParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(CMieuxParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(CMieuxParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(CMieuxParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(CMieuxParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericSelectionExpression}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelectionExpression(CMieuxParser.GenericSelectionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericSelectionExpression}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelectionExpression(CMieuxParser.GenericSelectionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CMieuxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CMieuxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinVaArg}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinVaArg(CMieuxParser.BuiltinVaArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinVaArg}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinVaArg(CMieuxParser.BuiltinVaArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltinOffsetOf}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinOffsetOf(CMieuxParser.BuiltinOffsetOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltinOffsetOf}
	 * labeled alternative in {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinOffsetOf(CMieuxParser.BuiltinOffsetOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(CMieuxParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(CMieuxParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericTypeAssoc}
	 * labeled alternative in {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeAssoc(CMieuxParser.GenericTypeAssocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericTypeAssoc}
	 * labeled alternative in {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeAssoc(CMieuxParser.GenericTypeAssocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericDefaultAssoc}
	 * labeled alternative in {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericDefaultAssoc(CMieuxParser.GenericDefaultAssocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericDefaultAssoc}
	 * labeled alternative in {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericDefaultAssoc(CMieuxParser.GenericDefaultAssocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementAfter}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementAfter(CMieuxParser.IncrementAfterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementAfter}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementAfter(CMieuxParser.IncrementAfterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(CMieuxParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(CMieuxParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementAfter}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecrementAfter(CMieuxParser.DecrementAfterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementAfter}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecrementAfter(CMieuxParser.DecrementAfterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Postfix_PrimaryExpression}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_PrimaryExpression(CMieuxParser.Postfix_PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Postfix_PrimaryExpression}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_PrimaryExpression(CMieuxParser.Postfix_PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineStructInit}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInlineStructInit(CMieuxParser.InlineStructInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineStructInit}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInlineStructInit(CMieuxParser.InlineStructInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CMieuxParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CMieuxParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(CMieuxParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(CMieuxParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineExtensionStructInit}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInlineExtensionStructInit(CMieuxParser.InlineExtensionStructInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineExtensionStructInit}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInlineExtensionStructInit(CMieuxParser.InlineExtensionStructInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAcessPtr}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFieldAcessPtr(CMieuxParser.FieldAcessPtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAcessPtr}
	 * labeled alternative in {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFieldAcessPtr(CMieuxParser.FieldAcessPtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(CMieuxParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(CMieuxParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary_PostfixExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_PostfixExpression(CMieuxParser.Unary_PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary_PostfixExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_PostfixExpression(CMieuxParser.Unary_PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementBefore}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementBefore(CMieuxParser.IncrementBeforeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementBefore}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementBefore(CMieuxParser.IncrementBeforeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementBefore}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecrementBefore(CMieuxParser.DecrementBeforeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementBefore}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecrementBefore(CMieuxParser.DecrementBeforeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryOpAndCast}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOpAndCast(CMieuxParser.UnaryOpAndCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOpAndCast}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOpAndCast(CMieuxParser.UnaryOpAndCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SizeofUnaryExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeofUnaryExpression(CMieuxParser.SizeofUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SizeofUnaryExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeofUnaryExpression(CMieuxParser.SizeofUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SizeofExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeofExpression(CMieuxParser.SizeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SizeofExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeofExpression(CMieuxParser.SizeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlignofExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterAlignofExpression(CMieuxParser.AlignofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlignofExpression}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitAlignofExpression(CMieuxParser.AlignofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LabelAddress}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLabelAddress(CMieuxParser.LabelAddressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LabelAddress}
	 * labeled alternative in {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLabelAddress(CMieuxParser.LabelAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CMieuxParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CMieuxParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cast}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(CMieuxParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cast}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(CMieuxParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExtensionCast}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtensionCast(CMieuxParser.ExtensionCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExtensionCast}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtensionCast(CMieuxParser.ExtensionCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastUnaryExpression}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastUnaryExpression(CMieuxParser.CastUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastUnaryExpression}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastUnaryExpression(CMieuxParser.CastUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastDigitSequence}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastDigitSequence(CMieuxParser.CastDigitSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastDigitSequence}
	 * labeled alternative in {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastDigitSequence(CMieuxParser.CastDigitSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul_CastExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMul_CastExpression(CMieuxParser.Mul_CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul_CastExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMul_CastExpression(CMieuxParser.Mul_CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(CMieuxParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(CMieuxParser.ModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(CMieuxParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(CMieuxParser.DivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(CMieuxParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpression}
	 * labeled alternative in {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(CMieuxParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(CMieuxParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(CMieuxParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(CMieuxParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(CMieuxParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add_MulExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_MulExpression(CMieuxParser.Add_MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add_MulExpression}
	 * labeled alternative in {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_MulExpression(CMieuxParser.Add_MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LShiftExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterLShiftExpression(CMieuxParser.LShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LShiftExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitLShiftExpression(CMieuxParser.LShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RShiftExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterRShiftExpression(CMieuxParser.RShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RShiftExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitRShiftExpression(CMieuxParser.RShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Shift_AddExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShift_AddExpression(CMieuxParser.Shift_AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Shift_AddExpression}
	 * labeled alternative in {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShift_AddExpression(CMieuxParser.Shift_AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GTEExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterGTEExpression(CMieuxParser.GTEExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GTEExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitGTEExpression(CMieuxParser.GTEExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LTEExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLTEExpression(CMieuxParser.LTEExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LTEExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLTEExpression(CMieuxParser.LTEExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LTExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLTExpression(CMieuxParser.LTExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LTExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLTExpression(CMieuxParser.LTExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rel_ShiftExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRel_ShiftExpression(CMieuxParser.Rel_ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rel_ShiftExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRel_ShiftExpression(CMieuxParser.Rel_ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GTExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterGTExpression(CMieuxParser.GTExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GTExpression}
	 * labeled alternative in {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitGTExpression(CMieuxParser.GTExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeqExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterNeqExpression(CMieuxParser.NeqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeqExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitNeqExpression(CMieuxParser.NeqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_RelExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEq_RelExpression(CMieuxParser.Eq_RelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_RelExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEq_RelExpression(CMieuxParser.Eq_RelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(CMieuxParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExpression}
	 * labeled alternative in {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(CMieuxParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryAndExpression}
	 * labeled alternative in {@link CMieuxParser#binAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAndExpression(CMieuxParser.BinaryAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAndExpression}
	 * labeled alternative in {@link CMieuxParser#binAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAndExpression(CMieuxParser.BinaryAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryAnd_EqExpression}
	 * labeled alternative in {@link CMieuxParser#binAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAnd_EqExpression(CMieuxParser.BinaryAnd_EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAnd_EqExpression}
	 * labeled alternative in {@link CMieuxParser#binAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAnd_EqExpression(CMieuxParser.BinaryAnd_EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XorExpression}
	 * labeled alternative in {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(CMieuxParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XorExpression}
	 * labeled alternative in {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(CMieuxParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xor_AndExpression}
	 * labeled alternative in {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterXor_AndExpression(CMieuxParser.Xor_AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xor_AndExpression}
	 * labeled alternative in {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitXor_AndExpression(CMieuxParser.Xor_AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOr_XorExpression}
	 * labeled alternative in {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOr_XorExpression(CMieuxParser.BinaryOr_XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOr_XorExpression}
	 * labeled alternative in {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOr_XorExpression(CMieuxParser.BinaryOr_XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOrExpression}
	 * labeled alternative in {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOrExpression(CMieuxParser.BinaryOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOrExpression}
	 * labeled alternative in {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOrExpression(CMieuxParser.BinaryOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CMieuxParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CMieuxParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And_BinaryOrExpression}
	 * labeled alternative in {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_BinaryOrExpression(CMieuxParser.And_BinaryOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And_BinaryOrExpression}
	 * labeled alternative in {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_BinaryOrExpression(CMieuxParser.And_BinaryOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or_AndExpression}
	 * labeled alternative in {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterOr_AndExpression(CMieuxParser.Or_AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or_AndExpression}
	 * labeled alternative in {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitOr_AndExpression(CMieuxParser.Or_AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(CMieuxParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(CMieuxParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ternary_OrExpression}
	 * labeled alternative in {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernary_OrExpression(CMieuxParser.Ternary_OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ternary_OrExpression}
	 * labeled alternative in {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernary_OrExpression(CMieuxParser.Ternary_OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(CMieuxParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(CMieuxParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CMieuxParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CMieuxParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CMieuxParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CMieuxParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CMieuxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CMieuxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CMieuxParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CMieuxParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CMieuxParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CMieuxParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(CMieuxParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(CMieuxParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(CMieuxParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(CMieuxParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(CMieuxParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(CMieuxParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CMieuxParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CMieuxParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CMieuxParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CMieuxParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(CMieuxParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(CMieuxParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSpecifier(CMieuxParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSpecifier(CMieuxParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeSpecifier_Atomic}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier_Atomic(CMieuxParser.TypeSpecifier_AtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeSpecifier_Atomic}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier_Atomic(CMieuxParser.TypeSpecifier_AtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PointerTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterPointerTypeSpecifier(CMieuxParser.PointerTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PointerTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitPointerTypeSpecifier(CMieuxParser.PointerTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeSpecifier_StructOrUnion}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier_StructOrUnion(CMieuxParser.TypeSpecifier_StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeSpecifier_StructOrUnion}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier_StructOrUnion(CMieuxParser.TypeSpecifier_StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeSpecifier_Enum}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier_Enum(CMieuxParser.TypeSpecifier_EnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeSpecifier_Enum}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier_Enum(CMieuxParser.TypeSpecifier_EnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeofTypeSpecifier(CMieuxParser.TypeofTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeofTypeSpecifier(CMieuxParser.TypeofTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeSpecifier_TypedefName}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier_TypedefName(CMieuxParser.TypeSpecifier_TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeSpecifier_TypedefName}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier_TypedefName(CMieuxParser.TypeSpecifier_TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExtensionTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterExtensionTypeSpecifier(CMieuxParser.ExtensionTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExtensionTypeSpecifier}
	 * labeled alternative in {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitExtensionTypeSpecifier(CMieuxParser.ExtensionTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructSpecifier}
	 * labeled alternative in {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructSpecifier(CMieuxParser.StructSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructSpecifier}
	 * labeled alternative in {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructSpecifier(CMieuxParser.StructSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnionSpecifier}
	 * labeled alternative in {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterUnionSpecifier(CMieuxParser.UnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnionSpecifier}
	 * labeled alternative in {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitUnionSpecifier(CMieuxParser.UnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(CMieuxParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(CMieuxParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CMieuxParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CMieuxParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(CMieuxParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(CMieuxParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(CMieuxParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(CMieuxParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(CMieuxParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(CMieuxParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Enum}
	 * labeled alternative in {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum(CMieuxParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Enum}
	 * labeled alternative in {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum(CMieuxParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumType}
	 * labeled alternative in {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(CMieuxParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumType}
	 * labeled alternative in {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(CMieuxParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(CMieuxParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(CMieuxParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(CMieuxParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(CMieuxParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(CMieuxParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(CMieuxParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(CMieuxParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(CMieuxParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(CMieuxParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(CMieuxParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAttribute(CMieuxParser.FunctionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAttribute(CMieuxParser.FunctionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GCCFunctionAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGCCFunctionAttribute(CMieuxParser.GCCFunctionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GCCFunctionAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGCCFunctionAttribute(CMieuxParser.GCCFunctionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclSpecAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecAttribute(CMieuxParser.DeclSpecAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclSpecAttribute}
	 * labeled alternative in {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecAttribute(CMieuxParser.DeclSpecAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(CMieuxParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(CMieuxParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CMieuxParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CMieuxParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaratorArgNamesOnly}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaratorArgNamesOnly(CMieuxParser.FunctionDeclaratorArgNamesOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaratorArgNamesOnly}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaratorArgNamesOnly(CMieuxParser.FunctionDeclaratorArgNamesOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitField}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterBitField(CMieuxParser.BitFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitField}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitBitField(CMieuxParser.BitFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionPointer}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPointer(CMieuxParser.FunctionPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionPointer}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPointer(CMieuxParser.FunctionPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarator1(CMieuxParser.ArrayDeclarator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarator1(CMieuxParser.ArrayDeclarator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableName}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(CMieuxParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableName}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(CMieuxParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarator2(CMieuxParser.ArrayDeclarator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarator2(CMieuxParser.ArrayDeclarator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclarator3}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarator3(CMieuxParser.ArrayDeclarator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclarator3}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarator3(CMieuxParser.ArrayDeclarator3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclarator4}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarator4(CMieuxParser.ArrayDeclarator4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclarator4}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarator4(CMieuxParser.ArrayDeclarator4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenDeclarator}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterParenDeclarator(CMieuxParser.ParenDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenDeclarator}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitParenDeclarator(CMieuxParser.ParenDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarator}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarator(CMieuxParser.FunctionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarator}
	 * labeled alternative in {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarator(CMieuxParser.FunctionDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(CMieuxParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(CMieuxParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#gccAsmDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterGccAsmDeclarator(CMieuxParser.GccAsmDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#gccAsmDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitGccAsmDeclarator(CMieuxParser.GccAsmDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(CMieuxParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(CMieuxParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(CMieuxParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(CMieuxParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(CMieuxParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(CMieuxParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PointerComponent}
	 * labeled alternative in {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointerComponent(CMieuxParser.PointerComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PointerComponent}
	 * labeled alternative in {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointerComponent(CMieuxParser.PointerComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockPointerComponent}
	 * labeled alternative in {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterBlockPointerComponent(CMieuxParser.BlockPointerComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockPointerComponent}
	 * labeled alternative in {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitBlockPointerComponent(CMieuxParser.BlockPointerComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(CMieuxParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(CMieuxParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleParameterList}
	 * labeled alternative in {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterSimpleParameterList(CMieuxParser.SimpleParameterListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleParameterList}
	 * labeled alternative in {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitSimpleParameterList(CMieuxParser.SimpleParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarArgParameterList}
	 * labeled alternative in {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterVarArgParameterList(CMieuxParser.VarArgParameterListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarArgParameterList}
	 * labeled alternative in {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitVarArgParameterList(CMieuxParser.VarArgParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CMieuxParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CMieuxParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleParameterDeclaration}
	 * labeled alternative in {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleParameterDeclaration(CMieuxParser.SimpleParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleParameterDeclaration}
	 * labeled alternative in {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleParameterDeclaration(CMieuxParser.SimpleParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractParameterDeclaration}
	 * labeled alternative in {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractParameterDeclaration(CMieuxParser.AbstractParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractParameterDeclaration}
	 * labeled alternative in {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractParameterDeclaration(CMieuxParser.AbstractParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CMieuxParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CMieuxParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CMieuxParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CMieuxParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(CMieuxParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(CMieuxParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAbstractDeclarator4}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAbstractDeclarator4(CMieuxParser.ArrayAbstractDeclarator4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAbstractDeclarator4}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAbstractDeclarator4(CMieuxParser.ArrayAbstractDeclarator4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAbstractDeclarator5}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAbstractDeclarator5(CMieuxParser.ArrayAbstractDeclarator5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAbstractDeclarator5}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAbstractDeclarator5(CMieuxParser.ArrayAbstractDeclarator5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAbstractDeclarator6}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAbstractDeclarator6(CMieuxParser.ArrayAbstractDeclarator6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAbstractDeclarator6}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAbstractDeclarator6(CMieuxParser.ArrayAbstractDeclarator6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionAbstractDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAbstractDeclarator2(CMieuxParser.FunctionAbstractDeclarator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionAbstractDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAbstractDeclarator2(CMieuxParser.FunctionAbstractDeclarator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionAbstractDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAbstractDeclarator1(CMieuxParser.FunctionAbstractDeclarator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionAbstractDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAbstractDeclarator1(CMieuxParser.FunctionAbstractDeclarator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAbstractDeclarator7}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAbstractDeclarator7(CMieuxParser.ArrayAbstractDeclarator7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAbstractDeclarator7}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAbstractDeclarator7(CMieuxParser.ArrayAbstractDeclarator7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAbstractDeclarator8}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAbstractDeclarator8(CMieuxParser.ArrayAbstractDeclarator8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAbstractDeclarator8}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAbstractDeclarator8(CMieuxParser.ArrayAbstractDeclarator8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenAbstractDeclarator}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterParenAbstractDeclarator(CMieuxParser.ParenAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenAbstractDeclarator}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitParenAbstractDeclarator(CMieuxParser.ParenAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAbstractDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAbstractDeclarator1(CMieuxParser.ArrayAbstractDeclarator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAbstractDeclarator1}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAbstractDeclarator1(CMieuxParser.ArrayAbstractDeclarator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAbstractDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAbstractDeclarator2(CMieuxParser.ArrayAbstractDeclarator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAbstractDeclarator2}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAbstractDeclarator2(CMieuxParser.ArrayAbstractDeclarator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAbstractDeclarator3}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAbstractDeclarator3(CMieuxParser.ArrayAbstractDeclarator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAbstractDeclarator3}
	 * labeled alternative in {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAbstractDeclarator3(CMieuxParser.ArrayAbstractDeclarator3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(CMieuxParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(CMieuxParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CMieuxParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CMieuxParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#arrayOrStructInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayOrStructInitializer(CMieuxParser.ArrayOrStructInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#arrayOrStructInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayOrStructInitializer(CMieuxParser.ArrayOrStructInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CMieuxParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CMieuxParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#initializerListItem}.
	 * @param ctx the parse tree
	 */
	void enterInitializerListItem(CMieuxParser.InitializerListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#initializerListItem}.
	 * @param ctx the parse tree
	 */
	void exitInitializerListItem(CMieuxParser.InitializerListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#arrayElementInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementInit(CMieuxParser.ArrayElementInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#arrayElementInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementInit(CMieuxParser.ArrayElementInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#arrayIndexedInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexedInit(CMieuxParser.ArrayIndexedInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#arrayIndexedInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexedInit(CMieuxParser.ArrayIndexedInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#structFieldInit}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldInit(CMieuxParser.StructFieldInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#structFieldInit}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldInit(CMieuxParser.StructFieldInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(CMieuxParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(CMieuxParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CMieuxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CMieuxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#asmStatement}.
	 * @param ctx the parse tree
	 */
	void enterAsmStatement(CMieuxParser.AsmStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#asmStatement}.
	 * @param ctx the parse tree
	 */
	void exitAsmStatement(CMieuxParser.AsmStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Label}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabel(CMieuxParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Label}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabel(CMieuxParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseLabel}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabel(CMieuxParser.CaseLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseLabel}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabel(CMieuxParser.CaseLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseDefaultLabel}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseDefaultLabel(CMieuxParser.CaseDefaultLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseDefaultLabel}
	 * labeled alternative in {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseDefaultLabel(CMieuxParser.CaseDefaultLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CMieuxParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CMieuxParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(CMieuxParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(CMieuxParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CMieuxParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CMieuxParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CMieuxParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CMieuxParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CMieuxParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CMieuxParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(CMieuxParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(CMieuxParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(CMieuxParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(CMieuxParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(CMieuxParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(CMieuxParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(CMieuxParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(CMieuxParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(CMieuxParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(CMieuxParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(CMieuxParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(CMieuxParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CMieuxParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CMieuxParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GCCDynamicGotoStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterGCCDynamicGotoStatement(CMieuxParser.GCCDynamicGotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GCCDynamicGotoStatement}
	 * labeled alternative in {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitGCCDynamicGotoStatement(CMieuxParser.GCCDynamicGotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CMieuxParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CMieuxParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#topLevelStatement}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelStatement(CMieuxParser.TopLevelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#topLevelStatement}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelStatement(CMieuxParser.TopLevelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(CMieuxParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(CMieuxParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CMieuxParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CMieuxParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(CMieuxParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(CMieuxParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#digitSequence}.
	 * @param ctx the parse tree
	 */
	void enterDigitSequence(CMieuxParser.DigitSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#digitSequence}.
	 * @param ctx the parse tree
	 */
	void exitDigitSequence(CMieuxParser.DigitSequenceContext ctx);
}