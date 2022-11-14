package com.example.p2_sharedpref

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edname=findViewById<EditText>(R.id.ed_name)
        var edemail=findViewById<EditText>(R.id.ed_email)
        var edpass=findViewById<EditText>(R.id.ed_pass)
        var btsignup=findViewById<AppCompatButton>(R.id.btn_reg)
        var btloginclick=findViewById<AppCompatButton>(R.id.btn_login_click)

        var myshared:SharedPreferences=this.getSharedPreferences("mypref_file",Context.MODE_PRIVATE)
        var editor:SharedPreferences.Editor=myshared.edit()

        btsignup.setOnClickListener {
            editor.putString("username",edname.text.toString())
            editor.putString("email",edemail.text.toString())
            editor.putString("pass",edpass.text.toString())

            editor.apply()
            editor.commit()

            var i=Intent(this,MainActivity::class.java)
            finish()
            startActivity(i)

            Toast.makeText(this, "Registration succesfully", Toast.LENGTH_SHORT).show()
        }

        btloginclick.setOnClickListener {
            var i=Intent(this,LoginActivity2::class.java)
            startActivity(i)
        }
    }
}