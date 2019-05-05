package com.example.lets_travel.ui.add_new_place_fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lets_travel.R



class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view:View = inflater.inflate(R.layout.fragment_add_newplace, container, false)

        return view
    }


}
