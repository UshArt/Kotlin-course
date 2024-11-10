package org.UshArt.kotlin_course.Lesson15.Class

object Logger {  //  сразу создает готовый объект, к которому можно сразу обращаться. Это и объект и класс
    // одновременно. Существует только в одном экземпляре, в отличие от объектов созданных через Class

    fun log(message: String) {
        println("Log: $message")
    }
}