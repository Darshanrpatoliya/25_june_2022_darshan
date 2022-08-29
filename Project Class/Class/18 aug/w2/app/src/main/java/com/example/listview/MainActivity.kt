package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lv=findViewById<ListView>(R.id.lv_data)

        lv.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(MainActivity@this, ""+lv.getItemAtPosition(i), Toast.LENGTH_SHORT).show()
        }
    }
}