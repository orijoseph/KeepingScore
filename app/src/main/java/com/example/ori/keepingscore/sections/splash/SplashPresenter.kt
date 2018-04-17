package com.example.ori.keepingscore.sections.splash

class SplashPresenter(val mView: ISplashContract.View) : ISplashContract.Presenter {
    override fun start() {
        mView.sayHi()
    }

}