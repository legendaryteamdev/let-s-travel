package com.example.lets_travel.ui.visiting_place_detail

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.lets_travel.R
import com.example.lets_travel.ui.visiting_place_detail_fragment.VisitingPlaceDetailFragment
import com.example.lets_travel.ui.visiting_place_location_fragment.VisitingPlaceLocationFragment
import com.example.lets_travel.ui.visiting_place_rating_fragment.VisintingPlaceRatingFragment

class VisitingPlaceDetail : AppCompatActivity() {


    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null

    private var mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visiting_place_detail)

        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById<View>(R.id.container) as ViewPager
        mViewPager!!.adapter = mSectionsPagerAdapter

        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout

        mViewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(mViewPager))

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail_province, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }


    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment? {

            var fragment: Fragment? = null
            when (position) {
                0 -> fragment = VisitingPlaceDetailFragment()
                1 -> fragment = VisintingPlaceRatingFragment()
                2 -> fragment = VisitingPlaceLocationFragment()
            }

            return fragment
        }

        override fun getCount(): Int {
            // Show 3 total pages.
            return 3
        }
    }
}
