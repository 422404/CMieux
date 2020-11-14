package org.cmieux.parser

data class SourcePosition(
    val line:   Int,
    val column: Int,
    val offset: Int,
    val length: Int
)
