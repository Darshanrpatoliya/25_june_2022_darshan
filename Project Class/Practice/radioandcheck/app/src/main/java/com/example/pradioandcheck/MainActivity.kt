package com.example.pradioandcheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email=findViewById<EditText>(R.id.edemail)
        var pass=findViewById<EditText>(R.id.edpass)
        var sub=findViewById<AppCompatButton>(R.id.btn_submit)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)

        sub.setOnClickListener {
            Log.d("mydata","Email= "+email.text.toString())
            Log.d("mydata","Password= "+pass.text.toString())

            var intent=Intent(MainActivity@this,SecondActivity2::class.java)
            startActivity(intent)
        }
        reset.setOnClickListener {
            email.text.clear()
            pass.text.clear()
        }
    }
}