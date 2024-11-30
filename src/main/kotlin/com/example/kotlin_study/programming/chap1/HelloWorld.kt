package com.example.kotlin_study.programming.chap1

var int = 123;
var intToLong = int.toLong()

fun main(args: Array<String>) {
    println("Hello World")

    var student = Student("changkeun.yoo")
    var carManufacturer = CarManufacturer("마세라티 르반때")

    println("Student name: ${student.getName()}")
    println("CarManufacturer name: ${carManufacturer.getName()}")

    var name = "유창근"
    println("name: ${name}")

    println("intToLong: ${intToLong}")

}