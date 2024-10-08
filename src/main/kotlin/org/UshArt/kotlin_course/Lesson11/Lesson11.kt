package org.UshArt.kotlin_course.Lesson11

fun main() {

    val pair: Pair<Int, String> = 1 to "a"
    val pair2 = Pair(2, "a")

    println(pair.first)
    println(pair.second)

    val a1 = "Россия" to "Москва"
    val a2 = "Франция" to "Париж"

    val capitals = mapOf(a1, a2)

    val emptyMap: Map<String, String> = mapOf<String, String>()

    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

    val capitalOfRussia = capitals["Россия"]

    println(capitalOfRussia)

    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")

    for (entries in mutableCapitals) {
        println("${entries.key} : ${entries.value}")
    }

    for ((country, capital) in capitals) {
        println("$country: $capital")
    }

    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

    val myMap = mapOf<String, Int>()
    val myLovingMap = mapOf(1 to "a", 2 to "b")
    val myFavoriteMap = mutableMapOf(1 to "a")

    myFavoriteMap[34] = "asdf"

    println(myFavoriteMap[1])
    println(myFavoriteMap[5])

    myFavoriteMap.remove(34)

    for (entries in myLovingMap) {
        println("${entries.key} : ${entries.value}")
    }
    for ((key, value) in myLovingMap) {
        println("$key : $value")
    }

    val myNewMap: Map<String, List<Int>> = mapOf("St" to listOf(1, 2, 3))

    val myWorkMap = mapOf<String, List<String>>()
    val mapYear = mapOf<String, MutableMap<String, String>>()
    val mutableInventoryMap = mapOf<String, MutableSet<String>>()
}

fun searchKey(myMap: Map<String, String>, word: String): String {
    for ((key, value) in myMap) {
        if (value == word) return key
    }
    return "NO"
}