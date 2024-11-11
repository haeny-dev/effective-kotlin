package com.haeny.practice.effectiveKotlin.part1.chapter1.item1

/**
 * 읽기 전용 프로퍼티(val)
 */
//fun main() {
//    val a = 10
////    a = 20
//
//    val list = mutableListOf(1, 2, 3)
//    list.add(4)
//    print(list)
//}

//fun main() {
//    println(fullname)
//    name = "Maja"
//    println(fullname)
//}
//
//var name: String = "Marcin"
//var surname: String = "Moskala"
//val fullname
//    get() = "$name $surname"

//fun calculate(): Int {
//    print("Calculating...")
//    return 42
//}
//
//val fizz = calculate()
//val buzz
//    get() = calculate()
//
//fun main() {
//    println(fizz)
//    println(fizz)
//    println(buzz)
//    println(buzz)
//}

interface Element {
    val active: Boolean
}

class ActualElement : Element {
    override var active: Boolean = false
}

val name: String? = "Marton"
val surname: String? = "Braun"
val fullName: String?
    get() = name?.let { "$it $surname" }

val fullName2: String? = name?.let { "$it $surname" }

fun main() {
    if (fullName != null) {
//        println(fullName.length)
    }

    if (fullName2 != null) {
        println(fullName2.length)
    }
}





