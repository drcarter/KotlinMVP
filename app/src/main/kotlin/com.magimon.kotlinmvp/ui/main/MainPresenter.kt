package com.magimon.kotlinmvp.ui.main

import com.magimon.kotlinmvp.mvp.presenter.ActivityPresenter
import com.magimon.kotlinmvp.ui.main.view.MainView

abstract class MainPresenter : ActivityPresenter<MainView>() {

    abstract fun requestIncreaseSpeed()

    abstract fun requestStop()
}