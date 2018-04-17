package com.example.ori.keepingscore.dagger

import android.app.Application
import com.example.ori.keepingscore.MyApp
import com.example.ori.keepingscore.sections.splash.SplashActivityComponent
import com.example.ori.keepingscore.sections.splash.SplashModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class), (FireBaseModule::class)])
interface AppComponent {

    fun newSplashComponent(splashModule: SplashModule): SplashActivityComponent
}