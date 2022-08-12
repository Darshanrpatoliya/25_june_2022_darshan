package com.example.fac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.core.text.toHtml

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edfac=findViewById<EditText>(R.id.edfac)
        var ans=findViewById<TextView>(R.id.tv_ans)
        var btfind=findViewById<AppCompatButton>(R.id.find_fac)
        var reset=findViewById<AppCompatButton>(R.id.btn_reset)


        btfind.setOnClickListener{

            Toast.makeText(MainActivity@this, "calculating factotial", Toast.LENGTH_SHORT).show()

            val input=edfac.text.toString().toInt()
            var ansfact:Long=1

            for (i in 1..input)
            {
                ansfact*=i.toLong()
            }

            ans.setText("Result = $ansfact")
        }





        reset.setOnClickListener{
            edfac.text.clear()
        }


    }
}