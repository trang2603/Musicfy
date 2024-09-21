package com.demo.musicfy.data.encode

import android.util.Base64
import javax.inject.Inject


class AndroidBase64Encoder @Inject constructor(): Base64Encoder {
    override fun encodeToString(input: ByteArray): String {
        return Base64.encodeToString(input, Base64.NO_WRAP)
    }
}