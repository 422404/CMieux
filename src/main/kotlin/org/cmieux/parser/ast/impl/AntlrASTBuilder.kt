package org.cmieux.parser.ast.impl

import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.ParserRuleContext
import org.cmieux.CMieuxBaseVisitor
import org.cmieux.CMieuxLexer
import org.cmieux.CMieuxParser
import org.cmieux.parser.SourcePosition
import org.cmieux.parser.ast.ASTBuilder
import org.cmieux.parser.ast.castASTNode
import org.cmieux.parser.ast.nodes.ASTNode
import org.cmieux.parser.ast.nodes.TopLevelStatementNode
import org.cmieux.parser.ast.nodes.impl.AutoStructDeclaration
import org.cmieux.parser.ast.nodes.impl.CompilationUnitNode

class AntlrASTBuilder(
    private val input: String,
    private val inputSource: String
): CMieuxBaseVisitor<ASTNode>(), ASTBuilder<CompilationUnitNode> {
    override fun build(): CompilationUnitNode {
        val lexer = CMieuxLexer(CharStreams.fromString(input, inputSource))
        val parser = CMieuxParser(CommonTokenStream(lexer))
        return castASTNode(visit(parser.compilationUnit()))
    }

    private fun getPos(ctx: ParserRuleContext) =
        SourcePosition(
            line   = ctx.start.line,
            column = ctx.start.charPositionInLine,
            offset = ctx.start.startIndex,
            length = ctx.stop.stopIndex - ctx.start.startIndex
        )

    private fun collectTranslationUnits(ctx: CMieuxParser.TranslationUnitContext?): MutableList<TopLevelStatementNode> =
        when (ctx) {
            null -> mutableListOf()
            else -> collectTranslationUnits(ctx.translationUnit()).let {
                it.add(castASTNode(visit(ctx.externalDeclaration())))
                it
            }
        }

    override fun visitCompilationUnit(ctx: CMieuxParser.CompilationUnitContext): ASTNode =
        castASTNode(CompilationUnitNode(
            topLevelStatements = collectTranslationUnits(ctx.translationUnit()),
            position           = getPos(ctx)
        ))

    override fun visitAutoStructDeclaration(ctx: CMieuxParser.AutoStructDeclarationContext): ASTNode =
        castASTNode(AutoStructDeclaration(
            name     = ctx.Identifier().text,
            position = getPos(ctx)
        ))
}
