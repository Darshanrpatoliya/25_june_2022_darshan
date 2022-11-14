package com.example.popcontextmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

            var popup_menu:PopupMenu= PopupMenu(MainActivity@this,btpm)

            popup_menu.menuInflater.inflate(R.menu.mymenu,popup_menu.menu)

            popup_menu.setOnMenuItemClickListener {
                when(it.itemId)
                {
                    R.id.op_login-> Log.d("mydata","Log IN clicked")
                    R.id.op_logout->Log.d("mydata","Log Out Clicked")
//                    R.id.op_help->Log.d("mydata","Help Clicked")
                }

                if (it.itemId==R.id.op_help)
                {
                    Toast.makeText(MainActivity@this, "Help", Toast.LENGTH_SHORT).show()
                }
                true
            }
            popup_menu.show()
        }

        //context menu

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