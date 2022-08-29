package com.example.q2m3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainbg=findViewById<LinearLayout>(R.id.main_bg)

        var btred=findViewById<AppCompatButton>(R.id.btn_red)
        var btblue=findViewById<AppCompatButton>(R.id.btn_blue)
        var btgreen=findViewById<AppCompatButton>(R.id.btn_green)

        var status=true

        btred.setOnClickListener {
            if (status)
            {
                mainbg.setBackgroundColor(resources.getColor(R.color.red))
                status=false
            }
            else
            {
                mainbg.setBackgroundColor(resources.getColor(R.color.white))
                status=true
            }
        }

        btblue.setOnClickListener {
            if (status)
            {
                mainbg.setBackgroundColor(resources.getColor(R.color.blue))
                status=false
            }
            else
            {
                mainbg.setBackgroundColor(resources.getColor(R.color.white))
                status=true
            }
        }

        btgreen.setOnClickListener {
            if (status)
            {
                mainbg.setBackgroundColor(resources.getColor(R.color.green))
                status=false
            }
            else
            {
                mainbg.setBackgroundColor(resources.getColor(R.color.white))
                status=true
            }
        }

    }
}