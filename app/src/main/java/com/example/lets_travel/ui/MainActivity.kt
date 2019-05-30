package com.example.lets_travel.ui

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import com.example.lets_travel.R
import com.example.lets_travel.ui.about_us.AboutUs
import com.example.lets_travel.ui.favorite_fragment.FavoriteFragment
import com.example.lets_travel.ui.home_fragment.HomeFragment
import com.example.lets_travel.ui.nearby_fragment.NearByFragment
import com.example.lets_travel.ui.search_bar.SearchBar

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.nav_home -> {
                replaceFragment(HomeFragment())
            }
            R.id.nav_favorite -> {
                replaceFragment(FavoriteFragment())
            }
            R.id.nav_language -> {
                showDialog()
            }
            R.id.nav_rating -> {

            }
            R.id.nav_nearby -> {
                replaceFragment(NearByFragment())
            }
            R.id.nav_aboutus -> {
               var intent = Intent(applicationContext , AboutUs::class.java)
                startActivity(intent)
            }

        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }


    private fun showDialog() {
        val mDialogView = LayoutInflater.from(this).inflate(R.layout.language_dialog, null)
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setView(mDialogView)
        val dialog: AlertDialog = builder.create()
        dialog.show()
        dialog.window.setLayout(800, 450)
        dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(HomeFragment())


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.setTitle(R.string.home)


        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId){
            R.id.search_menu_icon -> {
                var intent = Intent(applicationContext , SearchBar::class.java)
                startActivity(intent)
                return true
            }
            else ->{
                super.onOptionsItemSelected(item)
            }
        }
        return true
    }


}
