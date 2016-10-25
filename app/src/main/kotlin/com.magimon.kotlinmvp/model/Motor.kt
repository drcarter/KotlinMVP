package com.magimon.kotlinmvp.model

class Motor {

    var rpm: Int = 0
        private set

    init {
        this.rpm = 0
    }

    fun accelerate(value: Int) {
        rpm = rpm + value
    }

    fun setSpeed(value: Int) {
        rpm = value
    }

    fun brake() {
        rpm = 0
    }
}
