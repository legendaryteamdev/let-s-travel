package com.example.lets_travel.ui.home_fragment


import adapter.HomeAdapter
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*

import com.example.lets_travel.R


class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    var myDataset =
        arrayOf("BATTAMBANG", "PHNOM PENH", "SIEM REAP", "KOMPONG THOM", "KOMPONG SPEU", "KONDAL", "PREY VENG")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        viewManager = LinearLayoutManager(context)
        viewAdapter = HomeAdapter(myDataset)
        recyclerView = view.findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

//        //Set AppBar
//        (activity as AppCompatActivity).setSupportActionBar(view.findViewById(R.id.home_toolbar))
//        (activity as AppCompatActivity).supportActionBar?.setTitle(R.string.home)


        return view
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.app_bar_menu, menu)
    }


}
