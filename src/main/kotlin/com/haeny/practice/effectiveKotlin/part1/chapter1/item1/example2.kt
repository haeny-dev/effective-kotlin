package com.haeny.practice.effectiveKotlin.part1.chapter1.item1

import java.util.SortedSet

fun main() {
    /**
     * 가변 컬렉션과 읽기 전용 컬렉션 구분하기
     */
    val list = listOf(1, 2, 3)
//    if (list is MutableList) {
//        list.add(4)
//    })

    val mutableList = list.toMutableList()
    mutableList.add(4)

    /**
     * 데이터 클래스의 copy
     */
    var user = User("JuHaney", "Jeong")
//    user = user.withSurname("Kim")
//    print(user)

    user = user.copy(surname = "Kim")
    print(user)
}

data class User(
    val name: String,
    val surname: String,
)
//{
//    fun withSurname(surname: String) = User(surname, surname)
//}