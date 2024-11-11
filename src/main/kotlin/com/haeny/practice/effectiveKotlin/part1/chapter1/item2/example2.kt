package com.haeny.practice.effectiveKotlin.part1.chapter1.item2

fun main() {
    print(primes.take(10).toList())
}

val primes: Sequence<Int> = sequence {
    var numbers = generateSequence(2) { it + 1}

    while (true) {
        val prime = numbers.first()
        yield(prime)
        numbers = numbers.drop(1)
            .filter { it % prime != 0 }
    }
}