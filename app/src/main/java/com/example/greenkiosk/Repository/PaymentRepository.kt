package com.example.greenkiosk.Repository

import com.example.greenkiosk.Models.PaymentRequest
import com.example.greenkiosk.Models.PaymentResponse
import com.example.greenkiosk.api.ApiClient
import com.example.greenkiosk.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class PaymentRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun payments(PaymentRequest:PaymentRequest):
            Response<PaymentResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.payments(PaymentRequest)
            return@withContext resp
        }
}