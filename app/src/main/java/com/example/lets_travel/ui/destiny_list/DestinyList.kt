package com.example.lets_travel.ui.destiny_list

import adapter.DestinyAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.View
import com.example.lets_travel.R

class DestinyList : AppCompatActivity() {
    private var parent_view: View? = null

    private var recyclerView: RecyclerView? = null
    private var mAdapter: DestinyAdapter? = null

    var mData = arrayOf("BattamBang","Phnom Penh","Siem Reap","Koh Kong" , "KomPot")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.destiny_list)
        parent_view = findViewById(android.R.id.content)

        initToolbar()
        initComponent()
    }

    private fun initToolbar() {
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        toolbar.setNavigationIcon(R.drawable.ic_menu)
        setSupportActionBar(toolbar)
    }

    private fun initComponent() {
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.setHasFixedSize(true)


        //set data and list adapter
        mAdapter = DestinyAdapter( mData, R.layout.item_news_horizontal)
        recyclerView!!.adapter = mAdapter


    }

}