package com.demo.musicfy.data.remote.response

import com.fasterxml.jackson.annotation.JsonProperty

data class AlbumResponse(
    val id: String,
    val name: String,
    @JsonProperty("album_type") val albumType: String,
    val artist: List<ArtistResponseWithNullImagesAndFollowers>,
    val images: List<ImageResponse>,
    @JsonProperty("release_date") val releaseDate: String,
    @JsonProperty("release_date_precision") val releaseDatePrecision: String,
    @JsonProperty("total_tracks") val totalTracks: Int,
    val tracks: TracksWithoutAlbumMetadataListResponse
) {
    data class ArtistResponseWithNullImagesAndFollowers(
        val id: String,
        val name: String,
        val followers: ArtistResponse.Followers,
        val images: List<ImageResponse>?
    )

    data class TracksWithoutAlbumMetadataListResponse(
        @JsonProperty("items") val items: List<TracksWithoutAlbumMetadataResponse>
    )

    data class TracksWithoutAlbumMetadataResponse(
        val id: String,
        val name: String,
        @JsonProperty("duration_ms") val durationMilliseconds: Int,
        @JsonProperty("is_playable") val isPlayable: Boolean,
        @JsonProperty("")
        val explicit: Boolean,
        @JsonProperty("preview_url") val previewUrl: String
    )


}