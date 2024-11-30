package com.haeny.practice.effectiveKotlin.part2.chapter4.item27

import javax.naming.Context

fun main() {
}

class Validator() {
    companion object {
        const val MIN_PASSWORD_LENGTH = 7
    }

    fun isPasswordValid(text: String): Boolean {
        if (text.length < MIN_PASSWORD_LENGTH) return false

        // ...
        return true
    }
}