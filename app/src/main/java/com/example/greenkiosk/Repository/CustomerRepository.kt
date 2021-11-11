package com.example.greenkiosk.Repository

import com.example.greenkiosk.Models.SignupRequest
import com.example.greenkiosk.Models.SignupResponse
import com.example.greenkiosk.api.ApiClient
import com.example.greenkiosk.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class CustomerRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun signupcustomer(SignupRequest: SignupRequest):
            Response<SignupResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.signupCustomer(SignupRequest)
            return@withContext resp
        }
}