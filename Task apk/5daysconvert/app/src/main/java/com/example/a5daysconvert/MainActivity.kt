package com.example.a5daysconvert

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

        var edinput=findViewById<EditText>(R.id.edinput_days)
        var ansyears=findViewById<TextView>(R.id.tv_ans_years)
        var ansmonths=findViewById<TextView>(R.id.tv_ans_months)
        var btconvert=findViewById<AppCompatButton>(R.id.btn_convert)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)

        btconvert.setOnClickListener{
            Toast.makeText(MainActivity@this, "Calculating...", Toast.LENGTH_SHORT).show()

            val input=edinput.text.toString().toInt()

            var year=input/365
            var month=input/30

            ansyears.setText("$year Year")
            ansmonths.setText("$month Month")

        }

        reset.setOnClickListener{
            edinput.text.clear()
            ansyears.setText(" ")
            ansmonths.setText(" ")
        }


    }
}