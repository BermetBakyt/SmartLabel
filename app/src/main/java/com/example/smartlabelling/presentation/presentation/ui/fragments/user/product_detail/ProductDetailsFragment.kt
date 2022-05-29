package com.example.smartlabelling.presentation.presentation.ui.fragments.user.product_detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentProductDetailsBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.extensions.showToastShort
import com.example.smartlabelling.presentation.presentation.models.ProductUI

class ProductDetailsFragment(
) : BaseFragment<ProductDetailsViewModel, FragmentProductDetailsBinding>(
    R.layout.fragment_product_details
) {

    override val binding by viewBinding(FragmentProductDetailsBinding::bind)
    override val viewModel: ProductDetailsViewModel by viewModels()
    private val args: ProductDetailsFragmentArgs by navArgs()

    override fun setupListeners() {
        binding.btnScan.setOnClickListener{
            findNavController().navigate(
                ProductDetailsFragmentDirections.actionProductDetailsFragmentToProductScannerFragment()
            )
        }
    }

    override fun setupRequests() {
        viewModel.fetchProductById(args.objectId)
    }
    override fun setupSubscribers() = with(binding){
        viewModel.productDetailState.collectUIState(
            allStates = {
                it.setupViewVisibility(groupProductDetail, productDataLoader)
            },
            onError = {
                showToastShort(it)
            },
            onSuccess = {
                tvNameField.text = it.productName
                tvProductionDateField.text = it.productionDate
                tvExpiryDateField.text = it.expiryDate
                tvIngredientsField.text = it.ingredients.toString()
                tvProductTypeField.text = it.category
                tvConsumptionRestrictionsField.text = it.consumptionInfo.toString()
                tvManifacturerCountryField.text = it.manifacturerCountry
                tvSizeVolumeField.text = it.packagingSize.toString()
            }
        )

    }
}
