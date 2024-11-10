package org.UshArt.kotlin_course.Lesson18.HomeWork.shapes

class Circle(val radius: Double) : Shape() {
    override fun figureArea(): Double {
        return 3.14 * radius * radius
    }
}