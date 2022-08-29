package com.example.spinner2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.PopupMenu

class PopupActivity2 : AppCompatActivity()
{
    lateinit var btpm:AppCompatButton
    lateinit var btconmenu:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup2)

        btpm=findViewById(R.id.btn_pm)
        btconmenu=findViewById(R.id.btn_conmenu)

        registerForContextMenu(btconmenu)

        btpm.setOnClickListener {
            var pop_menu:PopupMenu=PopupMenu(PopupActivity2@this,btpm)

            pop_menu.menuInflater.inflate(R.menu.mymenu,pop_menu.menu)

            pop_menu.setOnMenuItemClickListener {
                when(it.itemId)
                {
                    R.id.op_settings-> Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                    R.id.op_about-> Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
                    R.id.op_help-> Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show()
                }
                true
            }
            pop_menu.show()
        }

        var btnext=findViewById<AppCompatButton>(R.id.btn_next)
        btnext.setOnClickListener {
            var i= Intent(MainActivity@this,DynamicActivity3::class.java)
            startActivity(i)
        }
    }


//    CONTEXT MENU

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
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