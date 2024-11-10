package org.UshArt.kotlin_course.Lesson15.Class

class Car(
    private var brand: String,
    private var model: String
){
    fun  sayMyName() {
        println("I am $brand $model")
    }
    companion object {
        val carList = listOf("Audi", "Kia", "Запорожец")
    }
}