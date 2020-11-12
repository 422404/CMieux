package org.cmieux.parser.ast

import org.cmieux.parser.ast.nodes.ASTNode

interface ASTBuilder {
    fun build(): ASTNode
}
