package com.haeny.practice.effectiveKotlin.part2.chapter4.item27

class Context

class Toast {
    companion object {
        const val LENGTH_LONG = 5
        fun makeText(
            context: Context,
            message: String,
            duration: Int,
        ): Toast {
            // ...
            return Toast()
        }
    }

    fun show() {
        // ...
    }
}

fun Context.toast(
    message: String,
    duration: Int = Toast.LENGTH_LONG,
) {
    Toast.makeText(this, message, duration).show()
}

class Snackbar {
    companion object {
        const val LENGTH_LONG = 5
        fun makeText(
            context: Context,
            message: String,
            duration: Int,
        ): Toast {
            // ...
            return Toast()
        }
    }

    fun show() {
        // ...
    }
}

fun Context.snackbar(
    message: String,
    duration: Int = Snackbar.LENGTH_LONG,
) {
    // ...
}

enum class MessageLength {
    SHORT,
    LONG
}

const val LENGTH_SHORT = 1
const val LENGTH_LONG = 5

fun Context.showMessage(
    message: String,
    duration: MessageLength = MessageLength.LONG,
) {
    val toastDuration = when (duration) {
        MessageLength.SHORT -> LENGTH_SHORT
        MessageLength.LONG -> LENGTH_LONG
    }

    Toast.makeText(this, message, toastDuration).show()
}