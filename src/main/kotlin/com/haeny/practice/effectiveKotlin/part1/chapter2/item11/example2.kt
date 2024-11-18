package com.haeny.practice.effectiveKotlin.part1.chapter2.item11

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.ObjectInputStream
import java.util.zip.ZipInputStream

fun main() {
    val person: Person? = null
    fun printName() {
        person?.let {
            print(it.name)
        }
    }

    val students = listOf(Student())
    students
        .filter { it.result >= 50 }
        .joinToString(separator = "\n") {
            "${it.name} ${it.surname} ${it.result}"
        }
        .let(::print)

    val obj = FileInputStream("filepath")
        .let(::BufferedInputStream)
        .let(::ZipInputStream)
        .let(::ObjectInputStream)
        .readObject() as Student
}

class Student(
    val name: String = "Juhaeny",
    val surname: String = "Jeong",
    val result: Int = 30,
)





