package com.example.ori.keepingscore.sections.splash

import com.example.ori.keepingscore.dagger.scopes.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [(SplashModule::class)])
interface SplashActivityComponent {

    fun inject(splashActivity: SplashActivity)
}