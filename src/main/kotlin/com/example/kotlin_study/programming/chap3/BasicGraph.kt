package com.example.kotlin_study.programming.chap3

class BasicGraph(var name: String) {
    class Line(var x1: Int,  var y1: Int, var x2: Int, var y2: Int) {
        fun draw(): Unit {
            println("Drawing Line from ($x1:$y1) to ($x2:$y2)")
        }
    }

    fun draw() {
        println("Drawing the graph $name")
    }
}

fun main(args: Array<String>) {
    var base = BasicGraph("changkeun.yoo")
    base.draw()

    var line = BasicGraph.Line(1, 0, -2, 0)
    line.draw()
}