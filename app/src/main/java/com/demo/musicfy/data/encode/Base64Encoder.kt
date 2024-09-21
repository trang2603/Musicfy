package com.demo.musicfy.data.encode

interface Base64Encoder {
    fun encodeToString(input: ByteArray): String
}