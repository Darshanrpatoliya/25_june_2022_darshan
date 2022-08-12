package com.example.a7circlearea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edinradius=findViewById<EditText>(R.id.edinput_radius)
        var ans=findViewById<TextView>(R.id.tv_ans_area)
        var btfind=findViewById<AppCompatButton>(R.id.btn_find)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)

        btfind.setOnClickListener {

            val input=edinradius.text.toString().toDouble()

            var cal=input*input*3.14

            ans.setText("Area Of Circle = $cal cm")

            reset.setOnClickListener {
                edinradius.text.clear()
                ans.setText("")
            }
        }
    }
}