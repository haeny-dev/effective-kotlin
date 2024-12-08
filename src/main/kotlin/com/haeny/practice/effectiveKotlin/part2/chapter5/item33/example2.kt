package com.haeny.practice.effectiveKotlin.part2.chapter5.item33

interface Tool {
    companion object {

    }
}

class BigTool : Tool

fun Tool.Companion.createBigTool() : BigTool {
    return BigTool()
}

fun main() {
    Tool.createBigTool()
}