package com.example.a2prime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputprime=findViewById<EditText>(R.id.edinput_prime)
        var ans=findViewById<TextView>(R.id.tv_ans)
        var btcheck=findViewById<AppCompatButton>(R.id.btn_prime)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)

        reset.setOnClickListener{
            inputprime.text.clear()
        }

        btcheck.setOnClickListener{
            val input=inputprime.text.toString().toInt()
            ans.setBackgroundColor(resources.getColor(R.color.ansbg))

            var flag=false

            for (i in 2..input/2)
            {
                if (input%2==0)
                {
                    flag=true
                    break
                }
            }

            if (flag==false)
            {
                ans.setText("$input is prime number")
            }
            else
            {
                ans.setText("$input is NOT prime number")
            }
        }
    }
}