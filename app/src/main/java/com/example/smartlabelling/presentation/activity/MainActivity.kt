package com.example.smartlabelling.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var toolbar: androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbar()
    }


    private fun setupToolbar() {
        setSupportActionBar(binding.mainToolbar)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                //to do make the navigation to other fragments by clicking
//                androidx.navigation.ui.R.id.navigation_locations,
//                androidx.navigation.ui.R.id.navigation_episodes,
//                androidx.navigation.ui.R.id.navigation_characters,
            )
        )
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
}