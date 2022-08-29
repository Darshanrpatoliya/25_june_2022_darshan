package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv1=findViewById<TextView>(R.id.textwc)
        tv1.setOnClickListener{
            Toast.makeText(MainActivity@this, "welcome", Toast.LENGTH_SHORT).show()
        }

        var btn=findViewById<AppCompatButton>(R.id.btn_update)
        btn.setOnClickListener{
            Toast.makeText(MainActivity@this, "Updates is Soon", Toast.LENGTH_SHORT).show()
        }

        var btn2=findViewById<AppCompatButton>(R.id.btn_reminder)
        btn2.setOnClickListener{
            Toast.makeText(MainActivity@this, "Set New Reminder", Toast.LENGTH_SHORT).show()
        }

        var btn3=findViewById<AppCompatButton>(R.id.btn_assignment)
        btn3.setOnClickListener{
            Toast.makeText(MainActivity@this, "Upload Assignment", Toast.LENGTH_SHORT).show()
        }
        var btn4=findViewById<AppCompatButton>(R.id.btn_job)
        btn4.setOnClickListener{
            Toast.makeText(MainActivity@this, "Job is Redy", Toast.LENGTH_SHORT).show()
        }

        var btn5=findViewById<AppCompatButton>(R.id.btn_login)
        btn5.setOnClickListener{
            Toast.makeText(MainActivity@this, "Log in soon", Toast.LENGTH_SHORT).show()
        }

        var btn6=findViewById<AppCompatButton>(R.id.btn_signup)
        btn6.setOnClickListener{
            Toast.makeText(MainActivity@this, "Sign up very soon", Toast.LENGTH_SHORT).show()
        }

        var cpy=findViewById<TextView>(R.id.copyright)
        cpy.setOnClickListener{
            Toast.makeText(MainActivity@this, "2022 copyright claim", Toast.LENGTH_SHORT).show()
        }
    }
}