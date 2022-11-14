package com.example.nd_kotak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var drawerlayout:DrawerLayout=findViewById(R.id.main_nav_drawer)
        var nav_view:NavigationView=findViewById(R.id.nav_view)
        var toolbar:Toolbar=findViewById(R.id.nav_toolbar)
        setSupportActionBar(toolbar)
        var navController=findNavController(R.id.fragmentContainerView)

        appBarConfiguration= AppBarConfiguration(
            setOf(R.id.profileFragment,R.id.languageFragment,R.id.callusFragment,R.id.settingsFragment,R.id.logoutFragment),drawerlayout)

        setupActionBarWithNavController(navController,appBarConfiguration)
        nav_view.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        var navController=findNavController(R.id.fragmentContainerView)
        return navController.navigateUp(appBarConfiguration)||return super.onSupportNavigateUp()
    }
}