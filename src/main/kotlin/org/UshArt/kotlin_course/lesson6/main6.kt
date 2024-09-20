package org.UshArt.kotlin_course.lesson6

//fun main() {
//    if (условие) {
//
//    }
//}


fun main() {

}

fun checkPassword(password: String) : Boolean {
    if (password.length <= 8) return false
    return checkSymbols(password)
}

fun checkSymbols(password: String) : Boolean {
    return false
}

fun convertMark (mark: Int) : String {
    return when (mark) {
        in 0..20 -> "F"
        in 21..40 -> "E"
        in 41..60 -> "D"
        in 61..80 -> "C"
        in 81..90 -> "B"
        in 91..100 -> "A"
        else -> "invalid mark"
    }
}