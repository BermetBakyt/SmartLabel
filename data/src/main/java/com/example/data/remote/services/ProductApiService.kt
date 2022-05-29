package com.example.data.remote.services

import ProductDto
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ProductServiceApi {

    @GET("data/product/{objectId}")
    suspend fun fetchProduct(@Path("objectId") objectId: String) : ProductDto

    @GET("data/product/")
    suspend fun fetchProducts() : List<ProductDto>

    @POST("data/product/")
    suspend fun updateProduct(@Path("objectId") objectId: String) : ProductDto

    @POST("data/product/")
    suspend fun addNewProduct() : ProductDto
}