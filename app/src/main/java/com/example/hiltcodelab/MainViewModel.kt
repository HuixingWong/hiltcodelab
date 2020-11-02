package com.example.hiltcodelab

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(private val repo: MainRepo) : ViewModel() {


    val enbale = MutableLiveData<Boolean>()
    val b = MutableLiveData<Boolean>()
    val c = MutableLiveData<Boolean>()
    val Viewstate = MutableLiveData<Boolean>()
    val viewAction = MutableLiveData<Boolean>()

    val data = MutableLiveData<String>()
    suspend fun fetchData(){
        enbale.value = false
        data.value =  repo.getData()
        enbale.value = true

    }

    suspend fun  b() {
        b.value = false
        c.value = true
    }

    fun set() {

    }
}