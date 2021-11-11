package com.example.greenkiosk.Models

import com.google.gson.annotations.SerializedName

data class SignupResponse(
        @SerializedName("first_Name")var first_Name:String,
        @SerializedName("last_Name")var last_Name:String,
        var email:String,
        @SerializedName("phone_number")var phone_number:String,
        @SerializedName("customer_id")var customer_id:String,
)









