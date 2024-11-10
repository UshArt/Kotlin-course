package org.UshArt.kotlin_course.Lesson15.HomeWork

/*
Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”,
“место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод, который
выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.
 */

class Concert(
    val band: String,
    val location: String,
    val ticketPrice: Double,
    val capacity: Int,
) {
    private var soldTickets: Int = 0
    fun info(){
        println("Концерт группы '$band' состоится по адресу: $location. Цена билета - $ticketPrice эскудо. Вместимость " +
                "зала $capacity. Уже продано $soldTickets билетов")
    }

    fun buyTicket() {
        if(soldTickets < capacity ) {
            soldTickets++
        } else {
            println("Мест нет!")
        }
    }
}