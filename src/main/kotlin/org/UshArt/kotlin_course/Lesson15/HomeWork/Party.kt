package org.UshArt.kotlin_course.Lesson15.HomeWork

/*
Создайте класс Party, который описывает вечеринку. У него должны быть свойства location (String) и
attendees (Int). Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
 */

class Party (
    val location: String,
    var attendees: Int
) {
    fun details() {
        println("Вечеринка будет проходить по адресу: $location, приглашены $attendees гостей")
    }
}