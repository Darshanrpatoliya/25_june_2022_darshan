package com.example.dateshow

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity()
{
    @RequiresApi(Build.VERSION_CODES.N)
    var d=Calendar.getInstance()

    var cdate=d.get(Calendar.YEAR)
    var cmonth=d.get(Calendar.MONTH)
    var cyear=d.get(Calendar.YEAR)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btdate=findViewById<AppCompatButton>(R.id.btn_date)

        btdate.setOnClickListener {

            var date_dialog=DatePickerDialog(this@MainActivity,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

                var m=month+1

                btdate.setText("$dayOfMonth/$m/$year")

            },d.get(Calendar.YEAR),d.get(Calendar.MONTH),d.get(Calendar.DAY_OF_MONTH))
                    date_dialog.datePicker.maxDate=System.currentTimeMillis()-1000
                date_dialog.show()
        }

    }
}