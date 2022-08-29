package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainc=findViewById<LinearLayout>(R.id.maincon)
        var tv=findViewById<TextView>(R.id.tv_1)
        var bt1=findViewById<Button>(R.id.btn1)


        bt1.setOnClickListener{
            Toast.makeText(MainActivity@this, "Allredy Submited", Toast.LENGTH_SHORT).show()
            tv.setText("Welcome To Android")
            mainc.setBackgroundColor(resources.getColor(R.color.purple_700))
        }
    }
}