package com.haeny.practice.effectiveKotlin.part1.chapter2.item15

fun main() {
    val node = Node("parent")
    node.makeChild("child")
}

class Node(val name: String) {
//    fun makeChild(childName: String) =
//        create("$name.$childName").apply {
//            print("Created ${this?.name}")
//        }

//    fun makeChild(childName: String) =
//        create("$name.$childName").also {
//            print("Created ${it?.name}")
//        }

    fun makeChild(childName: String) =
        create("$name.$childName").apply {
            print("Created ${this?.name} in ${this@Node.name}")
        }


    fun create(name: String): Node? = Node(name)
}