package com.example.greenkiosk.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.greenkiosk.Models.OrdersResponse
import com.example.greenkiosk.Repository.OrdersRepository

class OrdersViewModels {
    var registrationLiveData = MutableLiveData<OrdersResponse>()
    var regError = MutableLiveData<String>()
    var customerRepository = OrdersRepository()
}