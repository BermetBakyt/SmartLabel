package com.example.domain.use_cases

import com.example.domain.repository.ProductRepository
import javax.inject.Inject

class UpdateProductUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    operator fun invoke(objectId: String) = repository.updateProduct(objectId)
}