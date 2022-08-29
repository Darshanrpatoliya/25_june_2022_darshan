package com.example.pradioandcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton

class FourthActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth4)


        var th10=findViewById<CheckBox>(R.id.th10)
        var th12=findViewById<CheckBox>(R.id.th12)
        var bachelor=findViewById<CheckBox>(R.id.bachelor)

        th10.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->

        })

    }
}