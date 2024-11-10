package org.UshArt.kotlin_course.Lesson20.HomeWork

abstract class TemperatureControlledOpeningDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {

    override var maxTemperature: Int = 100
    private var minTemperature: Int = -20
    private var currentTemperature: Int = -18
    private var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (temp in minTemperature..maxTemperature) {
            currentTemperature = temp
            println("Температура установлена в $currentTemperature°C")
        } else {
            println("Превышение температурного порога. Температура должна быть между $minTemperature и $maxTemperature°C")
        }
    }

    override fun open() {
        isOpen = true
        println("Девайс открыт")
    }

    override fun close() {
        isOpen = false
        println("Девайс закрыт")
    }
}