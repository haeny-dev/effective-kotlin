package com.haeny.practice.effectiveKotlin.part1.chapter1.item3

fun main() {
//    val repo = UserRepo()
//    val user1 = repo.user   // User!
//    val user2: User = repo.user      // User
//    val user3: User? = repo.user     // User?

//    statedType()
//    platformType()

    val repo: UserRepo = RepoImpl()
    val text: String = repo.getUserName()
    print("User name length is ${text.length}")
}


fun statedType() {
    val value: String = JavaClass().value
    println(value.length)
}

fun platformType() {
    val value = JavaClass().value
    println(value.length)
}

interface UserRepo {
    fun getUserName() = JavaClass().value
}

class RepoImpl : UserRepo {
    override fun getUserName(): String? {
        return null
    }
}