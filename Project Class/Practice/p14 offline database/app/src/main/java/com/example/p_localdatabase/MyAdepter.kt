package com.example.p_localdatabase

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView

class MyAdepter(var context: Context,var userlist:MutableList<MyModel>):RecyclerView.Adapter<MyAdepter.MyClass>() {

    class MyClass(itemview:View):RecyclerView.ViewHolder(itemview)
    {
        var name=itemview.findViewById<TextView>(R.id.tv_name)
        var email=itemview.findViewById<TextView>(R.id.tv_email)
        var pass=itemview.findViewById<TextView>(R.id.tv_pass)

        var btedit=itemview.findViewById<AppCompatButton>(R.id.btn_edit)
        var btdelete=itemview.findViewById<AppCompatButton>(R.id.btn_delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyClass {
        var v=LayoutInflater.from(parent.context).inflate(R.layout.myrow_layout,parent,false)
        return MyClass(v)
    }

    override fun onBindViewHolder(holder: MyClass, position: Int) {
        var mydata=userlist[position]

        holder.name.setText(mydata.mm_name)
        holder.email.setText(mydata.mm_email)
        holder.pass.setText(mydata.mm_pass)

        holder.btedit.setOnClickListener {
            var d=Dialog(context)
            d.setContentView(R.layout.myupdate_layout)
            d.show()

            var edname=d.findViewById<EditText>(R.id.ed_update_name)
            var edemail=d.findViewById<EditText>(R.id.ed_update_email)
            var edpass=d.findViewById<EditText>(R.id.ed_update_pass)
            var btupdate=d.findViewById<AppCompatButton>(R.id.btn_update)

            edname.setText(mydata.mm_name)
            edemail.setText(mydata.mm_email)
            edpass.setText(mydata.mm_pass)

            btupdate.setOnClickListener {
                var mydb=MyDatabase(context)

                var mymodel=MyModel(mydata.mm_id,edname.text.toString(),edemail.text.toString(),edpass.text.toString())
                mydb.updateData(mymodel)

                var i=Intent(context,GuestActivity3::class.java)
                (context as Activity).finish()                        // IMPORTENT
                context.startActivity(i)
            }
        }

        holder.btdelete.setOnClickListener {
            var mydb=MyDatabase(context)

            var myModel=MyModel(mydata.mm_id,mydata.mm_name,mydata.mm_email,mydata.mm_pass)
            mydb.deleteData(myModel)

            var i2=Intent(context,MainActivity::class.java)
            context.startActivity(i2)
        }
    }

    override fun getItemCount(): Int {
        return userlist.size
    }
}