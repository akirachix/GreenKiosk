package com.example.greenkiosk.Customer.api

import com.example.greenkiosk.Customer.CustomerCart
import com.example.greenkiosk.Customer.models.CustomerLoginRequest
import com.example.greenkiosk.Customer.models.CustomerLoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST("/customer/login")
    suspend fun customerLogin(@Body customerLoginRequest: CustomerLoginRequest): Response<CustomerLoginResponse>

    @GET("/customer/login")
    suspend fun getCustomerResponse(@Header("Authorization") token: String): Response<CustomerLoginRequest>
}