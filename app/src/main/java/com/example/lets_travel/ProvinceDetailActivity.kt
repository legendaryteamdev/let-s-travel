package com.example.lets_travel

import adapter.ProvinceDetailAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_province_detail.*

const val PROVINCE_NAME = "province_name"

class ProvinceDetailActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    var mDataset =
        arrayOf("Doung Te", "Tada Resort", "Kdat La Tang", "Kdat Sanaka", "Kayak Resort")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_province_detail)

        province_name_txt.text = intent.getStringExtra(PROVINCE_NAME)
        getRecyclerView()
    }


    private fun getRecyclerView() {
        viewManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        viewAdapter = ProvinceDetailAdapter(mDataset)
        recyclerView = findViewById<RecyclerView>(R.id.province_list).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}