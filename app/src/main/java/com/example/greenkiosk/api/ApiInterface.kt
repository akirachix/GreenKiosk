package com.example.greenkiosk.api

import com.example.greenkiosk.Models.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET("posts")
    fun getPosts(): Call<List<Post>>

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

data class Post(var userId: Int, var id: Int, var title: String, var
body: String)

