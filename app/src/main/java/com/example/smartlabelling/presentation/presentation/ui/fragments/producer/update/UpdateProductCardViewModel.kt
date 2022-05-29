package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.update

import androidx.lifecycle.ViewModel
import com.example.domain.use_cases.UpdateProductUseCase
import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.presentation.models.ProductUI
import com.example.smartlabelling.presentation.presentation.models.toProductUI
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class UpdateProductCardViewModel @Inject constructor(
    private val updateProductUseCase: UpdateProductUseCase
) : BaseViewModel(){

    private val _productUpdateState = MutableUIStateFlow<ProductUI>()
    val productDetailState = _productUpdateState.asStateFlow()

    fun updateProduct(objectId: String) {
        updateProductUseCase(objectId).collectRequest(_productUpdateState) { it.toProductUI() }
    }
}