package com.example.greenkiosk.Customer.repository

import com.example.greenkiosk.Customer.api.ApiClient
import com.example.greenkiosk.Customer.api.ApiInterface
import com.example.greenkiosk.Customer.models.CustomerLoginRequest
import com.example.greenkiosk.Customer.models.CustomerLoginResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class CustomerRepository() {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun customerLogin(customerLoginRequest: CustomerLoginRequest): Response<CustomerLoginResponse> =
        withContext(Dispatchers.IO){
            var resp= apiInterface.customerLogin(customerLoginRequest)
            return@withContext resp

        }


}