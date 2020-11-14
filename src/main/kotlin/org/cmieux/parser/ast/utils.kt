package org.cmieux.parser.ast

import org.cmieux.parser.ast.nodes.ASTNode

inline fun <reified T: ASTNode> castASTNode(astNode: ASTNode): T {
    if (astNode is T) {
        return astNode
    } else {
        throw TypeCastException("Error while trying to cast object of class "
                + "${astNode::class.qualifiedName} to ${T::class.qualifiedName}")
    }
}
