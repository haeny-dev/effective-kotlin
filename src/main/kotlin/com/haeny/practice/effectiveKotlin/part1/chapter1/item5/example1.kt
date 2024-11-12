package com.haeny.practice.effectiveKotlin.part1.chapter1.item5

// argument
fun factorial(n: Int): Long {
    require(n >= 0) {
        // IllegalArgumentException 발생
        "Cannot calculate factorial of $n because it is smaller than 0"
    }
    return if (n <= 1) 1 else factorial(n - 1) * n
}

// state
val isInitialized: Boolean = false
fun speak(text: String) {
    check(isInitialized)  //  IllegalStateException 발생
    //...
}

class Person(val email: String?)

fun validateEmail(email: String) {
    // ...
}

fun sendEmail(person: Person, text: String) {
//    val email = requireNotNull(person.email)
//    validateEmail(email)

//    requireNotNull(person.email)
//    validateEmail(person.email)

    val email: String = person.email ?: run {
        println("Email not sent, no email address")
        return
    }
}