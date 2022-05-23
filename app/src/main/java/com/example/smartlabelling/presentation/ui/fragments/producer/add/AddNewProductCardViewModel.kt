package com.example.smartlabelling.presentation.ui.fragments.producer.add

import androidx.lifecycle.ViewModel
import com.example.smartlabelling.domain.use_cases.FetchProductByQRUseCase
import com.example.smartlabelling.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.ui.models.ProductUI
import com.example.smartlabelling.presentation.ui.models.toProductUI
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class AddNewProductCardViewModel @Inject constructor(
    private val fetchProductByQRUseCase: FetchProductByQRUseCase
) : BaseViewModel() {

    private val _productDetailState = MutableUIStateFlow<ProductUI>()
    val productDetailState = _productDetailState.asStateFlow()

    fun fetchProductDetail(id: Int) {
        fetchProductByQRUseCase(id).collectRequest(_productDetailState) { it.toProductUI()}
    }
}