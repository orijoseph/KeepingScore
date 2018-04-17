package com.example.ori.keepingscore.sections.splash

import com.example.ori.keepingscore.dagger.scopes.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class SplashModule(val view: ISplashContract.View) {

    @Provides
    @ActivityScope
    fun providePresenter(): SplashPresenter {
        return SplashPresenter(view)
    }
}