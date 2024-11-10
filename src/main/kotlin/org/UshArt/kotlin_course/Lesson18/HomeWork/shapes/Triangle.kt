package org.UshArt.kotlin_course.Lesson18.HomeWork.shapes

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) : Shape() {
    val p = (sideA + sideB + sideC) / 2
    override fun figureArea(): Double {
        return sqrt(p * (p - sideA) * (p - sideB)* (p - sideC))
    }
}