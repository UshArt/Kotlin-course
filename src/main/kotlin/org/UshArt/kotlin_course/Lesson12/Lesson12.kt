package org.UshArt.kotlin_course.Lesson12

fun main() {
    println(sum23(5, 7))
    println(printSum(12, 34))
    println(sum(2.5, 6.3, false))
    println(printPositionNumbers(listOf(1, 2, 3, 4, -2)))
    println(repleasString(mutableListOf("sadf", "rweqr", "sdfsf"), "rweqr"))
    println(printMap(12, -15))
}


//fun имяФункции (параметры): ТипВозвращаемогоЗначения {
//    // Тело функции
//    return значение
//}

fun sayHello() {
    println("Hello, world!")
}

fun greetUser(name: String) {
    println("Hello, $name")
}

fun sum23(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun multiply(a: Int, b: Int) = a * b

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

fun doSump() {}

fun doSump2() = Unit

fun getUserName(): String {
    return ""
}

fun printGrit(grit: String) {}

fun calcArea(area: Double, area1: Double): Double {
    return 9.0
}

fun findMax(ch1: Int, ch2: Int): Int {
    return 6
}

fun isNullOr(n: String?): Boolean {
    return true
}

fun calcDisc(cd: List<String>, cd2: Int?): Double? {
    return null
}

fun sum(a1: Double, b1: Double, flag: Boolean): Double {
    return if (flag) {
        a1 + b1
    } else {
        a1 - b1
    }
}

fun getMax(x1: Int, y1: Int) = if (x1 > y1) x1 else y1

fun printPositionNumbers(a: List<Int>) {
    for (i in a) {
        if (i > 0) {
            println(i)
        } else return
    }
    println("конец")
}

fun repleasString(st: MutableList<String>, st2: String) {
    for (i in st.indices) {
        if (st[i] == st2) {
            st[i] = st2.uppercase()
            return
        }
    }
    println("строка не нашлась")
}

private fun checkSize(xy: Int, result: String) {
    if (xy == 0) throw IllegalArgumentException("$result не должно быть равным нулю")
}

private fun createRange(size: Int) {
    if (size > 0) {
        0..size
    } else {
        0 downTo size
    }
}


private fun printMap(xSize: Int, ySize: Int) {
    checkSize(xSize, "xSize")
    checkSize(ySize, "ySize")

    val formatterSize = " $xSize".length
    val xRange = createRange(xSize)
    val yRange = createRange(ySize)
}
//    print(" ".repeat(formatterSize))
//
//    for (i in xRange) {
//        print("%${formatterSize}s".format(i))
//    }
//    println()
//    for (i in yRange) {
//        print("%${formatterSize}s".format(i))
//        for (j in yRange) {
//            val m = i * j
//            val result = when {
//                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
//                m % 5 == 0 -> if (i < 0) "-" else "+"
//                else -> "?"
//            }
//            print("%${formatterSize}s".format(result))
//        }
//        println()
//    }
