package com.example.lets_travel.ui.visiting_place_detail_fragment

import adapter.HomeAdapter
import adapter.VisitingDetailAdapter
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lets_travel.R

class VisitingPlaceDetailFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    var myDataset =
        arrayOf(
            "Bla Bla Bla I don't care",
            "Bla Bla Bla I don't care",
            "Bla Bla Bla I don't care",
            "Bla Bla Bla I don't care"
        )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_detail_province, container, false)
        viewManager = LinearLayoutManager(context)
        viewAdapter = VisitingDetailAdapter(myDataset)
        recyclerView = rootView.findViewById<RecyclerView>(R.id.visiting_detail_recyclerview).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
        return rootView
    }

}