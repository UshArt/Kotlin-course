package org.UshArt.kotlin_course.Lesson19.HomeWork.calculator

abstract class OperationClass(
    val symbol: String
) {
    abstract fun execute(operands: Pair<Any, Any>): String

    abstract fun isApplicable(operands: Pair<Any, Any>): Boolean

}