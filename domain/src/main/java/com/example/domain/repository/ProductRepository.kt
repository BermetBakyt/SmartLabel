package com.example.domain.repository

import com.example.domain.Either
import com.example.domain.models.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun fetchProducts(): Flow<Either<String, List<Product>>>

    fun fetchProduct(objectId: String) : Flow<Either<String, Product>>

    fun updateProduct(objectId: String) :Flow<Either<String, Product>>

    fun addNewProduct() :Flow<Either<String, Product>>
}