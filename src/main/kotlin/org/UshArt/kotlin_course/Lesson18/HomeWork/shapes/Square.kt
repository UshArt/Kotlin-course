package org.UshArt.kotlin_course.Lesson18.HomeWork.shapes

class Square(val side: Double) : Shape() {
    override fun figureArea(): Double {
        return side * side
    }
}