package com.example.menup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.widget.AppCompatButton

class DynamicActivity2 : AppCompatActivity() {

    lateinit var eddata: EditText
    lateinit var btsave: AppCompatButton
    lateinit var lv: ListView
    var arrayList:ArrayList<String> =ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic2)

        eddata=findViewById(R.id.ed_data)
        btsave=findViewById(R.id.btn_save)
        lv=findViewById(R.id.lv_data)



        btsave.setOnClickListener {

            arrayList.add(eddata.text.toString())

            var arrayAdapter=ArrayAdapter(DynamicActivity2@this,android.R.layout.simple_list_item_1,arrayList)

            lv.adapter=arrayAdapter

            eddata.text.clear()
        }



    }
}