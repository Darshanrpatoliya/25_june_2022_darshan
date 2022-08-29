package com.example.spinner2

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton

class AlertDialogActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog4)

        var btalert=findViewById<AppCompatButton>(R.id.btn_alert)

        btalert.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("Are You Sure You want To Close")

                .setPositiveButton("yes", DialogInterface.OnClickListener { dialog, which ->
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