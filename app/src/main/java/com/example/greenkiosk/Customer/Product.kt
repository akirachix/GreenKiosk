package com.example.greenkiosk.Customer

data class Product(
    var imageUrl: String,
    var productName:String,
//    var kilograms: String,
    var quantity: Double =0.0,
    var prices: Int

    )
