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
	 * Visit a parse tree produced by {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CMieuxParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(CMieuxParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(CMieuxParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(CMieuxParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CMieuxParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(CMieuxParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CMieuxParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CMieuxParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(CMieuxParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(CMieuxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(CMieuxParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CMieuxParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CMieuxParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(CMieuxParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CMieuxParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(CMieuxParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(CMieuxParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(CMieuxParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(CMieuxParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CMieuxParser.ConditionalExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CMieuxParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(CMieuxParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(CMieuxParser.StructOrUnionContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(CMieuxParser.EnumSpecifierContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(CMieuxParser.FunctionSpecifierContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(CMieuxParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(CMieuxParser.GccDeclaratorExtensionContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(CMieuxParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(CMieuxParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(CMieuxParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(CMieuxParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CMieuxParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CMieuxParser.ParameterDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(CMieuxParser.DirectAbstractDeclaratorContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(CMieuxParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(CMieuxParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(CMieuxParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(CMieuxParser.DesignatorContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CMieuxParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CMieuxParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(CMieuxParser.BlockItemListContext ctx);
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
	 * Visit a parse tree produced by {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CMieuxParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CMieuxParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMieuxParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(CMieuxParser.TranslationUnitContext ctx);
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
}