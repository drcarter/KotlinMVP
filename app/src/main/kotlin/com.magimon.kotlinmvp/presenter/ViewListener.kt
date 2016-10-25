package com.magimon.kotlinmvp.presenter

interface ViewListener {

    fun onCreate()

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroy()

}
