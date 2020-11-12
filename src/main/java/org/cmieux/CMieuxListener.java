// Generated from /home/elyan/Documents/CMieux/src/main/antlr/org/cmieux/CMieux.g4 by ANTLR 4.8
package org.cmieux;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMieuxParser}.
 */
public interface CMieuxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CMieuxParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CMieuxParser.PrimaryExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(CMieuxParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(CMieuxParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(CMieuxParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(CMieuxParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CMieuxParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CMieuxParser.PostfixExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CMieuxParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CMieuxParser.UnaryExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CMieuxParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CMieuxParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CMieuxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CMieuxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CMieuxParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CMieuxParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CMieuxParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CMieuxParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CMieuxParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CMieuxParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CMieuxParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CMieuxParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CMieuxParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CMieuxParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CMieuxParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CMieuxParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CMieuxParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CMieuxParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CMieuxParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CMieuxParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CMieuxParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CMieuxParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CMieuxParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CMieuxParser.ConditionalExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CMieuxParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CMieuxParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(CMieuxParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(CMieuxParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(CMieuxParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(CMieuxParser.StructOrUnionContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(CMieuxParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(CMieuxParser.EnumSpecifierContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(CMieuxParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(CMieuxParser.FunctionSpecifierContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(CMieuxParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(CMieuxParser.DirectDeclaratorContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(CMieuxParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(CMieuxParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CMieuxParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CMieuxParser.PointerContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(CMieuxParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(CMieuxParser.ParameterTypeListContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CMieuxParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CMieuxParser.ParameterDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(CMieuxParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(CMieuxParser.DirectAbstractDeclaratorContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(CMieuxParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(CMieuxParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(CMieuxParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(CMieuxParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMieuxParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(CMieuxParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(CMieuxParser.DesignatorContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CMieuxParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CMieuxParser.LabeledStatementContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(CMieuxParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(CMieuxParser.BlockItemListContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CMieuxParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CMieuxParser.JumpStatementContext ctx);
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
	 * Enter a parse tree produced by {@link CMieuxParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(CMieuxParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMieuxParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(CMieuxParser.TranslationUnitContext ctx);
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
}