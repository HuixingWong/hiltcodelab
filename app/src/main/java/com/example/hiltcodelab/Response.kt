package com.example.hiltcodelab

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class PokemonResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>
)

@Parcelize
data class Pokemon(
    var page: Int = 0,
    val name: String,
    val url: String
) : Parcelable {

    fun getImageUrl(): String {
        val index = url.split("/".toRegex()).dropLast(1).last()
        return "https://pokeres.bastionbot.org/images/pokemon/$index.png"
    }
}
