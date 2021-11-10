package com.example.greenkiosk.Repository

import com.example.greenkiosk.Models.ProductRequest
import com.example.greenkiosk.api.ApiClient
import com.example.greenkiosk.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun updateProduct(productRequest: ProductRequest): Unit =
        withContext(Dispatchers.IO) withContextresp@{
            var resp = apiInterface.updateProduct(productRequest)
            return@withContextresp
        }
}
