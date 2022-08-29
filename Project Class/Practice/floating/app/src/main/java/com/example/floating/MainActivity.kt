package com.example.floating

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var plus:FloatingActionButton
    lateinit var min:FloatingActionButton
    lateinit var ans:TextView
    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus=findViewById(R.id.btn_add)
        min=findViewById(R.id.btn_min)
        ans=findViewById(R.id.tv_ans)

        var next=findViewById<FloatingActionButton>(R.id.btn_next)

        plus.setOnClickListener {
            addcount()
        }

        min.setOnClickListener {
            mincount()
        }

        next.setOnClickListener {
            var intent=Intent(MainActivity@this,SecondActivity2::class.java)
            startActivity(intent)
        }

    }


    fun addcount()
    {
        count+=1
        ans.setText("$count")
    }
    fun mincount()
    {

        if (count>0)
        {
            count-=1
            ans.setText("$count")
        }
    }

}