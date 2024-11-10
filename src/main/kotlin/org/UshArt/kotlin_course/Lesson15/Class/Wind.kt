package org.UshArt.kotlin_course.Lesson15.Class

class Wind (private val speed: Int) {

    fun convert(): Int{
        return speed * 1000 / 3600
    }
}