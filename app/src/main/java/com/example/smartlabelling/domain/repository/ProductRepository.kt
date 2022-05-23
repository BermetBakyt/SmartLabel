package com.example.smartlabelling.domain.repository

import com.example.smartlabelling.domain.Either
import com.example.smartlabelling.domain.models.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun fetchProducts(): Flow<Either<String, List<Product>>>

    fun fetchProduct(id: Int) : Flow<Either<String, Product>>
}