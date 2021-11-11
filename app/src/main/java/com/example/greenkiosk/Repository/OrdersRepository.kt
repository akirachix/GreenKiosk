package com.example.greenkiosk.Repository

import com.example.greenkiosk.Models.OrdersRequest
import com.example.greenkiosk.Models.OrdersResponse
import com.example.greenkiosk.api.ApiClient
import com.example.greenkiosk.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class OrdersRepository {

    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun orders(OrdersRequest:OrdersRequest):
            Response<OrdersResponse> =
        withContext(Dispatchers.IO){
            var resp=apiInterface.orders(OrdersRequest)
            return@withContext resp
        }


}