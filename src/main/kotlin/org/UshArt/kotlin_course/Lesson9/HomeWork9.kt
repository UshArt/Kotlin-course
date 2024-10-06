package org.UshArt.kotlin_course.Lesson9

fun main() {
    val name = "Александр"
    val age = 31 // Укажите нужный возраст

    val birthdayMessage = createBirthdayMessage(name, age)
    println(birthdayMessage)
}

fun createBirthdayMessage(name: String, age: Int): String {
    return """
        Дорогой $name!
        
        Поздравляем тебя с Днем Рождения!
        Желаю тебе здоровья, счастья, удачи и исполнения всех твоих желаний!
        Вот и наступил твой $age-й год, пусть он будет полон ярких событий и приятных сюрпризов!
        
        С наилучшими пожеланиями,
        твой ученик)))!!!
    """.trimIndent()
}