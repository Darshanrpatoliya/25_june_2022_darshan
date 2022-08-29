package com.example.putdataintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class IntentActivity2 : AppCompatActivity()
{
    lateinit var tvname:TextView
    lateinit var name:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        tvname=findViewById(R.id.tv_name)

        name=intent.getStringExtra("keyname")!!

        tvname.setText("$name")

        var lv=findViewById<ListView>(R.id.lv_city)

        lv.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "${lv.getItemAtPosition(i)}", Toast.LENGTH_SHORT).show()

        }

    }
}