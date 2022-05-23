package com.example.smartlabelling.domain.use_cases

import com.example.smartlabelling.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchProductListUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    operator fun invoke() = productRepository.fetchProducts()
}