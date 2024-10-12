package com.UshArt.Stepik

import kotlin.math.sqrt

//fun main() {
//    возведение в степень
//    val n = readln().toInt()
//    val n2 = n * n
//    val n4 = n2 * n2
//    val result = n4 * n2
//    println(result)
//
//    var date: Int = readln().toInt()
//    println("Следующее за числом $date число: ${date + 1}")
//    println("Для числа $date предыдущее число: ${date - 1}")
//
//    var number: Int = readln().toInt()
//    println("${number % 10}${number % 100 / 10}${number / 100}")

//    var a: Int = readln().toInt()
//    var b: Int = readln().toInt()
//    var c = (a.toDouble() + b) / 2
//    println(c)
//
//    var b: Double = readln().toDouble()
//    var sum = Math.pow(b, 13.0)
//    println(sum)
//
//    val a = readln().toDouble()
//    val b = readln().toDouble()
//
//    val c = Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0))
//    val p = a + b + c
//    println(p)
//
//    var x1: Int = readln().toInt()
//    var y1: Int = readln().toInt()
//    var x2: Int = readln().toInt()
//    var y2: Int = readln().toInt()
//
//    var dx = (x1 - x2).toDouble()
//    var dy = (y1 - y2).toDouble()
//    var dis = Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0))
//    println(dis)

//    var x1: Int = readln().toInt()
//    var y1: Int = readln().toInt()
//    var x2: Int = readln().toInt()
//    var y2: Int = readln().toInt()
//
//    var a = x1 - x2
//    var b = y1 - y2
//    var distance = Math.abs(a) + Math.abs(b)
//    println(distance)
//
//    var a: Int = readln().toInt()
//    var b: Int = readln().toInt()
//    var c: Int = readln().toInt()
//
//    println("${a + b + c} ${a * b * c}")
//
//    var number: Int = readln().toInt()
//    var end = number % 1000 / 10
//    println(end)
//
//    var a1: Int = readln().toInt()
//    var d: Int = readln().toInt()
//    var n: Int = readln().toInt()
//    var an = a1 + d * (n - 1)
//    println(an)
//
//    var number: Int = readln().toInt()
//    var chiclo = number % 1000
//    var a = chiclo / 100
//    var b = chiclo % 100 / 10
//    var c = chiclo % 10
//    println(a + b + c)
//
//    var a: Double = readln().toDouble()
//    var b: Double = readln().toDouble()
//    var a1 = Math.pow(a, 2.0)
//    var b1 = Math.pow(b, 2.0)
//    var c = Math.sqrt(a1 + b1)
//    println(c)
//}

fun main() {
//    println("Выйти из дома")
//    println("Дойти до магазина")
//    println("Хлеб есть? Введите Есть или Нет")
//    val answer: String = readln()
//
//    if (answer == "Есть") {
//        println("Купить хлеб")
//    }
//
//    println("Дойти до дома")
//    println("Зайти в дом")
//
//    var a: Int = readln().toInt() // найти максимум
//    var b: Int = readln().toInt()
//    if (a > b) {
//        println(a)
//    } else {
//        println(b)
//    }
//
//    val a = readln().toInt() //найти максимум
//    val b = readln().toInt()
//
//    var max = a
//    if (b > a) {
//        max = b
//    }
//
//    println(max)
//
//    var password = readln() //сравнение паролей
//    var password2 = readln()
//    if (password == password2) {
//        println("Пароль принят")
//    } else {
//        println("Пароль не принят")
//    }
//
//    var age: Int = readln().toInt() //доступ к контенту
//    if (age >= 12) {
//        println("Доступ разрешен")
//    } else {
//        println("Доступ запрещен")
//    }
//
//    var number: Int = readln().toInt() //поиск четных чисел
//    if (number % 2 == 0) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    var a: Int = readln().toInt()
//    var b: Int = readln().toInt()
//    if (a % b == 0) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    var x: Int = readln().toInt() //знак числа
//    if (x > 0) {
//        println(1)
//    }
//    if (x == 0) {
//        println(0)
//    }
//    if (x < 0) {
//        println(-1)
//    }
//
//    val n = readln().toInt() //знак числа
//
//    if (n > 0) {
//        println(1)
//    } else if (n < 0) {
//        println(-1)
//    } else {
//        println(0)
//    }
//
//    var x: Int = readln().toInt() //диапазон
//    if (x > -1 && x < 17) {
//        println("Принадлежит")
//    } else {
//        println("Не принадлежит")
//    }
//
//    var x1: Int = readln().toInt()
//    if (x1 / 100 >= 1 && x1 /100 <= 9) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    var x: Int = readln().toInt()
//    if (x <= -3 || x >= 7) {
//        println("Принадлежит")
//    } else {
//        println("Не принадлежит")
//    }
//
//    val n = readln().toInt() //сравнение всех цифр в числе
//
//    val c1 = n / 100
//    val c2 = n % 100 / 10
//    val c3 = n % 10
//
//    if (c1 == c2 || c2 == c3 || c1 == c3) {
//        println("NO")
//    } else {
//        println("YES")
//    }

//    var lucky: Int = readln().toInt() //счастливый билет
//    var one = lucky / 100000
//    var two = lucky / 10000 % 10
//    var three = lucky / 1000 % 10
//    var four = lucky % 1000 / 100
//    var fifth = lucky % 1000 / 10 % 10
//    var six = lucky % 10
//    if ((one + two + three) == (four + fifth + six)) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    val n = readln().toInt() //счастливый билет
//
//    val c1 = n / 100000
//    val c2 = n % 100000 / 10000
//    val c3 = n % 10000 / 1000
//    val c4 = n % 1000 / 100
//    val c5 = n % 100 / 10
//    val c6 = n % 10
//
//    if (c1 + c2 + c3 == c4 + c5 + c6) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    val year: Int = readln().toInt()
//    if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    var age: Int = readln().toInt() //возраст
//    if (age in 0..13) {
//        println("детство")
//    } else if (age in 14..24) {
//        println("молодость")
//    } else if (age in 25..59) {
//        println("зрелость")
//    } else {
//        println("старость")
//    }
//
//    val age = readln().toInt() //возраст
//
//    if (age <= 13) {
//        println("детство")
//    } else if (age <= 24) {
//        println("молодость")
//    } else if (age <= 59) {
//        println("зрелость")
//    } else {
//        println("старость")
//    }
//
//    var x1: Int = readln().toInt()
//    var y1: Int = readln().toInt()
//    var x2: Int = readln().toInt()
//    val y2: Int = readln().toInt()
//    if (x1 == x2 || y1 == y2) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    var x1: Int = readln().toInt()
//    var y1: Int = readln().toInt()
//    var x2: Int = readln().toInt()
//    val y2: Int = readln().toInt()
//    if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    var number: Int = readln().toInt()
//
//    if (number in -3..1 || number in 5..9) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    var limit: Int = readln().toInt()
//
//    if (limit < 60) {
//        println("Легкий вес")
//    } else {
//        if (limit < 64) {
//            println("Первый полусредний вес")
//        } else {
//            if (limit < 69) {
//                println("Полусредний вес")
//            }
//        }
//    }
//
//    val a = readln().toInt() //проверка повторяющихся чисел
//    val b = readln().toInt()
//    val c = readln().toInt()
//
//    if (a == b && b == c) {
//        print(3)
//    } else if (a != b && b != c && a != c) {
//        println(0)
//    } else {
//        println(2)
//    }
//
//    var x: Double = readln().toDouble()
//    var y: Double = readln().toDouble()
//
//    if (x > 0.0 && y > 0.0) {
//        println("I")
//    } else if (x < 0.0 && y < 0.0) {
//        println("III")
//    } else if (x > 0.0 && y < 0.0) {
//        println("IV")
//    } else {
//        println("II")
//    }
//
//    val a = readln().toInt() //калькулятор
//    val b = readln().toInt()
//    val operation = readln()
//
//    if (operation == "+")  {
//        println(a + b)
//    } else if (operation == "-")  {
//        println(a - b)
//    } else if (operation == "*")  {
//        println(a * b)
//    } else if (operation == "/")  {
//        if (b == 0) {
//            println("На ноль делить нельзя!")
//        } else {
//            println(a / b.toDouble())
//        }
//    } else {
//        println("Неверная операция")
//    }
//
//    var a: Double = readln().toDouble()
//    var b: Double = readln().toDouble()
//    var c: Double = readln().toDouble()
//
//    var d = Math.pow(b, 2.0) - 4 * a * c //возведение в степень
//
//    if (d > 0.0) {
//        var x1 = (-b + Math.sqrt(d)) / (2 * a) //квадратный корень
//        var x2 = (-b - Math.sqrt(d)) / (2 * a)
//        if (x1 > x2) {
//            println("$x2")
//            println("$x1")
//        } else {
//            println("$x1")
//            println("$x2")
//        }
//    } else if (d == 0.0) {
//        var x = -b / (2 * a)
//        println(x)
//    }
//
//    var month = readln().toInt() //дней в месяце
//
//    when (month) {
//        1 -> println(31)
//        2 -> println(29)
//        3 -> println(31)
//        4 -> println(30)
//        5 -> println(31)
//        6 -> println(30)
//        7 -> println(31)
//        8 -> println(31)
//        9 -> println(30)
//        10 -> println(31)
//        11 -> println(30)
//        12 -> println(31)
//    }
//
//    val month = readln().toInt() //дней в месяце
//
//    when (month) {
//        2 -> println(29)
//        4, 6, 9, 11 -> println(30)
//        else -> println(31)
//    }
//
//    val month = readln().toInt()
//    when (month) {
//        12, 1, 2 -> println("Зима")
//        3, 4, 5 -> println("Весна")
//        6, 7, 8 -> println("Лето")
//        9, 10, 11 -> println("Осень")
//    }
//
//    var  number = readln().toInt() //четные числа
//
//    if (number % 10 % 2 == 0) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//
//    val n = readln().toInt() //четные числа
//
//    when (n % 2) {
//        0 -> println("YES")
//        1 -> println("NO")
//    }
//
//    var number: Int = readln().toInt()
//
//    if (number % 2 == 0) {
//        println(number + 2)
//    }else {
//        println(number + 1)
//    }
//
//    val n = readln().toInt()
//
//    val c1 = n / 1000
//    val c2 = n % 1000 / 100
//    val c3 = n % 100 / 10
//    val c4 = n % 10
//
//    val nReverse = c4 * 1000 + c3 * 100 + c2 * 10 + c1
//
//    if (n == nReverse) {
//        println("YES")
//    } else {
//        println("NO")

    var number: Int = readln().toInt() // образуют ли цифры данного числа возрастающую последовательность.

    var x = number / 100
    var y = number % 100 / 10
    var z = number % 10

    if (x < y && y < z) {
        println("YES")
    } else {
        println("NO")
    }

    val n = readln() // образуют ли цифры данного числа возрастающую последовательность.
    print(if (n[0]<n[1]&&n[1]<n[2]) "YES" else "NO")

    var k: Int = readln().toInt()
    var m: Int = readln().toInt()

    var days = k / m
    if (k % m > 0) {
        days++
    }
    println(days)

    val k2 = readln().toInt()
    val k3 = readln().toInt()
    val k5 = readln().toInt()
    val k6 = readln().toInt()

    val max256 = Math.min(k2, Math.min(k5, k6))
    val max32 = Math.min(k3, k2 - max256)

    val sum = max256 * 256 + max32 * 32
    println(sum)
}