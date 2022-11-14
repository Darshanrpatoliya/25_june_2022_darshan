package com.example.p11fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btclick=findViewById<AppCompatButton>(R.id.btn_click)

        btclick.setOnClickListener {

            val transecion=supportFragmentManager.beginTransaction()
            transecion.replace(R.id.new_frag,NewFragment())
            transecion.addToBackStack(null)
            transecion.commit()
        }
    }
}