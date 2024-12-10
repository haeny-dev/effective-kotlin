package com.haeny.practice.effectiveKotlin.part2.chapter5.item33

interface MyList<T> {
    // ...

    companion object {
        fun <T> of(vararg elements: T): MyList<T>? {
            // ...
            return null
        }
    }
}

open class MyLinkedList<T>(
    val head: T,
    val tail: MyLinkedList<T>?
) : MyList<T> {
    companion object {
        fun <T> of(vararg elements: T): MyLinkedList<T>? {
            if (elements.isEmpty()) return null
            val head = elements.first()
            val elementsTail = elements
                .copyOfRange(1, elements.size)
            val tail = myLinkedListOf(*elementsTail)
            return MyLinkedList(head, tail)
        }
    }
}

// Top level function
fun <T> myLinkedListOf(
    vararg elements: T
): MyLinkedList<T>? {
    if (elements.isEmpty()) return null
    val head = elements.first()
    val elementsTail = elements
        .copyOfRange(1, elements.size)
    val tail = myLinkedListOf(*elementsTail)
    return MyLinkedList(head, tail)
}

class MyLinkedIntList(
    head: Int,
    tail: MyLinkedIntList?
) : MyLinkedList<Int>(head, tail)

fun myLinkedIntListOf(vararg elements: Int): MyLinkedIntList? {
    if (elements.isEmpty()) return null
    val head = elements.first()
    val elementsTail = elements
        .copyOfRange(1, elements.size)
    val tail = myLinkedIntListOf(*elementsTail)
    return MyLinkedIntList(head, tail)
}