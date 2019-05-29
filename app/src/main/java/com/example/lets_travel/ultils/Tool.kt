package com.example.lets_travel.ultils

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue


object Tools {

    val screenWidth: Int
        get() = Resources.getSystem().displayMetrics.widthPixels

    val screenHeight: Int
        get() = Resources.getSystem().displayMetrics.heightPixels


    fun dpToPx(c: Context?, dp: Int): Int {
        val r = c!!.resources
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r.displayMetrics))
    }


}
