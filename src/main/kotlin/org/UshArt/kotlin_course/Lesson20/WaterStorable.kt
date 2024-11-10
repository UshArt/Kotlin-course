package org.UshArt.kotlin_course.Lesson20

interface WaterStorable {

    val volume: Int  // так же без реализации, только тип

    fun fill(amount: Int)

    fun take(amount: Int)

}