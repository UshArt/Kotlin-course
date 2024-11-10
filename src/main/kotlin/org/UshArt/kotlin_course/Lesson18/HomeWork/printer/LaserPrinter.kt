package org.UshArt.kotlin_course.Lesson18.HomeWork.printer

import org.UshArt.kotlin_course.Lesson18.HomeWork.Background
import org.UshArt.kotlin_course.Lesson18.HomeWork.Colors
import org.UshArt.kotlin_course.Lesson18.HomeWork.printColored

class LaserPrinter() : Printer() {
    override fun print(str: String) {
        printText(str, Colors.BLACK, Background.WHITE)
    }
}