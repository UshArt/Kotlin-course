package org.UshArt.kotlin_course.Lesson19.HomeWork

fun main(){
    val child = ChildrenClass("значение приватного", "значение защищенного", "значение публичного")

    child.publicField = "Антонио Бандерас"
    child.updateProtectedField("Хулио Иглесиас")
    child.setPrivateField("Урмас Отт")

    println(child.getAll())

    child.printText()
}