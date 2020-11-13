package org.cmieux

fun main(vararg args: String) {
    if (args.size != 2) {
        println("Args <input file> and <output file> are required!")
    } else {
        val inputFile = args[0]
        val outputFile = args[1]

        print("HELLO WORLD! $inputFile $outputFile")
    }
}
