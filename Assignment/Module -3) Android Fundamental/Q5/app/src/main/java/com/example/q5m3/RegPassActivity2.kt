package com.example.q5m3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegPassActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_pass2)

        var tvrname=findViewById<TextView>(R.id.tvr_name)
        var catchtvrname:String
        catchtvrname=intent.getStringExtra("fnameput")!!
        tvrname.setText("Wellcome To Green Application Mr. $catchtvrname")

        var tvfullname=findViewById<TextView>(R.id.tvr_fullname)
        var catchtvrlname:String
        catchtvrlname=intent.getStringExtra("lnameput")!!
        tvfullname.setText("Name : $catchtvrname $catchtvrlname")

        var tvremail=findViewById<TextView>(R.id.tvr_email)
        var catchtvremail:String
        catchtvremail=intent.getStringExtra("edremailput")!!
        tvremail.setText("$catchtvremail")

        var tvrgender=findViewById<TextView>(R.id.tvr_gender)
        var catchgender=intent.getStringExtra("putgender")!!
        tvrgender.setText("$catchgender")
    }
}