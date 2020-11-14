package org.cmieux.parser.ast

import org.cmieux.parser.ast.nodes.ASTNode

interface ASTBuilder<T: ASTNode> {
    fun build(): T
}
