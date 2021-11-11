package com.example.greenkiosk.Models

import com.google.gson.annotations.SerializedName

data class MamambogaSignupRequest(var name:String,
                                  var email:String,
                                  var password:String,
                                  @SerializedName("phone_number")
                                  var phone_number:String)




