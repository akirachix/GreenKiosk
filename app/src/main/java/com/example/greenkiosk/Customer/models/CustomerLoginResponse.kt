package com.example.greenkiosk.Customer.models

import com.google.gson.annotations.SerializedName

data class CustomerLoginResponse(
    var message: String,
    @SerializedName("access_token") var accessToken: String,
    @SerializedName("customer_id") var customerId: String

)
