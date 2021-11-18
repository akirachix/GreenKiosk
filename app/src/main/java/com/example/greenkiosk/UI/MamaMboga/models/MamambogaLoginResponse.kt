package com.example.greenkiosk.UI.MamaMboga.models

import com.google.gson.annotations.SerializedName

data class MamambogaLoginResponse(
    var password:String,
    @SerializedName("mama_mboga_id") var mamaMbogaId: String
)
