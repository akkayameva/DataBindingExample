package com.ma.databindingexample.twowaydatabind

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayViewModel : ViewModel() {

    val userName = MutableLiveData<String>()

}