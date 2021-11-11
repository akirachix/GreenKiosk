package com.example.greenkiosk.api

import com.example.greenkiosk.Models.*
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/login//")
    suspend fun loginCustomer(@Body loginRequest:CustomerLoginRequest):retrofit2.Response<CustomerLoginResponse>
    @POST("/customer/signup")
    suspend fun signupCustomer(@Body signupRequest:SignupRequest):retrofit2.Response<SignupResponse>
    @POST("/mamaMboga/signup")
    suspend fun mamaMbogaSignup(@Body MamambogaSignupRequest: MamambogaSignupRequest):retrofit2.Response<MamambogaSignupResponse>
    @POST("/mamaMboga/updateProduct")
    suspend fun updateProduct(@Body productRequest: ProductRequest):retrofit2.Response<ProductResponse>
    @POST("/customers/oders")
    suspend fun orders(@Body ordersRequest: OrdersRequest):retrofit2.Response<OrdersResponse>
    @POST("/categories")
    suspend fun categories(@Body categoriesRequest: CategoriesRequest):retrofit2.Response<CategoriesResponse>
}
