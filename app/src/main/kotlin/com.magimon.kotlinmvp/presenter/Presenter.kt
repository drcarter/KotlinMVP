package com.magimon.kotlinmvp.presenter

import com.magimon.kotlinmvp.view.MVPView

abstract class Presenter<V : MVPView> : ViewListener {

    var view: V? = null
        protected set

    fun bindView(view: V) {
        if (this.view !== view) {
            if (this.view != null) {
                unbindView(this.view!!)
            }
            this.view = view
        }
    }

    fun unbindView(view: V) {
        if (view === this.view) {
            this.view = null
        }
    }

    protected fun hasView(): Boolean {
        return view != null
    }
}
