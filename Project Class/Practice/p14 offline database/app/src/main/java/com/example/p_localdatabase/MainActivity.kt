package com.example.p_localdatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btreg=findViewById<TextView>(R.id.btn_reg)
        var btguest=findViewById<TextView>(R.id.btn_guest)

        btreg.setOnClickListener {
            var i1=Intent(MainActivity@this,RegistrationActivity2::class.java)
            startActivity(i1)
        }

        btguest.setOnClickListener {
            var i2=Intent(MainActivity@this,GuestActivity3::class.java)
            startActivity(i2)
        }
    }
}