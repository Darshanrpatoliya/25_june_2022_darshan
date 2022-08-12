package com.example.a4calender

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

        var edinput=findViewById<EditText>(R.id.edinput_years)
        var months=findViewById<TextView>(R.id.tv_ans_moths)
        var days=findViewById<TextView>(R.id.tv_ans_days)
        var btconvert=findViewById<AppCompatButton>(R.id.btn_convert)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)

        btconvert.setOnClickListener{
            Toast.makeText(MainActivity@this, "Converting...", Toast.LENGTH_SHORT).show()

            val input=edinput.text.toString().toDouble()

            var ansmonth=input*12
            var ansday=input*365

            months.setText("$ansmonth Months")
            days.setText("$ansday Days")
        }

        reset.setOnClickListener{
            edinput.text.clear()
            months.setText(" ")
            days.setText(" ")
        }
    }
}