package com.demo.musicfy.data.remote.musicservice

import com.demo.musicfy.data.remote.response.AlbumResponse
import com.demo.musicfy.data.remote.token.BearerToken
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface SpotifyService {
    @GET(SpotifyEndPoints.ALBUM_ENDPOINT)
    suspend fun getAlbumWithId(
        @Path("id") id: String,
        @Query("market") marker: String,
        @Header("Authorization") token: BearerToken
    ): AlbumResponse
}