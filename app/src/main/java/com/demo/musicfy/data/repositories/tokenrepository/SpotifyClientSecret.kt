package com.demo.musicfy.data.repositories.tokenrepository

import com.demo.musicfy.data.encode.Base64Encoder

fun getSpotifyClientSecret(base64Encoder: Base64Encoder): String {
    val clientId = BuildConfig
}