package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bt1=findViewById<AppCompatButton>(R.id.btn1)
        var click=true


        bt1.setOnClickListener{
            if(click)
            {
                bt1.setBackgroundColor(resources.getColor(R.color.red))
                click=false
            }
            else
            {
                bt1.setBackgroundColor(resources.getColor(R.color.white))
                click=true
            }
        }


        var bt2=findViewById<AppCompatButton>(R.id.btn2)
        bt2.setOnClickListener{

            if(click)
            {
                bt2.setBackgroundColor(resources.getColor(R.color.green))
                click=false
            }
            else
            {
                bt2.setBackgroundColor(resources.getColor(R.color.white))
                click=true
            }
        }

        var bt3=findViewById<AppCompatButton>(R.id.btn3)
        bt3.setOnClickListener{

            if(click)
            {
                bt3.setBackgroundColor(resources.getColor(R.color.purple_700))
                click=false
            }
            else
            {
                bt3.setBackgroundColor(resources.getColor(R.color.white))
                click=true
            }
        }
    }

}