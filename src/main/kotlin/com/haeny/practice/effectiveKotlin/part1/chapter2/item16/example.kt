package com.haeny.practice.effectiveKotlin.part1.chapter2.item16

fun main() {

}

class Person {
    var name: String? = null
        get() = field?.uppercase()
        set(value) {
            if (!value.isNullOrBlank()) {
                field = value
            }
        }
}

open class Supercomputer {
    open val theAnswer: Long = 42
}

class AppleComputer : Supercomputer() {
    override val theAnswer: Long = 1_800_275_2273
}
