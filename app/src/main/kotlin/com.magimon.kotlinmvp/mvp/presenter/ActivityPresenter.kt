package com.magimon.kotlinmvp.mvp.presenter

import com.magimon.kotlinmvp.mvp.view.ActivityViewListener
import com.magimon.kotlinmvp.mvp.view.MVPView

abstract class ActivityPresenter<V : MVPView> : Presenter, ActivityViewListener {

    private var view: V? = null

    fun bindView(view: V?) {

        if (view == null) {
            throw NullPointerException("Presenter V must be not null!!")
        }

        if (this.view !== view) {
            if (this.view != null) {
                unbindView(this.view)
            }
            this.view = view
        }
    }

    fun unbindView(view: V?) {

        if (view == null) {
            throw NullPointerException("Presenter V must be not null!!")
        }

        if (view === this.view) {
            this.view = null
        }
    }

    protected fun hasView(): Boolean {
        return view != null
    }

    fun getView(): V {
        return view as V
    }
}