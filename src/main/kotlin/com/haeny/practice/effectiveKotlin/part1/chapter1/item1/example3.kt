package com.haeny.practice.effectiveKotlin.part1.chapter1.item1

import kotlin.properties.Delegates

fun main() {
    val list1: MutableList<Int> = mutableListOf()
    var list2: List<Int> = listOf()

//    list1.add(1)
//    list2 = list2 + 1

    list1 += 1  // list1.plusAssign(1)
    list2 += 1  // list2 = list2.plus(1)

    names += "Fabio"
    names += "Bill"
}

var names by Delegates.observable(listOf<String>()) { _, old, new ->
    println("Names changed from $old to $new")
}