package com.magimon.kotlinmvp.mvp.view

import android.os.Bundle

interface FragmentViewListener : ViewListener {

    fun onCreate()

    fun onCreateView()

    fun onActivityCreated(savedInstanceState: Bundle)

    fun onStart()

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroyView()

    fun onDestroy()
}