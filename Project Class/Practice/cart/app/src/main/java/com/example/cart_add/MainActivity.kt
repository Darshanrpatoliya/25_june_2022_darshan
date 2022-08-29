package com.example.cart_add

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var plus=findViewById<AppCompatButton>(R.id.plus_cart)
        var min=findViewById<AppCompatButton>(R.id.min_cart)
        var total=findViewById<TextView>(R.id.qnt_cart)

        var total_cart:Int=0

        var click=true

        plus.setOnClickListener{
            if (click)
            {
                click=true
                total_cart+=1
                total.setText("$total_cart")
            }
        }
        min.setOnClickListener{
            if (click)
            {
                click=true
                if (total_cart>0)
                {
                    total_cart-=1
                    total.setText("$total_cart")
                }
//                total_cart-=1
//                total.setText("$total_cart")


            }
        }
    }
}