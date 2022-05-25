package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.producer_sign_in

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentAddNewProductCardBinding
import com.example.smartlabelling.databinding.FragmentProducerLoginBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.ui.fragments.producer.add.AddNewProductCardViewModel

class ProducerSignInFragment : BaseFragment<ProducerSignInViewModel, FragmentProducerLoginBinding>(
    R.layout.fragment_producer_login
) {

    override val binding by viewBinding(FragmentProducerLoginBinding::bind)
    override val viewModel: ProducerSignInViewModel by viewModels()
}