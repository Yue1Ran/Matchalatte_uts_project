package com.example.matchalatte_uts_project


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController

import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        drawerLayout = findViewById(R.id.drawerLayout)
//       navController =
//           (supportFragmentManager.findFragmentById(R.id.hostFragment) as
//                    NavHostFragment).navController
//       NavigationUI.setupActionBarWithNavController(this, navController ,drawerLayout)
//
//        val navView = findViewById<NavigationView>(R.id.navView)
//        NavigationUI.setupWithNavController(navView, navController)
//
//        var bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
//        bottomNav.setupWithNavController(navController)

    }
//    override fun onSupportNavigateUp(): Boolean {
//       return navController.navigateUp(navController, drawerLayout)
//               || super.onSupportNavigateUp()
//   }
}