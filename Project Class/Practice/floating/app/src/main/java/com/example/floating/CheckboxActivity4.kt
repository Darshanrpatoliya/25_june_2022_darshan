package com.example.floating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.CompoundButton

class CheckboxActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox4)

        var play=findViewById<CheckBox>(R.id.chk_play)
        var read=findViewById<CheckBox>(R.id.chk_read)
        var dance=findViewById<CheckBox>(R.id.chk_dance)

        play.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b)
            {
                Log.d("mydata","Play")
            }
            else
            {
                Log.d("mydata","uncheck Play")
            }
        })

        read.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b)
            {
                Log.d("mydata","Read")
            }
            else
            {
                Log.d("mydata","uncheck Read")
            }
        })

        dance.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b)
            {
                Log.d("mydata","Dance")
            }
            else
            {
                Log.d("mydata","uncheck Dance")
            }
        })

    }
}