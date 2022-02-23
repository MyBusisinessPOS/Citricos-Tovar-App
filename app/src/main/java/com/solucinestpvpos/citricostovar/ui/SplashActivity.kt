package com.solucinestpvpos.citricostovar.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.solucinestpvpos.citricostovar.R
import com.solucinestpvpos.citricostovar.interfaces.Constants

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        goToMainScreen();

    }

    private fun goToMainScreen() {
        Handler().postDelayed(object: Runnable {
            override fun run() {
                startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            }
        }, Constants.SPLASH_SCREEN_TIMEOUT.toLong())

    }
}