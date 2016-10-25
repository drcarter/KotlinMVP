package com.magimon.kotlinmvp.presenter

import com.magimon.kotlinmvp.model.Motor
import com.magimon.kotlinmvp.model.Vehicle
import com.magimon.kotlinmvp.view.MainView

class MainPresenterImpl : Presenter<MainView>() {

    private val vehicle: Vehicle

    init {
        this.vehicle = Vehicle(Motor())
    }

    fun requestIncreaseSpeed() {
        this.vehicle.increaseSpeed(10)

        if (hasView()) {
            view?.onUpdateSpeed(this.vehicle.speed)
        }
    }

    fun requestStop() {
        this.vehicle.stop()

        if (hasView()) {
            view?.onUpdateSpeed(this.vehicle.speed)
        }
    }

    override fun onCreate() {

    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onStop() {

    }

    override fun onDestroy() {

    }
}
