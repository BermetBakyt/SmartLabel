package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.list

import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.presentation.models.ProductUI
import com.example.smartlabelling.presentation.presentation.models.toProductUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ProducerProductListViewModel @Inject constructor(
    private val fetchProductListUseCase: com.example.domain.use_cases.FetchProductListUseCase
) : BaseViewModel() {

    private val _productsListState = MutableUIStateFlow<List<ProductUI>>()
    val productsListState = _productsListState.asStateFlow()

    fun fetchProducts() {
        fetchProductListUseCase().collectRequest(_productsListState) { data ->
            data.map {
                it.toProductUI() } }
    }
}