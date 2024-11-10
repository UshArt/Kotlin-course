package org.UshArt.kotlin_course.Lesson20.HomeWork

abstract class SwitchableDevice : Powerable {
    private var isOn = false
    override fun powerOn() {
        isOn = true
        println("Девайс включен")
    }

    override fun powerOff() {
        println("Девайс выключен")
        isOn = false
    }

    protected fun isPoweredOn(): Boolean {
        return isOn
    }
}