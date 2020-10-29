package com.example.hiltcodelab

import javax.inject.Inject

class MainRepo @Inject constructor(private val apiClient: ApiClient) {

    suspend fun getData(): String {
        val fetchPokemonList = apiClient.fetchPokemonList(0)
        if (fetchPokemonList.isSuccessful){
            return fetchPokemonList.body().toString()
        }
        return "load data failed"
    }
}