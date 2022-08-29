package com.example.pradioandcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ThirdActivity3 : AppCompatActivity()
{
    lateinit var gender:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third3)

        var radiogroup=findViewById<RadioGroup>(R.id.rg)
        var btgender=findViewById<AppCompatButton>(R.id.btn_gender)
//
        radiogroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            if (i==R.id.chk_male)
            {
                gender="Male"
            }
            if (i==R.id.chk_female)
            {
                gender="Female"
            }
        })

        btgender.setOnClickListener {
            Toast.makeText(this, "$gender", Toast.LENGTH_SHORT).show()
            Log.d("mydata","Gender= $gender")
        }

//        var btnext2=findViewById<FloatingActionButton>(R.id.btn_next2)



    }
}