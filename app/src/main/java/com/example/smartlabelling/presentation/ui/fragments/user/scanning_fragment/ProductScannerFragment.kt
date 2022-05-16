package com.example.smartlabelling.presentation.ui.fragments.user.scanning_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentProductDetailsBinding
import com.example.smartlabelling.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.ui.fragments.user.product_detail.ProductDetailsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductScannerFragment(
) : BaseFragment<ProductDetailsViewModel, FragmentProductDetailsBinding>(
    R.layout.fragment_product_details
) {
    override val binding by viewBinding(FragmentProductDetailsBinding::bind)
    override val viewModel: ProductDetailsViewModel by viewModels()
    private val args:  by navArgs()


}