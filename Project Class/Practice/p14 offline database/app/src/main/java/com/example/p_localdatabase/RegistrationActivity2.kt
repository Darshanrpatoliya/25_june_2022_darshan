package com.example.p_localdatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class RegistrationActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration2)

        var edname=findViewById<EditText>(R.id.ed_name)
        var edemail=findViewById<EditText>(R.id.ed_email)
        var edpass=findViewById<EditText>(R.id.ed_pass)
        var btsave=findViewById<AppCompatButton>(R.id.btn_save)

        var id:Int
        var mydatabse=MyDatabase(this)

        btsave.setOnClickListener {
            var insertId=mydatabse.insertData(MyModel(it.id!!,edname.text.toString(),edemail.text.toString(),edpass.text.toString()))

            if (insertId>0)
            {
                Toast.makeText(this, "Succesfully saved", Toast.LENGTH_SHORT).show()
                Log.d("mydata","$edname")

                var i1=Intent(this,MainActivity::class.java)
                startActivity(i1)
            }
        }

    }
}