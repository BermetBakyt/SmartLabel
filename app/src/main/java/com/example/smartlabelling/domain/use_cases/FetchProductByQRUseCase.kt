package com.example.smartlabelling.domain.use_cases

import com.example.smartlabelling.domain.repository.ProductRepository
import javax.inject.Inject

class FetchProductByQRUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    operator fun invoke(id: Int) = productRepository.fetchProduct(id)
}