package com.example.lets_travel.ui.search_bar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.view.View
import android.widget.*
import com.example.lets_travel.R
import com.example.lets_travel.ultils.Tools

class SearchBar : AppCompatActivity() {

    private var toolbar: Toolbar? = null
    private var et_search: EditText? = null
    private var bt_clear: ImageButton? = null

    private var progress_bar: ProgressBar? = null
    private var lyt_no_result: LinearLayout? = null

    private var recyclerSuggestion: RecyclerView? = null
    private var lyt_suggestion: LinearLayout? = null

    internal var textWatcher: TextWatcher = object : TextWatcher {
        override fun onTextChanged(c: CharSequence, i: Int, i1: Int, i2: Int) {
            if (c.toString().trim { it <= ' ' }.length == 0) {
                bt_clear!!.visibility = View.GONE
            } else {
                bt_clear!!.visibility = View.VISIBLE
            }
        }

        override fun beforeTextChanged(c: CharSequence, i: Int, i1: Int, i2: Int) {}

        override fun afterTextChanged(editable: Editable) {}
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_bar)

        initToolbar()
        initComponent()
    }

    private fun initToolbar() {
        toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    private fun initComponent() {
        progress_bar = findViewById<View>(R.id.progress_bar) as ProgressBar
        lyt_no_result = findViewById<View>(R.id.lyt_no_result) as LinearLayout

        lyt_suggestion = findViewById<View>(R.id.lyt_suggestion) as LinearLayout
        et_search = findViewById<View>(R.id.et_search) as EditText
        et_search!!.addTextChangedListener(textWatcher)

        bt_clear = findViewById<View>(R.id.bt_clear) as ImageButton
        bt_clear!!.visibility = View.GONE
        recyclerSuggestion = findViewById<View>(R.id.recyclerSuggestion) as RecyclerView

        recyclerSuggestion!!.layoutManager = LinearLayoutManager(this)
        recyclerSuggestion!!.setHasFixedSize(true)



        //create RecyclerView to display search list result
//        //set data and list adapter suggestion
//        mAdapterSuggestion = AdapterSuggestionSearch(this)
//        recyclerSuggestion!!.adapter = mAdapterSuggestion
//        showSuggestionSearch()
//        mAdapterSuggestion!!.setOnItemClickListener { view, viewModel, pos ->
//            et_search!!.setText(viewModel)
//            ViewAnimation.collapse(lyt_suggestion!!)
//            hideKeyboard()
//            searchAction()
//        }

    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        } else {
            Toast.makeText(applicationContext, item.title, Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}