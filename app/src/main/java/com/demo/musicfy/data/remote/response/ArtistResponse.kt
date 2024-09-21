package com.demo.musicfy.data.remote.response

data class ArtistResponse(
    val id: String,
    val name: String,
    val followers: Followers,
    val images: List<ImageResponse>,
) {
    data class Followers(val total: Int)
}
