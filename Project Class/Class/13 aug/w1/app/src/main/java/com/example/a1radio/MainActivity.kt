package com.example.a1radio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var fab:FloatingActionButton
    lateinit var tv_count:TextView
    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab=findViewById(R.id.fab)
        tv_count=findViewById(R.id.tv_count)

        fab.setOnClickListener {
            addcount()

            var intent=Intent(MainActivity@this,GrediantActivity::class.java)
            startActivity(intent)
        }
    }

    fun addcount()
    {
        count+=1
        tv_count.setText(count.toString())

    }
}