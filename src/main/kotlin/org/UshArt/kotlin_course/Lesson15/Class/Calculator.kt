package org.UshArt.kotlin_course.Lesson15.Class

class Calculator {
    companion object {  // сразу добавляет объект к классу и к нему можно обратиться не создавая объект
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}