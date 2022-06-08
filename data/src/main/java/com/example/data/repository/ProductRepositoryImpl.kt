package com.example.data.repository

import com.example.data.remote.services.ProductServiceApi
import com.example.domain.repository.ProductRepository
import com.example.data.remote.dto.toProduct
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val service: ProductServiceApi
) : BaseRepository(), ProductRepository {

    override fun addNewProduct() = doRequest {
        service.addNewProduct().toProduct()
    }

    override fun updateProduct(objectId: String) = doRequest{
        service.updateProduct(objectId).toProduct()
    }

    override fun fetchProducts() = doRequest {
       service.fetchProducts().map { it.toProduct() }
    }

    override fun fetchProduct(objectId: String) = doRequest {
        service.fetchProduct(objectId).toProduct()
    }
}
