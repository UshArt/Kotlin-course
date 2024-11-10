package org.UshArt.kotlin_course.Lesson15.HomeWork

/*
Создайте дата класс для продукта, который будет представлять продукт в магазине. У него должны быть
свойства “название”, “цена”, “количество”.
 */

data class Product(val name: String = "Рыба", val price: Double = 0.0, val quantity: Int = 100)