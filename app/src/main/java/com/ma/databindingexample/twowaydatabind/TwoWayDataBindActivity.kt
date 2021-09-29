package com.ma.databindingexample.twowaydatabind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ma.databindingexample.R
import com.ma.databindingexample.databinding.ActivityTwowayBinding


class TwoWayDataBindActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTwowayBinding
    private var viewModel: TwoWayViewModel = TwoWayViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_twoway)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}