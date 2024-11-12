package com.haeny.practice.effectiveKotlin.part1.chapter1.item4

fun main() {
//    var animal = Zebra()
//    animal = Animal()   // 오류

    var animal: Animal = Zebra()
    animal = Animal()
}

open class Animal
class Zebra : Animal()