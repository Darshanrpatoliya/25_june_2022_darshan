package com.example.p8alertdialofbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btclick=findViewById<AppCompatButton>(R.id.btn_click)

        btclick.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("Are You Sure You Want to Close")
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                    finish()
                })
                .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                    dialog.dismiss()
                })
                .setNeutralButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                    dialog.cancel()
                })
                .show()
        }

    }
}