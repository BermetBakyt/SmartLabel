package com.example.smartlabelling.data.repository

import com.example.smartlabelling.data.remote.services.ProductServiceApi
import com.example.smartlabelling.domain.repository.ProductRepository
import toProduct
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val service: ProductServiceApi
) : BaseRepository(), ProductRepository {

    override fun fetchProducts() = doRequest {
       service.fetchProducts().results.map { it.toProduct() }
    }

    override fun fetchProduct(id: Int) = doRequest {
        service.fetchProduct(id).toProduct()
    }
}
