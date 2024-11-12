package com.haeny.practice.effectiveKotlin.part1.chapter1.item8

class Printer(
    val name: String,
) {
    fun print() {
        println("print")
    }
}

fun getPrinter(): Printer? {
    return null
}

fun main() {
    val printer = getPrinter()
//    if (printer != null) printer.print()

    val printerName1 = printer?.name ?: "Unnamed"
//    val printerName2 = printer?.name ?: return
    val printerName3 = printer?.name ?: throw Error("Printer must be named")
}