package com.haeny.practice.effectiveKotlin.part1.chapter1.item2

import com.haeny.practice.effectiveKotlin.part1.chapter1.item1.name
import java.awt.Color

val a = 1
fun fizz() {
    val b = 2
    print(a + b)
}

fun buzz() {
    val c = 3
    print(a + c)
}

fun main() {
    val names = listOf("a", "b", "c")
//    var name = ""
//    for (i in names.indices) {
//        name = names[i]
//        println("Name at $i is $name")
//    }

//    for (i in names.indices) {
//        val name = names[i]
//        println("Name at $i is $name")
//    }

    for ((i, name) in names.withIndex()) {
        println("Name at $i is $name")
    }

//    val username: String
//    if (hasValue) {
//        username = getValue()
//    } else {
//        username = "aaa"
//    }

    val username = if (hasValue) {
        getValue()
    } else {
        "aaa"
    }
}

val hasValue = true
fun getValue() = "abc"

fun updateWeather(degrees: Int) {
    val description: String
    val color: Color
    if (degrees < 5) {
        description = "cold"
        color = Color.BLUE
    } else if (degrees < 23) {
        description = "mild"
        color = Color.YELLOW
    } else {
        description = "hot"
        color = Color.RED
    }
}

fun updateWeather2(degrees: Int) {
    val (description, color) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.YELLOW
        else -> "hot" to Color.RED
    }
}