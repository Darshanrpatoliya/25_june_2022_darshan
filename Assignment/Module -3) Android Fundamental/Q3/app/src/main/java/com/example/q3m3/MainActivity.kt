package com.example.q3m3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnext=findViewById<AppCompatButton>(R.id.btn_next)

        btnext.setOnClickListener {
            var i=Intent(MainActivity@this,NextActivity2::class.java)
            startActivity(i)
        }

    }
}