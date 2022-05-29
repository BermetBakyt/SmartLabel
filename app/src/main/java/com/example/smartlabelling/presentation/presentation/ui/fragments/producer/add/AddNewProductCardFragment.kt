package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.add

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentAddNewProductCardBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.extensions.showToastShort
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddNewProductCardFragment(
) : BaseFragment<AddNewProductCardViewModel, FragmentAddNewProductCardBinding>(
    R.layout.fragment_add_new_product_card
) {

    override val binding by viewBinding(FragmentAddNewProductCardBinding::bind)
    override val viewModel: AddNewProductCardViewModel by viewModels()

    override fun setupListeners() {
        binding.btnSaveChanges.setOnClickListener {
            viewModel.addNewProductCard()
        }
    }

    override fun setupSubscribers() = with(binding) {
        viewModel.addNewCardState.collectUIState(
            onError = {
                showToastShort(it)
            },
            onSuccess = {
                editProductName.setText(it.productName)
                editExpiryDate.setText(it.expiryDate)
                editProductionDate.setText(it.productionDate)
                editProductType.setText(it.category)
                editProductIngredients.setText(it.ingredients.toString())
                editProductSize.setText(it.packagingSize)
                editCountryProducedIn.setText(it.manifacturerCountry)
                editConsumptionRestrictions.setText(it.consumptionInfo.toString())
            }
        )
    }
}
