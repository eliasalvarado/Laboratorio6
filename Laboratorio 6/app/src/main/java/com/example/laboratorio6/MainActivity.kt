package com.example.laboratorio6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottonNav: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottonNav = findViewById(R.id.bottonNav)
        setFragment(fragment_home.newInstance("Good Morning,","Elías Alvarado"))
        setListeners()
    }

    private  fun setListeners(){
        bottonNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.menu_option_home -> setFragment(fragment_home.newInstance("Good Morning,","Elías Alvarado"))
                R.id.menu_option_search -> setFragment(fragment_search())
                R.id.menu_option_library -> setFragment(fragment_library())
            }
            true
        }
    }

    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit{
            setReorderingAllowed(true)
            replace(R.id.fragment_container_view, fragment)
        }
    }
}