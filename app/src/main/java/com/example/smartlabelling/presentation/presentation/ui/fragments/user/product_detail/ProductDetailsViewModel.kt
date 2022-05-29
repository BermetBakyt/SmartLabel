package com.example.smartlabelling.presentation.presentation.ui.fragments.user.product_detail

import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.presentation.models.ProductUI
import com.example.smartlabelling.presentation.presentation.models.toProductUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ProductDetailsViewModel @Inject constructor(
    private val fetchProductByIdUseCase: com.example.domain.use_cases.FetchProductByQRUseCase
) : BaseViewModel() {

    private val _productDetailState = MutableUIStateFlow<ProductUI>()
    val productDetailState = _productDetailState.asStateFlow()

    fun fetchProductById(objectId: String) {
        fetchProductByIdUseCase(objectId).collectRequest(_productDetailState) { it.toProductUI() }
    }
}