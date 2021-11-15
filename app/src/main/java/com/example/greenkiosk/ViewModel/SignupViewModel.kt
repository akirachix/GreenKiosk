package com.example.greenkiosk.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.greenkiosk.Models.SignupResponse
import com.example.greenkiosk.Repository.CustomerRepository

class SignupViewModel:ViewModel() {
    var registrationLiveData = MutableLiveData<SignupResponse>()
    var regError = MutableLiveData<String>()
    var customerRepository = CustomerRepository()
}



//    fun signupCustomer(signupRequest: SignupRequest) {
//        var viewModelScope = null
//        viewModelScope.launch {
//            val response = CustomerRepository.signupCustomer(SignupRequest)
//            if (response.isSuccessful) {
//                regi
//                registrationLiveData.postValue(response.body())
//            } else {
//                regError.postValue(response.errorBody()?.string())
//            }
//        }
//    }








