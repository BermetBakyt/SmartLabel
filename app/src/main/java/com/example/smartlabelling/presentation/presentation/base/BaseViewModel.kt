package com.example.smartlabelling.presentation.presentation.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartlabelling.presentation.presentation.ui.state.UIState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

open class BaseViewModel : ViewModel() {

    //Creates [MutableStateFlow] with [UIState] and the given initial state [UIState.Idle]
    @Suppress("FunctionName")
    protected fun <T> MutableUIStateFlow() = MutableStateFlow<UIState<T>>(UIState.Idle())

    // Collect network request and return [UIState] depending request result

    protected fun <T, S> Flow<com.example.domain.Either<String, T>>.collectRequest(
        state: MutableStateFlow<UIState<S>>,
        mappedData:  (T) -> S
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            state.value = UIState.Loading()
            this@collectRequest.collect {
                when (it) {
                    is com.example.domain.Either.Left -> state.value = UIState.Error(it.value)
                    is com.example.domain.Either.Right -> state.value = UIState.Success(mappedData(it.value))
                }
            }
        }
    }
}