package org.UshArt.kotlin_course.Lesson21.HomeWork

/*
Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int. Реализуй проверку, что число чётное.
 */

class OddValidator : Validator<Int> {
    override fun validate(value: Int): Boolean {
        return value % 2 == 0
    }
}