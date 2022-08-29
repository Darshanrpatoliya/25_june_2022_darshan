package com.example.spinner2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class DynamicActivity3 : AppCompatActivity()
{
    lateinit var eddata:EditText
    lateinit var btsave:AppCompatButton
    lateinit var lv:ListView
    var arrayList:ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic3)

        eddata=findViewById(R.id.ed_data)
        btsave=findViewById(R.id.btn_save)
        lv=findViewById(R.id.lv_data)

        var btnext=findViewById<AppCompatButton>(R.id.btn_next)
        btnext.setOnClickListener {
            var i= Intent(MainActivity@this,AlertDialogActivity4::class.java)
            startActivity(i)
        }

        var arrayAdapter=ArrayAdapter(DynamicActivity3@this,android.R.layout.simple_list_item_1,arrayList)
        lv.adapter=arrayAdapter


        btsave.setOnClickListener {

            arrayList.add(eddata.text.toString())
            var arrayAdapter=ArrayAdapter(DynamicActivity3@this,android.R.layout.simple_list_item_1,arrayList)
            lv.adapter=arrayAdapter
            eddata.text.clear()
        }

        lv.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this, "Long Pressed", Toast.LENGTH_SHORT).show()
            true
        }

    }
}