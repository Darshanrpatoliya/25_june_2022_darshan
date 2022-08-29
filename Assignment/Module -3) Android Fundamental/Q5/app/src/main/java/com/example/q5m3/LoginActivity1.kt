package com.example.q5m3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class LoginActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        var edemail=findViewById<EditText>(R.id.ed_email)
        var edpass=findViewById<EditText>(R.id.ed_pass)
        var btsub=findViewById<AppCompatButton>(R.id.btn_sub)
        var btreset=findViewById<AppCompatButton>(R.id.btn_reset)

        var inemail:String
        var inpass:String

        btsub.setOnClickListener {
            inemail=edemail.text.toString()
            inpass=edpass.text.toString()

            Toast.makeText(this, "$inemail", Toast.LENGTH_SHORT).show()

            var i2=Intent(LoginActivity1@this,LogpassActivity2::class.java)
            i2.putExtra("putemail",inemail)
            startActivity(i2)

            Log.d("mydata","Username : "+edemail.text.toString())
            Log.d("mydata","password : $inpass")
        }

        btreset.setOnClickListener {
            edemail.text.clear()
            edpass.text.clear()
        }

    }
}