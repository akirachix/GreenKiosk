package com.example.greenkiosk.Customer.listener

import com.example.greenkiosk.Customer.models.ProductModel

interface ProductLoadListener {
    fun onProductLoadSuccess(productModelList:List<ProductModel>?)
    fun onProductLoadFailed(message: String?)
}