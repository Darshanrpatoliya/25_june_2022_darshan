package com.example.a6interest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edinprincipal=findViewById<EditText>(R.id.edinput_principal)
        var edintime=findViewById<EditText>(R.id.edinput_time)
        var ans=findViewById<TextView>(R.id.tv_ans_si)
        var btfind=findViewById<AppCompatButton>(R.id.btn_find)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)

        btfind.setOnClickListener{

            Toast.makeText(MainActivity@this, "calculating...", Toast.LENGTH_SHORT).show()

            val principal=edinprincipal.text.toString().toInt()
            val time=edintime.text.toString().toInt()

            var cal:Double=principal*5.6/100*time

            ans.setText("Simple Interest = $cal")
        }

        reset.setOnClickListener {
            edinprincipal.text.clear()
            edintime.text.clear()
            ans.setText("")
        }
    }
}