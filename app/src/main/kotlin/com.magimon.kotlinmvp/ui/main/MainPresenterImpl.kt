package com.magimon.kotlinmvp.ui.main

import android.os.Bundle
import com.magimon.kotlinmvp.model.Motor
import com.magimon.kotlinmvp.model.Vehicle

class MainPresenterImpl : MainPresenter() {

    private val vehicle: Vehicle

    init {
        this.vehicle = Vehicle(Motor())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }

    override fun onDestroy() {
    }

    override fun requestIncreaseSpeed() {
        this.vehicle.increaseSpeed(10)

        if (hasView()) {
            getView().onUpdateSpeed(this.vehicle.speed)
        }
    }

    override fun requestStop() {
        this.vehicle.stop()

        if (hasView()) {
            getView().onUpdateSpeed(this.vehicle.speed)
        }
    }
}
