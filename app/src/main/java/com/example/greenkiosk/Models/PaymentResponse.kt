package com.example.greenkiosk.Models

import com.google.gson.annotations.SerializedName

data class PaymentResponse(var message:String,
                    @SerializedName("customer_id")var customer_id:String)
