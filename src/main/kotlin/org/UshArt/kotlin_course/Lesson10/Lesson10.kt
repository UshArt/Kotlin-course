package com.UshArt.org.UshArt.kotlin_course.Lesson10

fun main() {
    val numbers = arrayOf<Int>() //массив

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" }

    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c") //неизменяемый список

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") //изменяемый список

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5) //множество неизменяемое

    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5) //изменяемое множество

    val set = setOf("K", "o", "t", "l", "i", "n")

//    for (letter in set) {
//
//        println("| $letter |")
//
//    }

    val list = listOf(32, 53, 1, -76)

    for (index in list.indices) {

        if (index == list.lastIndex) {

            println(list[index] + list[0])

        } else {

            println(list[index] + list[index + 1])

        }

    }

    var index = list.lastIndex

    while (index >= 0) {

        println("`${list[index--]}`")

    }
}