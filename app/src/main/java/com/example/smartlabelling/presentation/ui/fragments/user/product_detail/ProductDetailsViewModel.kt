package com.example.smartlabelling.presentation.ui.fragments.user.product_detail

import androidx.lifecycle.ViewModel
import com.example.smartlabelling.domain.use_cases.FetchProductByQRUseCase
import com.example.smartlabelling.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.ui.models.ProductUI
import com.example.smartlabelling.presentation.ui.models.toProductUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ProductDetailsViewModel @Inject constructor(
    private val fetchProductByIdUseCase: FetchProductByQRUseCase
) : BaseViewModel() {

    private val _productDetailState = MutableUIStateFlow<ProductUI>()
    val productDetailState = _productDetailState.asStateFlow()

    fun fetchProductById(id: Int) {
        fetchProductByIdUseCase(id).collectRequest(_productDetailState) { it.toProductUI() }
    }
}