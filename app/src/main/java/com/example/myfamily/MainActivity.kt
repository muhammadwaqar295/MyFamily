package com.example.myfamily

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        
        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        
        bottomBar.setOnItemSelectedListener { menuitem ->
         
            if (menuitem.itemId==R.id.nav_guard){
                inflateFragment()
            }else if (menuitem.itemId==R.id.nav_home){
                inflateHomeFragment()
            }else if (menuitem.itemId==R.id.nav_dashboard) {
                inflatedashboardFragment()
            }else if (menuitem.itemId==R.id.nav_profile) {
                inflateprofileFragment()

            }
            true
            
        }
        

    }

    private fun inflateprofileFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,ProfileFragment.newInstance())
        transaction.commit()

    }

    private fun inflatedashboardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,DashboardFragment.newInstance())
        transaction.commit()

    }

    private fun inflateHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()

    }

    private fun inflateFragment() {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()

    }

}