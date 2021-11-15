package com.example.greenkiosk.Customer.listener

import com.example.greenkiosk.Customer.models.CartModel

interface CartLoadListener {
    fun onLoadCartSuccess(cartModelList: List<CartModel>)
    fun onLoadCartFailed(message: String?, mainLayout: android.view.View)
}