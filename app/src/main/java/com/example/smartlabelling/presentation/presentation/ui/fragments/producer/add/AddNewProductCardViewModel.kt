package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.add

import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.presentation.models.ProductUI
import com.example.smartlabelling.presentation.presentation.models.toProductUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AddNewProductCardViewModel @Inject constructor(
    private val fetchProductByQRUseCase: com.example.domain.use_cases.FetchProductByQRUseCase
) : BaseViewModel() {

    private val _productDetailState = MutableUIStateFlow<ProductUI>()
    val productDetailState = _productDetailState.asStateFlow()

    fun fetchProductDetail(id: Int) {
        fetchProductByQRUseCase(id).collectRequest(_productDetailState) { it.toProductUI()}
    }
}