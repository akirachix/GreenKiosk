package com.example.greenkiosk.Models

import com.google.gson.annotations.SerializedName

data class ProductRequest(@SerializedName("name_of_theProduct")
                          var name_of_theProduct:String,
                          var quantity:String,
                           var price:String)




