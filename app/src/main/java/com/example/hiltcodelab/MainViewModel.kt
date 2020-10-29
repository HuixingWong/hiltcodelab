package com.example.hiltcodelab

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(private val repo: MainRepo) : ViewModel() {
    suspend fun getData(): String{
        return repo.getData()
    }
}