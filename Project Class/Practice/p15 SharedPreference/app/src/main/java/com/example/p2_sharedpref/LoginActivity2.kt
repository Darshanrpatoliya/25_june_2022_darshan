package com.example.p2_sharedpref

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        var edemail=findViewById<EditText>(R.id.ed_email_l)
        var edpass=findViewById<EditText>(R.id.ed_pass_l)
        var btlogin=findViewById<AppCompatButton>(R.id.btn_login)

        var myshared:SharedPreferences=this.getSharedPreferences("mypref_file", Context.MODE_PRIVATE)
        var editor:SharedPreferences.Editor=myshared.edit()

        if (myshared.getBoolean("status",false))
        {
            var i=Intent(this,DashboardActivity2::class.java)
            finish()
            startActivity(i)
        }

        btlogin.setOnClickListener {
            var email=myshared.getString("email","default")
            var pass=myshared.getString("pass","default")

            if (email.equals(edemail.text.toString()) && pass.equals(edpass.text.toString()))
            {
                editor.putBoolean("status",true)
                editor.apply()
                editor.commit()

                var i2=Intent(this,DashboardActivity2::class.java)
                finish()
                startActivity(i2)
            }
        }
    }
}