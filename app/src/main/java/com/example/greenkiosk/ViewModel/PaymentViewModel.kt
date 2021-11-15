package com.example.greenkiosk.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.greenkiosk.Models.PaymentRequest
import com.example.greenkiosk.Models.PaymentResponse
import com.example.greenkiosk.Repository.PaymentRepository
import kotlinx.coroutines.launch

class PaymentViewModel:ViewModel() {
    var registrationLiveData = MutableLiveData<PaymentResponse>()
    var regError = MutableLiveData<String>()
    var paymentRepository = PaymentRepository()

    fun payments(paymentRequest: PaymentRequest){
        viewModelScope.launch {
            var response = paymentRepository.payments(paymentRequest)
            if (response.isSuccessful){
                registrationLiveData.postValue(response.body())
            }
            else{
                regError.postValue(response.errorBody()?.string())
            }
        }
    }
}