package com.example.smartlabelling.presentation.ui.fragments.producer.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartlabelling.domain.use_cases.FetchProductByQRUseCase
import com.example.smartlabelling.domain.use_cases.FetchProductListUseCase
import com.example.smartlabelling.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.ui.models.ProductUI
import com.example.smartlabelling.presentation.ui.models.toProductUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ProducerProductListViewModel @Inject constructor(
    private val fetchProductListUseCase: FetchProductListUseCase
) : BaseViewModel() {

    private val _productsListState = MutableUIStateFlow<List<ProductUI>>()
    val productsListState = _productsListState.asStateFlow()

    fun fetchProducts() {
        fetchProductListUseCase().collectRequest(_productsListState) { data ->
            data.map {
                it.toProductUI() } }
    }
}