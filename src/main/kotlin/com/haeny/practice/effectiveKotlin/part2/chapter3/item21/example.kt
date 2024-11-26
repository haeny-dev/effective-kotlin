package com.haeny.practice.effectiveKotlin.part2.chapter3.item21

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    val map: Map<String, Any> = mapOf(
        "name" to "Marcin",
        "kotlinProgrammer" to true
    )

    val name by map
    println(name)
}

class KeyValue {
    val value by lazy { createValue() }
    var key: String? by Delegates.observable(null) { _, old, new ->
        println("key changed from $old to $new")
    }

    private fun createValue() {}
}

class Test {
    var token: String? = null
        get() {
            println("token returned value $field")
            return field
        }
        set(value) {
            println("token changed from $field to $value")
            field = value
        }

    var attempts: Int = 0
        get() {
            println("attempts returned value $field")
            return field
        }
        set(value) {
            println("attempts changed from $field to $value")
            field = value
        }
}

class DelegateTest {
    var token: String? by LoggingProperty(null)
    var attempts: Int by LoggingProperty(0)
}

class LoggingProperty<T>(var value: T) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        println("${property.name} returned value $value")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: T) {
        val name = property.name
        println("$name changed from $value to $newValue")
        value = newValue
    }
}