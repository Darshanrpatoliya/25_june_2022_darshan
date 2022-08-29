package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv=findViewById<TextView>(R.id.tv_one)

        tv.setOnClickListener{
            Toast.makeText(MainActivity@this, "Textview on click", Toast.LENGTH_SHORT).show()
        }

        var btn=findViewById<AppCompatButton>(R.id.btn)

        btn.setOnClickListener{
            Toast.makeText(MainActivity@this, "button click", Toast.LENGTH_SHORT).show()
        }
    }
}