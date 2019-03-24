package com.example.lets_travel.ui.splash_screen_activy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.example.lets_travel.R
import com.example.lets_travel.ui.MainActivity

class SplastScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },SPLASH_TIME_OUT)
    }
}