package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spdata=findViewById<Spinner>(R.id.sp_city)

        spdata.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Log.d("mydata","Selected "+spdata.getItemAtPosition(p2))
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        if(item.itemId==R.id.op_login)
        {
            Toast.makeText(this, "Log in process...", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId==R.id.op_logout)
        {
            Toast.makeText(this, "Log Out...", Toast.LENGTH_SHORT).show()
        }
        if (item.itemId==R.id.op_registration)
        {
            Toast.makeText(this, "Registration", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }

}