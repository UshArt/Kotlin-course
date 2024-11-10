package org.UshArt.kotlin_course.Lesson15.Class

class Lamp(
    private var isLight: Boolean
) {
    fun switch(){
        isLight = !isLight
        println(isLight)
    }
}