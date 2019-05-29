package com.example.lets_travel.ui.home_fragment


import adapter.HomeAdapter
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import android.widget.Toast

import com.example.lets_travel.R
import com.example.lets_travel.ultils.Tools
import com.example.lets_travel.widget.SpacingGridView


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
        parent_view = view.findViewById(android.R.id.content)
        initComponent(view)
        return view
    }

    private fun initComponent(view:View) {
        recyclerView = view!!.findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.layoutManager = GridLayoutManager(context, 2)
        recyclerView!!.addItemDecoration(SpacingGridView(2, Tools.dpToPx(context, 3), true))
        recyclerView!!.setHasFixedSize(true)



        //set data and list adapter
        mAdapter = HomeAdapter(myDataset)
        recyclerView!!.adapter = mAdapter

        // on item list clicked

//        mAdapter!!.setOnItemClickListener { view,  position -> Snackbar.make(parent_view!!,Snackbar.LENGTH_SHORT).show() }
//                mAdapter!!.setOnItemClickListener()
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.app_bar_menu, menu)
    }


}
