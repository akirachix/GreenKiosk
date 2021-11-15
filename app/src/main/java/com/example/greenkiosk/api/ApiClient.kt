package com.example.greenkiosk.api

import android.provider.Settings.Global.getString
import com.example.greenkiosk.R
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    var retrofit = Retrofit.Builder()
        .baseUrl("http://13.244.243.129")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> buildApiClient(apiInterface: Class<T>): T {
        return retrofit.create(apiInterface)
    }
}