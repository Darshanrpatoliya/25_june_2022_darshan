package com.example.p2_sharedpref

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class DashboardActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard2)

        var tvdisplay=findViewById<TextView>(R.id.tv_display)
        var btlogout=findViewById<AppCompatButton>(R.id.btn_logout)

        var myshared: SharedPreferences =this.getSharedPreferences("mypref_file", Context.MODE_PRIVATE)
        var editor: SharedPreferences.Editor=myshared.edit()

        tvdisplay.setText(myshared.getString("username","default"))

        btlogout.setOnClickListener {
            editor.putBoolean("status",false)
            editor.apply()
            editor.commit()

            var i=Intent(this,LoginActivity2::class.java)
            finish()
            startActivity(i)
        }
    }
}