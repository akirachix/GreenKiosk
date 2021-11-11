package com.example.greenkiosk.Models

import com.google.gson.annotations.SerializedName

data class CategoriesResponse(@SerializedName("name_Of_mamaMboga")
                              var name_Of_mamaMboga:String,
                              @SerializedName("product_name")var product_name:String,
                              @SerializedName("product_id")var product_id:String)








