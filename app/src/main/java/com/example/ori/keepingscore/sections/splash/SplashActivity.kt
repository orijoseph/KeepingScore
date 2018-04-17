package com.example.ori.keepingscore.sections.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ori.keepingscore.MyApp
import com.example.ori.keepingscore.R
import com.example.ori.keepingscore.sections.register.RegisterActivity
import javax.inject.Inject

class SplashActivity : AppCompatActivity(), ISplashContract.View {


    @Inject
    lateinit var mPresenter:SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        (application as MyApp).getAppComponent().newSplashComponent(SplashModule(this)).inject(this)

        mPresenter.start()

//        var intent = Intent(this, RegisterActivity::class.java)
//        startActivity(intent)
    }

    override fun sayHi() {

    }
}
