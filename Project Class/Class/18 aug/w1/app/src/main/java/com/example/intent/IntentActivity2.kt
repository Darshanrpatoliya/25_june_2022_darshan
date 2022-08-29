package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentActivity2 : AppCompatActivity()
{
    lateinit var name:String

    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        var tv=findViewById<TextView>(R.id.tv)

        name=intent.getStringExtra("keyname")!!

        tv.setText(name)

    }
}