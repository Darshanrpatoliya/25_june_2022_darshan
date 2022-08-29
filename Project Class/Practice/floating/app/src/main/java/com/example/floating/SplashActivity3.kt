package com.example.floating

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class SplashActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash3)

        Handler(Looper.getMainLooper()).postDelayed({
            var i=Intent(this,SecondActivity2::class.java)
            finish()
            startActivity(i)
        },3000)
    }
}