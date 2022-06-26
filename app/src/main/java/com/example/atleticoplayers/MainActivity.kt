package com.example.atleticoplayers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.atleticoplayers.squad.SquadFragment

//app\build.gradle id 'kotlin-android-extensions'
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var navController: NavController
    //private lateinit var itemsViewModel: ItemsViewModel
    //private val orderFragment = SquadFragment()

    //val colors = listOf(R.drawable.gradient_1, R.drawable.gradient_6,
       // R.drawable.gradient_3, R.drawable.gradient_4, R.drawable.gradient_5, R.drawable.gradient_6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}