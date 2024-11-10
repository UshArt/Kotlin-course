package org.UshArt.kotlin_course.Lesson15.Class

class Person(val name: String, var age: Int) {

    // Метод класса
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}