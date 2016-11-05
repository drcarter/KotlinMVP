package com.magimon.kotlinmvp.ui.main

import com.magimon.kotlinmvp.R
import com.magimon.kotlinmvp.base.BaseActivity
import com.magimon.kotlinmvp.mvp.presenter.Presenter
import com.magimon.kotlinmvp.ui.main.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainView {

    private var presenter: MainPresenter? = null

    override val contentViewResource: Int
        get() = R.layout.activity_main

    override fun onInit() {
        presenter = MainPresenterImpl()
        presenter!!.bindView(this)

        button_increase_speed.setOnClickListener {
            presenter?.requestIncreaseSpeed()
        }

        button_stop.setOnClickListener {
            presenter?.requestStop()
        }
    }

    override fun getViewListener(): Presenter {
        return presenter!!
    }

    override fun onUpdateSpeed(speed: Int) {
        text_result_speed.text = "speed : " + speed
    }
}
