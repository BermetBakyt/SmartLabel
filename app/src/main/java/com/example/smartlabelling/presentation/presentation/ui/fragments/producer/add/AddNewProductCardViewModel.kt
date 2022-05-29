package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.add

import com.example.domain.use_cases.AddNewProductCardUseCase
import com.example.domain.use_cases.UpdateProductUseCase
import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import com.example.smartlabelling.presentation.presentation.models.ProductUI
import com.example.smartlabelling.presentation.presentation.models.toProductUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AddNewProductCardViewModel @Inject constructor(
    private val addNewProductCardUseCase: AddNewProductCardUseCase
) : BaseViewModel() {

    private val _addNewCardState = MutableUIStateFlow<ProductUI>()
    val addNewCardState = _addNewCardState.asStateFlow()

    fun addNewProductCard() {
        addNewProductCardUseCase().collectRequest(_addNewCardState) { it.toProductUI()}
    }
}