package com.demo.musicfy.data.repositories.tokenrepository

import com.demo.musicfy.data.remote.token.BearerToken

interface TokenRepository {
    suspend fun getValidBearerToken(): BearerToken
}