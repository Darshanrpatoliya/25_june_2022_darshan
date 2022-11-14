package com.example.p_localdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GuestActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest3)

        var recyclerview=findViewById<RecyclerView>(R.id.rec_getdata)

        recyclerview.layoutManager=LinearLayoutManager(this@GuestActivity3)

        var mydb=MyDatabase(this)

        var userlist:MutableList<MyModel> = ArrayList()
        userlist=mydb.getall_data()

        var adp=MyAdepter(this@GuestActivity3,userlist)
        recyclerview.adapter=adp
    }
}