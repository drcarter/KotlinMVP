package com.magimon.kotlinmvp.ui.main.view

import com.magimon.kotlinmvp.mvp.view.MVPView

interface MainView : MVPView {
    fun onUpdateSpeed(speed: Int)
}
