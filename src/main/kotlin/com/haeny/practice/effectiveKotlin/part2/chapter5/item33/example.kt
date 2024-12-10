package com.haeny.practice.effectiveKotlin.part2.chapter5.item33

import javax.swing.text.Element
import javax.swing.text.html.ListView

fun main() {
    // 생성자 방식
//    val list = MyLinkedList(1, MyLinkedList(2, null))
    val list = MyLinkedList.of(1, 2)
    val list3 = MyList.of(1, 2)

    // 톱레벨 함수 방식
    val list2 = myLinkedListOf(1, 2)
}



fun makeListView(config: Config) : ListView {
//    val items = ...
    return ListView(config.items)
}

class Config(
    val items: Element,
)

//class IntLinkedList : MyLinkedList<Int>() {
//
//    constructor(vararg ints: Int): myLinkedListOf(*ints) // ERROR
//}


