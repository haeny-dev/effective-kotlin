package com.haeny.practice.effectiveKotlin.part1.chapter2.item12

fun main() {
    val tripledHello = 3 timesRepeated { println("Hello") }
    tripledHello()
}

infix fun Int.timesRepeated(operation: () -> Unit) = {
    repeat(this) { operation() }
}