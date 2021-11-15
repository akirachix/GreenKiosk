package com.example.greenkiosk.Repository

import com.example.greenkiosk.Models.CategoriesRequest
import com.example.greenkiosk.Models.CategoriesResponse
import com.example.greenkiosk.Models.SignupRequest
import com.example.greenkiosk.Models.SignupResponse
import com.example.greenkiosk.api.ApiClient
import com.example.greenkiosk.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class CategoryRepository {

    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun categories(CategoriesRequest:CategoriesRequest):
            Response<CategoriesResponse> =
        withContext(Dispatchers.IO) {
            var resp = apiInterface.categories(CategoriesRequest)
            return@withContext resp
        }
}