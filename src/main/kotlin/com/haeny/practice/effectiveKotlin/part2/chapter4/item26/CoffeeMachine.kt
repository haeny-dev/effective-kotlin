package com.haeny.practice.effectiveKotlin.part2.chapter4.item26

class CoffeeMachine {
    fun makeCoffee() {
        boilWater()
        brewCoffee()
        pourCoffee()
        pourMilk()
    }

    fun makeEspressoCoffee() {
        boilWater()
        brewCoffee()
        pourCoffee()
    }

    private fun boilWater() {
        // ...
    }

    private fun brewCoffee() {
        // ...
    }

    private fun pourCoffee() {
        // ...
    }

    private fun pourMilk() {
        // ...
    }
}