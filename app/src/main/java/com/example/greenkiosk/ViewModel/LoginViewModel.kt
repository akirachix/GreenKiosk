package com.example.greenkiosk.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.greenkiosk.Models.CustomerLoginResponse
import com.example.greenkiosk.Repository.LoginRespository

class LoginViewModel:ViewModel() {
      var registrationLiveData = MutableLiveData<CustomerLoginResponse>()
        var regError = MutableLiveData<String>()
        var loginRepository = LoginRespository()
    }
