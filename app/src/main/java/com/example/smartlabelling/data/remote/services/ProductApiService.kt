package com.example.smartlabelling.data.remote.services

import ProductDto
import com.example.smartlabelling.data.remote.dto.ProductApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductServiceApi {
    @GET("data/product")
    suspend fun fetchProduct(@Path("id") id: Int): ProductDto

    @GET("")
    suspend fun fetchProducts() : ProductApiResponse<ProductDto>
}