package com.magimon.kotlinmvp.mvp.view

import android.os.Bundle
import com.magimon.kotlinmvp.mvp.presenter.ViewListener

interface ActivityViewListener : ViewListener {

    fun onCreate(savedInstanceState: Bundle?)

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroy()
}