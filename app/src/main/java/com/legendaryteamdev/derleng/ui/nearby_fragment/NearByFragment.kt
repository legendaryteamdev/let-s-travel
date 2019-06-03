package com.legendaryteamdev.derleng.ui.nearby_fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.legendaryteamdev.derleng.R

class NearByFragment : Fragment(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_nearby, container, false)
        val mapFragment: SupportMapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        return view
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        //set camera zoom on map
        mMap.setMinZoomPreference(14.0f)
        mMap.setMaxZoomPreference(20.0f)
        // Add a marker in Sydney and move the camera
        val cambodia = LatLng(11.562108, 104.888535)
        mMap.addMarker(MarkerOptions().position(cambodia).title("Marker in Phnom Penh"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cambodia))
    }
    


}
