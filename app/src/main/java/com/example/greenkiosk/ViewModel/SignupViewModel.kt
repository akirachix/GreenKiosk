package com.example.greenkiosk.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.greenkiosk.Models.SignupRequest
import com.example.greenkiosk.Models.SignupResponse
import com.example.greenkiosk.Repository.CustomerRepository
import kotlinx.coroutines.launch

class SignupViewModel:ViewModel() {
    var registrationLiveData = MutableLiveData<SignupResponse>()
    var regError = MutableLiveData<String>()
    var customerRepository = CustomerRepository()

    fun signupcustomer(signupRequest: SignupRequest){
            viewModelScope.launch {
                var response = customerRepository.signupcustomer(signupRequest)
                if (response.isSuccessful){
                    registrationLiveData.postValue(response.body())
                }
                else{
                    regError.postValue(response.errorBody()?.string())
                }
            }
        }
}










