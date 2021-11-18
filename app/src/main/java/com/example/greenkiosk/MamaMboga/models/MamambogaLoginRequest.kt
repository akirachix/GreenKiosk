package com.example.greenkiosk.MamaMboga.models

import com.google.gson.annotations.SerializedName

data class MamambogaLoginRequest(
    var password: String,
    var email:String
)
