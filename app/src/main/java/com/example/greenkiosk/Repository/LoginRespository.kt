package com.example.greenkiosk.Repository

import com.example.greenkiosk.Models.CustomerLoginRequest
import com.example.greenkiosk.Models.CustomerLoginResponse
import com.example.greenkiosk.api.ApiClient
import com.example.greenkiosk.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class LoginRespository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun logincustomer(LoginRequest:CustomerLoginRequest):
            Response<CustomerLoginResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.logincustomer(LoginRequest)
            return@withContext resp
        }
}



