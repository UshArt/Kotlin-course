package org.UshArt.kotlin_course.Lesson18.HomeWork.animals

import org.UshArt.kotlin_course.Lesson18.HomeWork.printColored

abstract class Animal() {
    abstract fun makeSound(sound: String)

    protected fun makeSound (sound: String, color: String){
        printColored("This animal makes no sound.", color)
    }
}