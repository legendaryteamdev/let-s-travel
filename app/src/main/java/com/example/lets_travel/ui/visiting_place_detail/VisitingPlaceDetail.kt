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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visiting_place_detail)


    }


}
