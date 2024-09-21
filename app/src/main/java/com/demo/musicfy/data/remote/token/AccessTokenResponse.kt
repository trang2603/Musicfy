package com.demo.musicfy.data.remote.token

import com.fasterxml.jackson.annotation.JsonProperty

data class AccessTokenResponse(
    @JsonProperty("access_token") val accessToken: String,
    @JsonProperty("token_type") val tokenType: String ,
    @JsonProperty("expires_in") val secondsUntilExpires: Int
)
