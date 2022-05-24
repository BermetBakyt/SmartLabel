package com.example.smartlabelling.presentation.ui.fragments.main_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentAboutAppBinding
import com.example.smartlabelling.databinding.FragmentAppMainBinding
import com.example.smartlabelling.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.ui.fragments.app_info.about_app.AboutAppViewModel

class AppMainFragment : BaseFragment<AppMainViewModel, FragmentAppMainBinding>(
    R.layout.fragment_app_main
) {
    override val viewModel: AppMainViewModel by activityViewModels()
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