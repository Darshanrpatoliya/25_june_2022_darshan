package com.example.q5m3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btlogin=findViewById<AppCompatButton>(R.id.btn_login)

        btlogin.setOnClickListener {
            var i1=Intent(MainActivity@this,LoginActivity1::class.java)
            startActivity(i1)
        }

        var btregistration=findViewById<AppCompatButton>(R.id.btn_registration)

        btregistration.setOnClickListener {
            var ir=Intent(MainActivity@this,RegistrationActivity1::class.java)
            startActivity(ir)
        }

    }

}