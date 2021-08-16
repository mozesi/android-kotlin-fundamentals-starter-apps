package com.kauzganga.fragmentapp.Home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var header =" hello"

    init {
        Log.i("Home view Model", "Home vie model called")
    }

    fun getResult(): Int{

        return 1
    }
}