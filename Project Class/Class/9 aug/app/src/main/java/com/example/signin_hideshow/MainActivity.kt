package com.example.signin_hideshow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edemail=findViewById<EditText>(R.id.edemail)
        var edpss=findViewById<EditText>(R.id.edpassword)
        var submit=findViewById<AppCompatButton>(R.id.btn_sub)
        var dis=findViewById<TextView>(R.id.tv_display)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)

        submit.setOnClickListener{
            Log.d("Mydata","Email= "+edemail.text.toString())
            Log.d("Mydata","Password= "+edpss.text.toString())

            dis.setText(edemail.text.toString())

            var i=Intent(MainActivity@this,SecondActivity2::class.java)
            startActivity(i)

        }

        reset.setOnClickListener{
            edemail.text.clear()
            edpss.text.clear()
        }

    }
}