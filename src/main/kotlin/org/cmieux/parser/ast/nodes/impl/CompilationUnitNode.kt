package org.cmieux.parser.ast.nodes.impl

import org.cmieux.parser.SourcePosition
import org.cmieux.parser.ast.nodes.ASTNode
import org.cmieux.parser.ast.nodes.TopLevelStatementNode

class CompilationUnitNode(
    val topLevelStatements: MutableList<TopLevelStatementNode>,
    position: SourcePosition
): ASTNode(position)
