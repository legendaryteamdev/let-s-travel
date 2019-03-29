package com.example.lets_travel.ui.favorite_fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lets_travel.R


class FavoriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_favorite, container, false)


        //Set AppBar
        (activity as AppCompatActivity).setSupportActionBar(view.findViewById(R.id.favorite_toolbar))
        (activity as AppCompatActivity).supportActionBar?.setTitle(R.string.favorite)

        return view
    }


}
