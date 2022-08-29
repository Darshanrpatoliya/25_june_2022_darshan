package com.example.pradioandcheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        var edname=findViewById<EditText>(R.id.edname)
        var subname=findViewById<AppCompatButton>(R.id.btn_namesub)

        subname.setOnClickListener {
            var name=edname.text.toString()

            Log.d("mydata","name= "+name)
            Toast.makeText(this, "Welcome $name", Toast.LENGTH_SHORT).show()

        }

        var next=findViewById<FloatingActionButton>(R.id.btn_next)
        next.setOnClickListener {
            var i=Intent(this,ThirdActivity3::class.java)
            startActivity(i)
        }
    }
}