package com.example.kotlin_study.programming.chap3

class Person2(firstName: String, lastName: String, howOld: Int?) {
    private val name: String
    private var age: Int?

    init {
        this.name = "$firstName, $lastName"
        this.age = howOld
    }
    fun getName(): String {
        return this.name
    }

    fun getAge(): Int? {
        return this.age
    }
}