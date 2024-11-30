package com.example.kotlin_study.programming.chap2

import java.io.File
import java.util.*

fun main(array: Array<String>) {
    var x = 1
    var y = 2
    var z = 2

    var isTrue = x < y && x < z
    println("isTrue: ${isTrue}")
    var alsoTrue = x == y || y == z
    println("alsoTrue: ${alsoTrue}")

    var array = arrayOf(1, 2, 3)
    println(array.joinToString())

    var perfectSquares = Array(10, {k -> k * k})
    println(perfectSquares.joinToString())

    println(perfectSquares.size)
    array[2] = 5
    println(array[2])

    var name = "changkeun.yoo"
    println("name: $name. nameSize: ${name.length}")


    var aToz = "a".."z"
    println("aToz: $aToz")

    var isCTrue = "c" in  aToz
    println("isTrue: $isTrue")

    var countingDown = 100.downTo(0);
    println("countingDown: $countingDown")


    var numList = arrayOf(1, 2, 3)
    for (i in numList) {
        println(i)
    }

    var oneToTen = 1..10
    for (i in oneToTen) {
        println(i)
    }

    var file = File("/etc/nginx/nginx.conf")

    var resultValue = isAbs(3)
    println("resultValue: $resultValue")

    printLessThanTwo()
}


fun isAbs(x: Int): Boolean {
    return when (x) {
        Math.abs(x) -> true
        else -> false
    }
}

fun printLessThanTwo(): Unit {
    var list = listOf(1, 2, 3, 4, 5)
    list.forEach(fun(value: Int) {
        if (value < 3) println(value)
        else return
    })
    println("This line will still execute")
}
