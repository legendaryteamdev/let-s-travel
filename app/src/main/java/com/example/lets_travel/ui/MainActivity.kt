package com.example.lets_travel.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.lets_travel.R
import com.example.lets_travel.ui.favorite_fragment.FavoriteFragment
import com.example.lets_travel.ui.home_fragment.HomeFragment
import com.example.lets_travel.ui.nearby_fragment.NearByFragment

import com.example.lets_travel.ui.setting_fragment.SettingFragment

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.action_home -> {
                replaceFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_favorite -> {
                replaceFragment(FavoriteFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_language -> {
                replaceFragment(SettingFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_location -> {
                replaceFragment(NearByFragment())
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(HomeFragment())
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
