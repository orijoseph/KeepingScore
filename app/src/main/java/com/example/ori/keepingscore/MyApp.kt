package com.example.ori.keepingscore

import android.app.Application
import com.example.ori.keepingscore.dagger.AppComponent
import com.example.ori.keepingscore.dagger.AppModule
import com.example.ori.keepingscore.dagger.DaggerAppComponent

class MyApp: Application() {

    private lateinit var myAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        myAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    fun getAppComponent(): AppComponent {
        return myAppComponent
    }
}