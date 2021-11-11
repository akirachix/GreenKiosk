package com.example.greenkiosk.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.greenkiosk.Models.ProductResponse
import com.example.greenkiosk.Repository.ProductRepository

class ProductViewModel:ViewModel() {
    var registrationLiveData = MutableLiveData<ProductResponse>()
    var regError = MutableLiveData<String>()
    var productRepository= ProductRepository()




}

