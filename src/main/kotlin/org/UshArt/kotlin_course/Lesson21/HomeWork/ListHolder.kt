package org.UshArt.kotlin_course.Lesson21.HomeWork

/*
Напишите класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления и получения
всех элементов.
 */

class ListHolder<T>(private val list: MutableList<T>) {
    fun addElement(element: T) {
        list.add(element)
    }

    fun getElements(): List<T> {
        return list
    }
}