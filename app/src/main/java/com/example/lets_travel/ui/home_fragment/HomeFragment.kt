package com.example.lets_travel.ui.home_fragment


import adapter.HomeAdapter
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import com.example.lets_travel.R


class HomeFragment : Fragment() {

    private var parent_view: View? = null

    private var recyclerView: RecyclerView? = null
    private var mAdapter: HomeAdapter? = null


    var myDataset =
        arrayOf("BATTAMBANG", "PHNOM PENH", "SIEM REAP", "KOMPONG THOM", "KOMPONG SPEU", "KONDAL", "PREY VENG")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        parent_view = view.findViewById<View>(android.R.id.content)
        initComponent(view)
        return view
    }

    private fun initComponent(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView!!.setLayoutManager(LinearLayoutManager(context))
        recyclerView!!.setHasFixedSize(true)


        //set data and list adapter
        mAdapter = HomeAdapter( myDataset, R.layout.home_recycler_list)
        recyclerView!!.setAdapter(mAdapter)


    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.app_bar_menu, menu)
    }




}
