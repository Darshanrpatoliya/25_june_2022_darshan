package com.example.a3clrr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv=findViewById<TextView>(R.id.tv_1)
        var bt1=findViewById<AppCompatButton>(R.id.btn_1)
        var bt2=findViewById<AppCompatButton>(R.id.btn_2)
        var bt3=findViewById<AppCompatButton>(R.id.btn_3)
        var click=true

        bt1.setOnClickListener{
            if (click)
            {
                bt1.setBackgroundColor(resources.getColor(R.color.red))
                bt1.setTextColor(resources.getColor(R.color.white))
                tv.setTextColor(resources.getColor(R.color.red))
                click=false
            }
            else
            {
                bt1.setBackgroundColor(resources.getColor(R.color.white))
                bt1.setTextColor(resources.getColor(R.color.red))
                tv.setTextColor(resources.getColor(R.color.black))
                click=true
            }
//
        }

        bt2.setOnClickListener{
            if (click)
            {
                bt2.setBackgroundColor(resources.getColor(R.color.green))
                bt2.setTextColor(resources.getColor(R.color.white))
                tv.setTextColor(resources.getColor(R.color.green))
                click=false
            }
            else
            {
                bt2.setBackgroundColor(resources.getColor(R.color.white))
                bt2.setTextColor(resources.getColor(R.color.green))
                tv.setTextColor(resources.getColor(R.color.black))
                click=true
            }
        }

        bt3.setOnClickListener{
            if (click)
            {
                bt3.setBackgroundColor(resources.getColor(R.color.blue))
                bt3.setTextColor(resources.getColor(R.color.white))
                tv.setTextColor(resources.getColor(R.color.blue))
                click=false
            }
            else
            {
                bt3.setBackgroundColor(resources.getColor(R.color.white))
                bt3.setTextColor(resources.getColor(R.color.blue))
                tv.setTextColor(resources.getColor(R.color.black))
                click=true
            }
        }

        var btadd=findViewById<AppCompatButton>(R.id.btn_plus)
        var btmin=findViewById<AppCompatButton>(R.id.btn_min)
        var bttotal=findViewById<TextView>(R.id.btn_total)
        var total:Int=0


        btadd.setOnClickListener{
//            btadd.setBackgroundColor(resources.getColor(R.color.teal_200))
            total+=1
            bttotal.setText("$total")
        }

        btmin.setOnClickListener{
//            btmin.setBackgroundColor(resources.getColor(R.color.teal_200))
            if (total>0)
            {
                total-=1
                bttotal.setText("$total")
            }
        }

    }
}