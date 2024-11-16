package com.haeny.practice.effectiveKotlin.part1.chapter2.item11

fun main() {
    val person = Person()
    val view = View()

    // A
    if (person != null && person.isAdult) {
        view.showPerson(person)
    } else {
        view.showError()
    }

    // B
    person?.takeIf { it.isAdult }
        ?.let(view::showPerson)
        ?: view.showError()
}

class Person(
    val name: String = "Juhaeny"
) {
    val isAdult = false
}

class View {
    fun showPerson(person: Person) {}
    fun showError() {}
}