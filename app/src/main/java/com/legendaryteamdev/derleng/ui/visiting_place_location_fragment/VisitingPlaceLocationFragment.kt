package com.legendaryteamdev.derleng.ui.visiting_place_location_fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.legendaryteamdev.derleng.R

class VisitingPlaceLocationFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_visiting_place_location, container, false)
    }
}