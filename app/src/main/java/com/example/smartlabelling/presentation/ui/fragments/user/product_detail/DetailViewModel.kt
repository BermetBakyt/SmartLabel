package com.example.smartlabelling.presentation.ui.fragments.user.product_detail

import com.example.smartlabelling.domain.use_cases.FetchProductByQRUseCase
import com.example.smartlabelling.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.ui.models.ProductUI
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class DetailViewModel@Inject constructor(
    private val fetchCharacterByIdUseCase: FetchProductByQRUseCase
) : BaseViewModel() {

    private val _characterDetailState = MutableUIStateFlow<ProductUI>()
    val characterDetailState = _characterDetailState.asStateFlow()

    fun fetchCharacterDetail(id: Int) {
        fetchCharacterByIdUseCase(id).collectRequest(_characterDetailState) { it.toUI()}
    }