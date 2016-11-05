package com.magimon.kotlinmvp.model

class Vehicle(private val motor: Motor) {

    val speed: Int
        get() = motor.rpm

    fun increaseSpeed(value: Int) {
        motor.accelerate(value)
    }

    fun stop() {
        motor.brake()
    }
}
