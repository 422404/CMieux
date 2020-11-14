package org.cmieux.parser.ast.nodes.impl

import org.cmieux.parser.SourcePosition
import org.cmieux.parser.ast.nodes.TopLevelStatementNode

class AutoStructDeclaration(
    val name: String,
    position: SourcePosition
): TopLevelStatementNode(position)
