package com.ma.databindingexample.databind

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ma.databindingexample.R
import com.ma.databindingexample.databinding.ActivityDatabindBinding


class DataBindActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDatabindBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databind)
        binding.submitButton.setOnClickListener {
            displayHello()
        }
    }

    private fun displayHello() {
        binding.apply {
            helloTextView.text= "Hello"
            nameTextView.text =  nameEditText.text

        }
    }


}



