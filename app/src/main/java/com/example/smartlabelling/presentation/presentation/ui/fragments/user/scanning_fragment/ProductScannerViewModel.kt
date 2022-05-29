package com.example.smartlabelling.presentation.presentation.ui.fragments.user.scanning_fragment

import com.example.domain.use_cases.FetchProductByQRUseCase
import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.presentation.models.ProductUI
import com.example.smartlabelling.presentation.presentation.models.toProductUI
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class ProductScannerViewModel @Inject constructor(
    private val fetchProductByQRUseCase: FetchProductByQRUseCase
) : BaseViewModel() {

    private val _productDetailState = MutableUIStateFlow<ProductUI>()
    val productDetailState = _productDetailState.asStateFlow()

    fun fetchProductById(objectId: String) {
        fetchProductByQRUseCase(objectId).collectRequest(_productDetailState) { it.toProductUI() }

    }

}