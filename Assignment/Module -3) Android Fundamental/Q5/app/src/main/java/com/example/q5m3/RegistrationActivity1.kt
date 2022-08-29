package com.example.q5m3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.widget.AppCompatButton

class RegistrationActivity1 : AppCompatActivity()
{
    lateinit var inedfname:String
    lateinit var inedlname:String
    lateinit var selectgender:String
    lateinit var inedremail:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration1)

        var edfname=findViewById<EditText>(R.id.ed_fname)
        var edlname=findViewById<EditText>(R.id.ed_lname)
        var edremail=findViewById<EditText>(R.id.edr_email)
        var rggender=findViewById<RadioGroup>(R.id.rg_gender)
        var btrsub=findViewById<AppCompatButton>(R.id.btnr_sub)
        var btreset=findViewById<AppCompatButton>(R.id.btnr_reset)


        
        rggender.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            if (checkedId==R.id.rb_male)
            {
                selectgender="Male"
            }
            if (checkedId==R.id.rb_female)
            {
                selectgender="Female"
            }
        })


        btrsub.setOnClickListener {
            inedfname=edfname.text.toString()
            inedlname=edlname.text.toString()
            inedremail=edremail.text.toString()

            var ir2=Intent(RegistrationActivity1@this,RegPassActivity2::class.java)
            ir2.putExtra("fnameput",inedfname)
            ir2.putExtra("lnameput",inedlname)
            ir2.putExtra("edremailput",inedremail)
            ir2.putExtra("putgender",selectgender)
            startActivity(ir2)
        }

        btreset.setOnClickListener {
            edfname.text.clear()
            edlname.text.clear()
            edremail.text.clear()
        }

    }
}