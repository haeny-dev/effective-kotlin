package com.haeny.practice.effectiveKotlin.part2.chapter4.item27

interface MessageDisplay {
    fun show(
        message: String,
        duration: MessageLength = MessageLength.LONG,
    )
}

class ToastDisplay(
    val context: Context,
) : MessageDisplay {
    override fun show(message: String, duration: MessageLength) {
        val toastDuration = when (duration) {
            MessageLength.SHORT -> LENGTH_SHORT
            MessageLength.LONG -> LENGTH_LONG
        }

        Toast.makeText(context, message, toastDuration)
            .show()
    }
}