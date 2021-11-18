package com.example.greenkiosk.MamaMboga.api

import com.example.greenkiosk.MamaMboga.models.MamambogaLoginRequest
import com.example.greenkiosk.MamaMboga.models.MamambogaLoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST("/mamamboga/login")
    suspend fun mamaMbogaLogin(@Body mamambogaLoginRequest: MamambogaLoginRequest): Response<MamambogaLoginResponse>

    @GET("")
    suspend fun getMamaMbogaLoginResponse(@Header("Authorization") token: String): Response<MamambogaLoginRequest>

}