package org.UshArt.kotlin_course.Lesson18.HomeWork.animals

import org.UshArt.kotlin_course.Lesson18.HomeWork.Colors
import org.UshArt.kotlin_course.Lesson18.HomeWork.printColored

class Bird() : Animal() {
    override fun makeSound(sound: String) {
        printColored(sound, Colors.RED)
    }
}