package com.example.domain.use_cases

import com.example.domain.repository.ProductRepository
import javax.inject.Inject

class FetchProductByQRUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    operator fun invoke(objectId: String) = productRepository.fetchProduct(objectId)
}