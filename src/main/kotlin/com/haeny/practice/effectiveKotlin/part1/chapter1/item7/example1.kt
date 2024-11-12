package com.haeny.practice.effectiveKotlin.part1.chapter1.item7

sealed class Result<out T>

class Success<out T>(val result: T) : Result<T>()
class Failure(val throwable: Throwable) : Result<Nothing>()
class JsonParsingException: Exception()

val incorrectSign = false

//inline fun <reified T> String.readObject(): Result<T> {
//    if (incorrectSign) {
//        return Failure(JsonParsingException())
//    }
//
////    return Success(this)
//    return Success("dasdadsa")
//}