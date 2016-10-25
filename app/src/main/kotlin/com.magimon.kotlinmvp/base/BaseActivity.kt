package com.magimon.kotlinmvp.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.magimon.kotlinmvp.presenter.Presenter
import com.magimon.kotlinmvp.presenter.ViewListener

abstract class BaseActivity : AppCompatActivity() {

    protected abstract val contentViewResource: Int

    protected abstract fun onInit()

    protected abstract fun getViewListener(): Presenter<*>?

    protected var viewListener: ViewListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(contentViewResource)
        onInit()

        this.viewListener = getViewListener()

        if (this.viewListener != null) {
            this.viewListener!!.onCreate()
        }
    }

    override fun onResume() {
        super.onResume()

        if (this.viewListener != null) {
            this.viewListener!!.onResume()
        }
    }

    override fun onPause() {
        super.onPause()

        if (this.viewListener != null) {
            this.viewListener!!.onPause()
        }
    }

    override fun onStop() {
        super.onStop()

        if (this.viewListener != null) {
            this.viewListener!!.onStop()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        if (this.viewListener != null) {
            this.viewListener!!.onDestroy()
        }
    }
}
