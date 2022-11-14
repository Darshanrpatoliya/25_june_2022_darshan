package com.example.dynamicapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var eddata=findViewById<EditText>(R.id.ed_data)
        var btsub=findViewById<AppCompatButton>(R.id.btn_submit)
        var lv=findViewById<ListView>(R.id.lv_output)

        btsub.setOnClickListener {
            var addlist:ArrayList<String> =ArrayList()

            addlist.add(eddata.text.toString())

            var arrayAdapter=ArrayAdapter(MainActivity@this,android.R.layout.simple_list_item_1,addlist)
            lv.adapter=arrayAdapter

            eddata.text.clear()

        }

    }
}