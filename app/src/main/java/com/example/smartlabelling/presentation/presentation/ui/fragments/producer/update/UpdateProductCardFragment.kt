package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.update

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentUpdateProductCardBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.extensions.showToastShort

class UpdateProductCardFragment :
    BaseFragment<UpdateProductCardViewModel, FragmentUpdateProductCardBinding>(
        R.layout.fragment_update_product_card
    ) {

    override val binding by viewBinding(FragmentUpdateProductCardBinding::bind)
    override val viewModel: UpdateProductCardViewModel by viewModels()
    private val args: UpdateProductCardFragmentArgs by navArgs()


    override fun setupSubscribers() = with(binding) {
        viewModel.productDetailState.collectUIState(
            onError = {
                showToastShort(it)
            },
            onSuccess = {
                editProductName.setText(it.productName)
                editExpiryDate.setText(it.expiryDate)
                editProductionDate.setText(it.productionDate)
                editProductIngredients.setText(setOf(it.ingredients).toString())
                editProductType.setText(it.category)
                editConsumptionRestrictions.setText(it.consumptionInfo.toString())
                editCountryProducedIn.setText(it.manifacturerCountry)
                editProductSize.setText(it.packagingSize.toString())
            }
        )
    }

    override fun setupListeners() {
        binding.btnSaveChanges.setOnClickListener {
            viewModel.updateProduct(args.objectId)
        }
    }

}