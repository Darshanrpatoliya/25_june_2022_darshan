package com.example.a3evenodd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edinput=findViewById<EditText>(R.id.edinput_eoro)
        var ans=findViewById<TextView>(R.id.tv_ans)
        var btcheck=findViewById<AppCompatButton>(R.id.btn_evenorodd)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)


        btcheck.setOnClickListener{
            Toast.makeText(MainActivity@this, "Checking Even Or Odd", Toast.LENGTH_SHORT).show()
            val input=edinput.text.toString().toInt()

            if (input%2==0)
            {
                ans.setText("$input is Even number")
            }
            else
            {
                ans.setText("$input is Odd number")
            }
        }


        reset.setOnClickListener{
            ans.setText(" ")
            edinput.text.clear()
        }

    }
}