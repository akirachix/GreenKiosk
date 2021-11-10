package com.example.greenkiosk.Models

import com.google.gson.annotations.SerializedName

data class



MamambogaSignupResponse(var name:String,
               var email:String,
               var message:String,
               @SerializedName("mamaMboga_id") var mamaMboga_id:String,)











