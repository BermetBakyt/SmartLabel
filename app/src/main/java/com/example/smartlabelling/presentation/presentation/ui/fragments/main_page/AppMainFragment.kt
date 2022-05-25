package com.example.smartlabelling.presentation.presentation.ui.fragments.main_page

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentAppMainBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AppMainFragment : BaseFragment<BaseViewModel, FragmentAppMainBinding>(
    R.layout.fragment_app_main
) {
    override val viewModel: BaseViewModel by activityViewModels()
    override val binding by viewBinding(FragmentAppMainBinding::bind)

    override fun setupListeners() {
        onProducerButtonClicked()
        onUserButtonClicked()
    }

    private fun onUserButtonClicked() {
        findNavController().navigate(
            AppMainFragmentDirections.actionUserMainFragmentToProductScannerFragment()
        )
    }

    private fun onProducerButtonClicked() {
        findNavController().navigate(
            AppMainFragmentDirections.actionUserMainFragmentToProducerRegisterFragment()
        )
    }
}