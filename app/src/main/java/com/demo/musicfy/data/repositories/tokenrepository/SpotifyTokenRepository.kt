package com.demo.musicfy.data.repositories.tokenrepository

import com.demo.musicfy.data.encode.Base64Encoder
import com.demo.musicfy.data.remote.token.BearerToken
import com.demo.musicfy.data.remote.token.TokenManager
import com.demo.musicfy.data.remote.token.isExpired
import javax.inject.Inject

class SpotifyTokenRepository @Inject constructor(
    private val tokenManager: TokenManager,
    private val base64Encoder: Base64Encoder
) : TokenRepository {
    private var token: BearerToken? = null
    override suspend fun getValidBearerToken(): BearerToken {
        if(token == null || token?.isExpired == true) getAndAssignToken()
        return token!!
    }

    private suspend fun getAndAssignToken() {
        val clientSecret = getSp
    }
}