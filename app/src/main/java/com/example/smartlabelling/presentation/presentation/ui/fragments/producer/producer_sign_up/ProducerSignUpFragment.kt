package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.producer_sign_up

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentProducerRegisterBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment

class ProducerSignUpFragment :
    BaseFragment<ProducerSignUpViewModel, FragmentProducerRegisterBinding>(
        R.layout.fragment_producer_register
    ) {

    override val binding by viewBinding(FragmentProducerRegisterBinding::bind)
    override val viewModel: ProducerSignUpViewModel by viewModels()

    override fun setupListeners() = with(binding) {
            btnRegister.setOnClickListener {
            //if (editTxtEmailRegister.setText() || editTxtPasswordRegister.setText()) {
            findNavController().navigate(
                ProducerSignUpFragmentDirections.actionProducerSignUpFragmentToProducerProductListFragment()
            )
        }

        btnEnterLogin.setOnClickListener {
            findNavController().navigate(
                ProducerSignUpFragmentDirections.actionProducerSignUpFragmentToProducerLoginFragment()
            )
        }
    }
}


