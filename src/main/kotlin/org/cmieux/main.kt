package org.cmieux

import org.cmieux.parser.ast.impl.AntlrASTBuilder
import java.io.File
import java.io.IOException

fun main(vararg args: String) {
    if (args.size != 2) {
        println("Args <input file> and <output file> are required!")
    } else {
        val inputFile = args[0]
        val outputFile = args[1]

        println("HELLO WORLD! $inputFile $outputFile")

        try {
            val preprocessedSources = File(inputFile).readText()
            val ast = AntlrASTBuilder(preprocessedSources, inputFile).build()
        } catch (e: IOException) {
            println("Oh no! Cannot open $inputFile.")
        }
    }
}
