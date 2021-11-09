package com.example.greenkiosk.Customer.models

import com.google.gson.annotations.SerializedName

data class CustomerLoginRequest(
    @SerializedName("phone_number") var phoneNumber:String,
    var password: String
)
