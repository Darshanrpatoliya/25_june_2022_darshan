package com.example.putdataintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity()
{
    lateinit var edname:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edname=findViewById(R.id.edname)
        var btsub=findViewById<AppCompatButton>(R.id.btn_sub)

        btsub.setOnClickListener {
            var i=Intent(MainActivity@this,IntentActivity2::class.java)
            i.putExtra("keyname",edname.text.toString())
            startActivity(i)
        }

    }
}