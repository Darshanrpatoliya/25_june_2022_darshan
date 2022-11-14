package com.example.p_localdatabase

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class MyDatabase(var context: Context):SQLiteOpenHelper(context,"mydb",null, VERSION_NO){

    companion object
    {
        var ID="id"
        var VERSION_NO=1
        var TABLE_NAME="Student"
        var NAME="name"
        var EMAIL="email"
        var PASS="pass"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        // CREATE TABLE TABLENAME (COLOMNNAME SIZE , COLUMNNAME SISE)
        var create_query=" CREATE TABLE "+TABLE_NAME+" ( "+ID+" integer primary key AUTOINCREMENT, "+NAME+" VARCHAR(20), "+EMAIL+" VARCHAR(20), "+PASS+" VARCHAR(20) ) "
        db!!.execSQL(create_query)
    }

    fun insertData(myModel: MyModel):Long
    {
        var mydb=this.writableDatabase
        var contentValues=ContentValues()

        contentValues.put(NAME,myModel.mm_name)
        contentValues.put(EMAIL,myModel.mm_email)
        contentValues.put(PASS,myModel.mm_pass)

        var iD=mydb.insert(TABLE_NAME,null,contentValues)
        Log.d("mydb","insrtdata Succesfully")
        return iD
    }

    @SuppressLint("Range")
    fun getall_data():MutableList<MyModel>
    {
        var userlist:MutableList<MyModel> = ArrayList()
        var sel_que= "SELECT * FROM $TABLE_NAME"
        var cursor:Cursor?
        var mydb=this.readableDatabase

        try {
            cursor=mydb.rawQuery(sel_que,null)
        }catch (e:SQLiteException){
            mydb.execSQL(sel_que)
            return ArrayList()
        }

        var u_id:Int
        var u_name:String
        var u_email:String
        var u_pass:String

        if (cursor.count>0)
        {
            if (cursor.moveToFirst())
            {
                do {
                    u_id=cursor.getInt(cursor.getColumnIndex(ID))
                    u_name=cursor.getString(cursor.getColumnIndex(NAME))
                    u_email=cursor.getString(cursor.getColumnIndex(EMAIL))
                    u_pass=cursor.getString(cursor.getColumnIndex(PASS))

                    var user_data=MyModel(mm_id = u_id, mm_name = u_name, mm_email = u_email, mm_pass = u_pass)
                    userlist.add(user_data)
                }while (cursor.moveToNext())
            }
        }
        return userlist
    }

    fun updateData(myModel: MyModel):Int
    {
        var db=this.writableDatabase
        var contentValues=ContentValues()

        contentValues.put(NAME,myModel.mm_name)
        contentValues.put(EMAIL,myModel.mm_email)
        contentValues.put(PASS,myModel.mm_pass)

        var id=db.update(TABLE_NAME,contentValues, ID+" = "+myModel.mm_id,null)
        db.close()
        return id
    }

    fun deleteData(myModel: MyModel):Int
    {
        var db=this.writableDatabase
        var delete_query=db.delete(TABLE_NAME, ID+" = "+myModel.mm_id,null)
        db.close()
        return delete_query
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}