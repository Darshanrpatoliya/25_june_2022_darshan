package com.example.p2bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bn=findViewById<BottomNavigationView>(R.id.bn_view)

        bn.setOnItemSelectedListener {
            when(it.itemId){
                R.id.b_home->{
                    loadfragment(HomeFragment())
                }
                R.id.b_settings->{
                    loadfragment(SettingsFragment())
                }
                R.id.b_profile->{
                    loadfragment(ProfileFragment())
                }
            }

            return@setOnItemSelectedListener true
        }

    }

    fun loadfragment(fragment: Fragment){
        val transection=supportFragmentManager.beginTransaction()
        transection.replace(R.id.new_replace,fragment)
        transection.addToBackStack(null)
        transection.commit()
    }
}