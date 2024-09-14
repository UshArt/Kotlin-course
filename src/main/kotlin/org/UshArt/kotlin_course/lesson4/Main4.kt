package org.UshArt.kotlin_course.lesson4

val myInt: Int = 215165

val myFloat: Float = 0.58F

val myLong: Long = 1_253_648_545L

val myShort: Short = 32000

val myByte: Byte = 120

val myDouble: Double = 5.50

val isKotlinFun: Boolean = true

val letter: Char = 'r'

val text: String "Hello, Kotlin!"

val numbers: Array<Int> = arrayOf(1, 2, 3)

val strings: MutableList<String> = mutableListOf("one", "two", "three")

val doubles: Set<Double> = setOf(23.5, 56.8)

val keysToValue: Map<String, String> = mapOf(
    "Ключ 1" to "Значение 1",
    "Ключ 2" to "Значение 2",
)

val anything: Any = false

fun printMessage(message: String) {
    println(message)
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}