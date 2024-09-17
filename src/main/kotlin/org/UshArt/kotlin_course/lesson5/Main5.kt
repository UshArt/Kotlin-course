package org.UshArt.kotlin_course.lesson5

//fun main() {
////    val sum = 5 + 3
////    val diff = 10 - 3
////    val product = 10 * 5
////    val quotient = 10 / 5
////    val remainder = 10 % 5
////    val remainder1 = 10 % 6
////    val remainder2 = 10 % 4
////    val isEqual = (5 == 5)
////    val isNotEqual = (5!= 5)
////    val isGreater = (5 > 3)
////    val isLesser = (5 < 3)
////    val isGreaterOrEqual = (5 >= 5)
////    val isLesserOrEqual = (5 <= 3)
////    val andResult = false && false
////    val orResult = true || false
////    val notResult = !(5 > 3)
////    var number = 5
////    number += 3
////    number -= 2
////
////    ++number
////
////    val example = ((8+1) >= 9) || (6 - 2 != 4) && (2 * 3 == 6)
////    val primer = (3 + 2 < 6) && (4 * 2 == 8)
////    ((var a = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4)
////    (var b = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5)
////    (var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5))
////
////    var name: String? = null
////
////    val  result = name ?: "Unknown"
//
//    printVolume()
//
//}

//fun printVolume(userVolume: Int?) {
//    val defaultVolume = 30
//    println(userVolume ?: defaultVolume)
//}


fun  main(){
    printBoxStuff(stuff = "RUS")
    printBoxStuff(stuff = null)
}

fun printPrice(price: Double, sale: Int?){
    val koef = (100 - (sale ?: 0))/100.0
    println(price * koef)
}

fun printSiteLang(lang: String?){
    val defaultLang: String = "Eng"
    println(lang ?: defaultLang)
}

fun printBoxStuff(stuff: String?){
    println(stuff ?: throw Exception("Box is empty"))
}