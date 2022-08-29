package com.example.q4m3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edfname=findViewById<EditText>(R.id.ed_fname)
        var edlname=findViewById<EditText>(R.id.ed_lname)
        var btsub=findViewById<AppCompatButton>(R.id.btn_sub)
        var btreset=findViewById<AppCompatButton>(R.id.btn_reset)

        var infname:String
        var inlname:String

        btsub.setOnClickListener {
            infname=edfname.text.toString()
            inlname=edlname.text.toString()

            var i=Intent(MainActivity@this,SecondActivity2::class.java)
            i.putExtra("fname",infname)
            i.putExtra("lname",inlname)
            startActivity(i)

        }
        btreset.setOnClickListener {
            edfname.text.clear()
            edlname.text.clear()
        }

    }
}