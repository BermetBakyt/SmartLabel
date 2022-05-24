package com.example.smartlabelling.data.remote.services

import ProductDto
import com.example.smartlabelling.data.remote.dto.ProductResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ProductServiceApi {
    @GET("data/product/{objectId}")
    suspend fun fetchProduct(@Path("objectId") id: Int): ProductDto

    @GET("data/product/")
    suspend fun fetchProducts() : ProductResponse<ProductDto>
}