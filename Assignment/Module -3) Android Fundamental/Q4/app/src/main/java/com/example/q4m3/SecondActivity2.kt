package com.example.q4m3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        var tvfname=findViewById<TextView>(R.id.tv_fname)
        var tvlname=findViewById<TextView>(R.id.tv_lname)

        var tvoutfname:String
        var tvoutlname:String

        tvoutfname=intent.getStringExtra("fname")!!
        tvoutlname=intent.getStringExtra("lname")!!

        tvfname.setText("$tvoutfname")
        tvlname.setText("$tvoutlname")

    }
}