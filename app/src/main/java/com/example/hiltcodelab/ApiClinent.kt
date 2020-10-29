package com.example.hiltcodelab

import javax.inject.Inject

class ApiClient @Inject constructor(private val apiService: ApiService) {
    suspend fun fetchPokemonList(
        page: Int
    ) = apiService.fetchPokemonList(
        limit = PAGING_SIZE,
        offset = page * PAGING_SIZE
    )
    companion object {
        private const val PAGING_SIZE = 20
    }
}