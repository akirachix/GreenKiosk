package com.example.greenkiosk.Models

import com.google.gson.annotations.SerializedName

data class OrdersResponse(@SerializedName("product_name")var product_name:String,
                          var quantity:String,
                          var product_id:String)

