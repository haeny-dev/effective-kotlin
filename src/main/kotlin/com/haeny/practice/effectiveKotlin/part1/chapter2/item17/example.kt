package com.haeny.practice.effectiveKotlin.part1.chapter2.item17

fun main() {
//    val text = (1..10).joinToString("|")

//    val separator = "|"
//    val text = (1..10).joinToString(separator)

    val text = (1..10).joinToString(separator = "|")

    call(before = { print("CALL") })
    call(after = { print("CALL") })
}

fun call(before: () -> Unit = {}, after: () -> Unit = {}) {
    before()
    print("Middle")
    after()
}