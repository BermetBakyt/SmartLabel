package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.producer_sign_in

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentProducerLoginBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.extensions.showToastLong
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProducerSignInFragment : BaseFragment<ProducerSignInViewModel, FragmentProducerLoginBinding>(
    R.layout.fragment_producer_login
) {

    override val binding by viewBinding(FragmentProducerLoginBinding::bind)
    override val viewModel: ProducerSignInViewModel by viewModels()

    override fun setupListeners() = with (binding) {

        binding.btnEnterRegister.setOnClickListener{
            findNavController().navigate(
                ProducerSignInFragmentDirections.actionProducerLoginFragmentToProducerSignUpFragment()
            )
        }

        binding.btnLogin.setOnClickListener {
            if (editTxtCompanyName.text.toString().isEmpty() || editTxtEmailLogin.text.isNullOrEmpty() || editTxtPasswordLogin.text.isNullOrEmpty()) {
                showToastLong("Please fill the required the fields!")
            } else {
                findNavController().navigate(
                    ProducerSignInFragmentDirections.actionProducerLoginFragmentToProducerProductListFragment()
                )
            }

        }
    }

}