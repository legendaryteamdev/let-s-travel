package com.example.lets_travel.ui.province_detail_activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import com.example.lets_travel.R
import com.example.lets_travel.ui.visiting_place_detail.VisitingPlaceDetail

const val PROVINCE_NAME = "province_name"

class ProvinceDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_province_detail)
        val mFloatingActionButton : FloatingActionButton = findViewById(R.id.fab_btn)
        mFloatingActionButton.setOnClickListener {
            var intent =  Intent(applicationContext , VisitingPlaceDetail::class.java)
            startActivity(intent)
        }
    }
}