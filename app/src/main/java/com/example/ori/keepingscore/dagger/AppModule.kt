package com.example.ori.keepingscore.dagger

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(var myApplication: Application) {

//    @Provides
//    @Singleton
//    fun provideApplication(): Application = myApplication

    @Provides
    @Singleton
    fun provideApplication(): Application{
        return myApplication
    }
}