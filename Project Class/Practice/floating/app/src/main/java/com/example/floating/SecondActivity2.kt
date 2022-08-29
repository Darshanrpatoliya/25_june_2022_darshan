package com.example.floating

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class SecondActivity2 : AppCompatActivity()
{
    lateinit var gender:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        var radiogroup=findViewById<RadioGroup>(R.id.rg)
        var btsub=findViewById<AppCompatButton>(R.id.btn_submit)

        radiogroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radiogroup, i ->
            if (i==R.id.rb_male)
            {
                gender="Male"
            }
            if (i==R.id.rb_female)
            {
                gender="Female"
            }
        })

        btsub.setOnClickListener {
            Toast.makeText(this, "Gender= "+gender, Toast.LENGTH_SHORT).show()
            var intent= Intent(this,CheckboxActivity4::class.java)
            startActivity(intent)
        }




    }
}