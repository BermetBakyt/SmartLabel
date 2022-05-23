package com.example.smartlabelling.data.remote

import com.example.smartlabelling.BuildConfig.BASE_URL
import com.example.smartlabelling.data.remote.interceptors.LoggingInterceptor
import com.example.smartlabelling.data.remote.services.ProductServiceApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RetrofitClient @Inject constructor() {

    private val okHttpClient: OkHttpClient = OkHttpClient()
        .newBuilder()
        .addInterceptor(LoggingInterceptor().provideLoggingInterceptor())
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val provideRetrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun provideproductApiService(): ProductServiceApi = provideRetrofit
        .create(ProductServiceApi::class.java)
}
