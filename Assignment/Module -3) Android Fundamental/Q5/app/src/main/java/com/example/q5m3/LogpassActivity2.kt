package com.example.q5m3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LogpassActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logpass2)

        var tvname=findViewById<TextView>(R.id.tv_email)

        var catchemail:String

        catchemail=intent.getStringExtra("putemail")!!

        tvname.setText("$catchemail")
    }
}