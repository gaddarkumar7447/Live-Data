package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.withStarted
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dataBinding : ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    lateinit var quotes: Quotes
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        mainViewModel.factLiveData.observe(this, Observer {
            dataBinding.textView.text = it
        })

        dataBinding.buttonPanel.setOnClickListener{
            mainViewModel.updateLiveData()
        }

        quotes = Quotes("gaddar", "sikhoge nahi to aage badoge kaise")
        dataBinding.quotes = quotes
    }
}