package com.haeny.practice.effectiveKotlin.part2.chapter3.item24

/**
 * out
 */
fun main2() {
//    val anys: Cup<Any> = Cup<Int>() // Error
//    val nothings: Cup<Nothing> = Cup<Int>   // 오류

//    val b: Cup<Dog> = Cup<Puppy>()
//    val a: Cup<Puppy> = Cup<Dog>()  // 오류

//    val anys: Cup<Any> = Cup<Int>()
//    val nothings: Cup<Nothing> = Cup<Int>() // 오류
}

//class Cup<T>

//class Cup<out T>
//open class Dog
//class Puppy: Dog()

/**
 * in
 */
//class Cup<in T>
//open class Dog
//class Puppy: Dog()
//
//fun main() {
////    val b: Cup<Dog> = Cup<Puppy>()  // 에러
//    val a: Cup<Puppy> = Cup<Dog>()
//
////    val anys: Cup<Any> = Cup<Int>() // 에러
//    val nothings: Cup<Nothing> = Cup<Int>()
//}

fun printProcessedNumber(transition: (Int) -> Any) {
    println(transition(42))
}

//fun main() {
//    val intToDouble: (Int) -> Number = { it.toDouble() }
//    val numberAsText: (Number) -> Any = { it.toShort() }
//    val identity: (Number) -> Number = { it }
//    val numberToInt: (Number) -> Int = { it.toInt() }
//    val numberHash: (Any) -> Number = { it.hashCode() }
//    printProcessedNumber(intToDouble)
//    printProcessedNumber(numberAsText)
//    printProcessedNumber(identity)
//    printProcessedNumber(numberToInt)
//    printProcessedNumber(numberHash)
//}

//class Box<out T> {
//    private var value: T? = null
//
//    private set(value: T) {
//        this.value = value
//    }
//
//    fun get(): T = value ?: error("Value not set")
//}

//class Box<in T> {
//    private var value: T? = null
//
//    fun set(value: T) {
//        this.value = value
//    }
//
//    private fun get(): T = value
//        ?: error("Value not set")
//}

//class Box<out T>(val value: T)
//val boxStr: Box<String> = Box("Str")
//val boxAny: Box<Any> = boxStr

class Box<T>(val value: T)
val boxStr: Box<String> = Box("Str")
val boxAny: Box<out Any> = boxStr

interface Dog
interface Cutie
data class Puppy(val name: String): Dog, Cutie
data class Hound(val name: String): Dog
data class Cat(val name: String): Cutie

fun fillWithPuppies(list: MutableList<in Puppy>) {
    list.add(Puppy("Jim"))
    list.add(Puppy("Beam"))
}

fun main() {
    val dogs = mutableListOf<Dog>(Hound("Pluto"))
    fillWithPuppies(dogs)
    println(dogs)

    val animals = mutableListOf<Cutie>(Cat("Felix"))
    fillWithPuppies(animals)
    println(animals)
}


