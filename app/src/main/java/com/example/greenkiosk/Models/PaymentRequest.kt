package com.example.greenkiosk.Models

import com.google.gson.annotations.SerializedName

data class PaymentRequest(var amount:String,
                          @SerializedName("pin_number")var pin_number:String)
