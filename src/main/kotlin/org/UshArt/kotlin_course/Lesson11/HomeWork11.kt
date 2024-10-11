package org.UshArt.kotlin_course.Lesson11

fun main() {

//Задания в целом повторяют задачи с урока и служат для закрепления навыка, поэтому стараемся выполнять без переписывания с урока.
//Задание 1: Создание Пустого Словаря
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val firstMap = mapOf<Int, Int>()

//Задание 2: Создание и Инициализация Словаря
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

    val secondMap = mapOf<Float, Double>(32.04F to 1.0, 67.56F to 17.4)

//Задание 3: Создание Изменяемого Словаря
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val threeMap = mutableMapOf<Int, String>()

//Задание 4: Добавление Элементов в Словарь
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    val list1 = listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
        "u", "v", "w")
    val map4 = mutableMapOf<Int, String>()
    for (i in list1.indices) {
        map4[i] = list1[i]
    }
    println(map4)

//Задание 5: Получение Значений из Словаря
//Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.

    println(map4[5])
    println(map4[57])

//Задание 6: Удаление Элементов из Словаря
//Удалите определенный элемент из изменяемого словаря по его ключу.

    map4.remove(10)
    println(map4)

//Задание 7: Перебор Словаря в Цикле
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

    val mapFor7: Map<Double, Int> = mapOf(10.1 to 2, 2.2 to 0, 4.0 to 9, 0.0 to 10)

    println(mapFor7)

    for (entreis in mapFor7)
        if (entreis.value == 0) {
            println("бесконечность")
        } else println(entreis.key / entreis.value)

//Задание 8: Перезапись Элементов Словаря
//Измените значение для существующего ключа в изменяемом словаре.

    var map8 = mutableMapOf<Int, String>(1 to "Дома", 2 to "очень", 3 to "много", 4 to "еды")
    println(map8)
    map8[1] = "В ресторане"
    map8[4] = "выпивки"
    println(map8)

//Задание 9: Сложение Двух Словарей
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

    val fistMapFor9: Map<Int, String> = mapOf(10 to "негритят", 20 to "век фокс")

    val secondMapFor9: Map<Int, String> = mapOf(12 to "апостолов", 7 to "дней недели")

    val mutableMapFor9: MutableMap<Int,String> = mutableMapOf()

    for ((numbers, info) in fistMapFor9) {
        mutableMapFor9[numbers] = info
    }
    for ((numbers, info) in secondMapFor9) {
        mutableMapFor9[numbers] = info
    }

    println(mutableMapFor9)

//Задание 10: Словарь с Сложными Типами
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.

    val map10 = mapOf<String, List<Int>>("Даты" to listOf(1, 2, 3), "Возраст" to listOf(4, 5, 6))
    println(map10)

//Задание 11: Использование Множества в Качестве Значения
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
// Распечатай полученное множество.

    val set1 = mutableSetOf("Яблоко", "Арбуз", "Дыня")
    val set2 = mutableSetOf("Порше", "Ауди", "Вольво")
    val set3 = mutableSetOf("Гвоздь", "Палка", "Молоток")
    val map11 = mapOf<Int, MutableSet<String>>(1 to set1, 2 to set2, 3 to set3)
    println(map11)
    val updSet3 = map11[3]
    updSet3?.add("Плотник")
    println(updSet3)
    println(map11)

//Задание 12: Поиск Элемента по Значению
//Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val mapIntFor12: Map<Pair<Int, Int>, Int> = mapOf(
        Pair(1, 2) to 1,
        Pair(3, 4) to 2,
        Pair(5, 6) to 3,
        Pair(6, 5) to 4,
        Pair(4, 3) to 5,
        Pair(2, 1) to 6
    )

    for ((key, value) in mapIntFor12) {
        val (a, b) = key
        if ( a == 5 || b == 5) {
            println(key)
        }
    }

//======
//Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.
//Задание 6: Словарь Библиотека
//Ключи - автор книги, значения - список книг

    val map13 = mutableMapOf<String, MutableList<String>>()

//Задание 12: Справочник Растений
//Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

    val map14 = mutableMapOf<String, List<String>>()

//Задание 8: Четвертьфинала
//Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val map15 = mutableMapOf<String, MutableList<String>>()

//Задание 9: Курс лечения
//Ключи - даты, значения - список препаратов принимаемых в дату

    val map16 = mutableMapOf<Long, MutableList<String>>()

//Задание 10: Словарь Путешественника
//Ключи - страны, значения - словари из городов со списком интересных мест.

    val map17 = mutableMapOf<String, MutableMap<String, MutableList<String>>>()

}