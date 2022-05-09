package com.example.smartlabelling.domain.use_cases

import com.example.smartlabelling.domain.repository.ProductDetailRepository
import javax.inject.Inject

class FetchProductByQRUseCase @Inject constructor(private val productDetailRepository: ProductDetailRepository) {
    operator fun invoke(id: Int) = productDetailRepository.fetchProduct(id)
}