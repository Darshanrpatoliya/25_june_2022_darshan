package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edname=findViewById<EditText>(R.id.edname)
        var sub=findViewById<AppCompatButton>(R.id.btn_sub)

        sub.setOnClickListener {
            var i=Intent(MainActivity@this,IntentActivity2::class.java)
            i.putExtra("keyname",edname.text.toString())
            startActivity(i)
        }
    }
}