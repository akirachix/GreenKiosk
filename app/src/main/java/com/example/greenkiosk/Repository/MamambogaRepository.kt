package com.example.greenkiosk.Repository

import com.example.greenkiosk.Models.MamambogaSignupRequest
import com.example.greenkiosk.Models.MamambogaSignupResponse
import com.example.greenkiosk.api.ApiClient
import com.example.greenkiosk.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class MamambogaRepository {

   var apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun signupMamamboga(MamambogaSignupRequest: MamambogaSignupRequest):
            Response<MamambogaSignupResponse> =
       withContext(Dispatchers.IO) {
            var resp = apiInterface.mamaMbogaSignup(MamambogaSignupRequest)
            return@withContext resp
        }

}
