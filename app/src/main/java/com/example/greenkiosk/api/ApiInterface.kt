package com.example.greenkiosk.api

import com.example.greenkiosk.Models.*
import retrofit2.http.Body
import retrofit2.http.POST



interface ApiInterface {
    @POST("/login//")
    suspend fun logincustomer(@Body CustomerLoginRequest:CustomerLoginRequest):retrofit2.Response<CustomerLoginResponse>
    @POST("/register//")
    suspend fun signupCustomer(@Body signupRequest:SignupRequest):retrofit2.Response<SignupResponse>
    @POST("/customer/signup")
    suspend fun mamaMbogaSignup(@Body MamambogaSignupRequest: MamambogaSignupRequest):retrofit2.Response<MamambogaSignupResponse>
    @POST("/mamaMboga/register//")
    suspend fun updateProduct(@Body productRequest: ProductRequest):retrofit2.Response<ProductResponse>
    @POST("/customers/orders")
    suspend fun orders(@Body ordersRequest: OrdersRequest):retrofit2.Response<OrdersResponse>
    @POST("/categories")
    suspend fun categories(@Body categoriesRequest: CategoriesRequest):retrofit2.Response<CategoriesResponse>
    @POST("/mpesapayments//")
    suspend fun payments(@Body paymentRequest: PaymentRequest):retrofit2.Response<PaymentResponse>

}
