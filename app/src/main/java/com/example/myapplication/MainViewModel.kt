package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var factLiveDataObject = MutableLiveData<String>("this is a fact")

    val factLiveData : LiveData<String>
    get() = factLiveDataObject

    fun updateLiveData() {
        factLiveDataObject.value = "hello mr."
    }

}
