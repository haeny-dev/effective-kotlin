package com.haeny.practice.effectiveKotlin.part2.chapter4.item27

//fun main() {
//    val context = Context()
//    val messageDisplay = MessageDisplay(context)
//    messageDisplay.show("Message")
//}
//
//class MessageDisplay(
//    val context: Context,
//) {
//    fun show(
//        message: String,
//        duration: MessageLength = MessageLength.LONG,
//    ) {
//        val toastDuration = when (duration) {
//            MessageLength.SHORT -> LENGTH_SHORT
//            MessageLength.LONG -> LENGTH_LONG
//        }
//
//        Toast.makeText(context, message, toastDuration)
//            .show()
//    }
//}