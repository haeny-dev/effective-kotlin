package com.haeny.practice.effectiveKotlin.part2.chapter3.item22

fun main() {
    val forest = Forest<Birch>()
    forest.addTree(Birch())
//    forest.addTree(Spruce())  // ERROR
}

interface Tree
class Birch: Tree
class Spruce: Tree

class Forest<T: Tree> {
//    fun <T: Tree> addTree(tree: T) {}

    fun addTree(tree: T) {
        // ...
    }
}