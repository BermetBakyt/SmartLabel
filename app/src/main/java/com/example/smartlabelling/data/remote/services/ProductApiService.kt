package com.example.smartlabelling.data.remote.services

import com.example.smartlabelling.data.remote.dto.ProductApiResponse
import com.example.smartlabelling.data.remote.dto.ProductDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductServiceApi {
    @GET("")
    suspend fun fetchProduct(@Path("id") id: Int): ProductDto

    @GET("")
    suspend fun fetchProducts() : ProductApiResponse<ProductDto>
}