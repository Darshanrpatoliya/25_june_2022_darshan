package com.example.menup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btpm=findViewById<AppCompatButton>(R.id.btn_pm)

        btpm.setOnClickListener {

            var pop_menu:PopupMenu= PopupMenu(MainActivity@this,btpm)

            pop_menu.menuInflater.inflate(R.menu.mymenu,pop_menu.menu)

            pop_menu.setOnMenuItemClickListener {
                when(it.itemId)
                {
                    R.id.op_login-> Toast.makeText(MainActivity@this, "Log In", Toast.LENGTH_SHORT).show()
                    R.id.op_logout-> Toast.makeText(MainActivity@this, "Log In", Toast.LENGTH_SHORT).show()
                    R.id.op_help-> Toast.makeText(MainActivity@this, "Help", Toast.LENGTH_SHORT).show()
                }
                true
            }
            pop_menu.show()
        }

        var btnext=findViewById<AppCompatButton>(R.id.btn_next)
        btnext.setOnClickListener {
            var i= Intent(MainActivity@this,DynamicActivity2::class.java)
            startActivity(i)
        }

        var btcm=findViewById<AppCompatButton>(R.id.btn_cm)

        registerForContextMenu(btcm)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.mymenu,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }
}