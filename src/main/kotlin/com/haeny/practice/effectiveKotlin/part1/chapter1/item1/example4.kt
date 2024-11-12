package com.haeny.practice.effectiveKotlin.part1.chapter1.item1

fun main() {
    val repository = PersonRepository()
    val stored = repository.loadAll()
//    stored[4] = "aaa"
}

data class Person(val name: String)

class PersonRepository {
    private val storedPerson: MutableMap<Int, String> = mutableMapOf()

    fun loadAll(): Map<Int, String> {
        return storedPerson
    }
}

