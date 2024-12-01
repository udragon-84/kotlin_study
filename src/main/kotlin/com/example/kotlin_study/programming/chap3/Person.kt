package com.example.kotlin_study.programming.chap3

class Person constructor(var firstName: String, var lastName: String, var age: Int){
    init {
        println("firstName.length is ${firstName.length}")
        require(firstName.trim().length > 0) {
            "Invalid first name length"
        }
    }

    fun getName(): String {
        return this.firstName + this.lastName
    }

    override fun toString(): String {
        return super.toString()
    }
}

fun main(args:Array<String>) {
    var person1 = Person("유", "창근", 41)
    var person2 = Person2("박", "규리", 39)

    println("${person1.firstName},${person1.lastName} is ${person1.age} years old")
    println("${person2.getName()}, ${person2.getAge()} years old")

    println("Name: ${person1.getName()}, ${person2.getName()}")
}