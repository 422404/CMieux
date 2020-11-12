package org.cmieux.parser.ast.impl

import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.CharStreams
import org.cmieux.CMieuxBaseVisitor
import org.cmieux.CMieuxLexer
import org.cmieux.CMieuxParser
import org.cmieux.parser.ast.ASTBuilder
import org.cmieux.parser.ast.nodes.ASTNode

class AntlrASTBuilder(
    private val input: String,
    private val inputSource: String
): CMieuxBaseVisitor<ASTNode>(), ASTBuilder {
    override fun build(): ASTNode {
        val lexer = CMieuxLexer(CharStreams.fromString(input, inputSource))
        val parser = CMieuxParser(CommonTokenStream(lexer))

        TODO("Not yet implemented")
    }
}
