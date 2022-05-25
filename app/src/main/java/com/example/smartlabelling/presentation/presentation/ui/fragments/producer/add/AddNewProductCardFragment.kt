package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.add

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentAddNewProductCardBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddNewProductCardFragment(
) : BaseFragment<AddNewProductCardViewModel, FragmentAddNewProductCardBinding>(
    R.layout.fragment_add_new_product_card
) {

    override val binding by viewBinding(FragmentAddNewProductCardBinding::bind)
    override val viewModel: AddNewProductCardViewModel by viewModels()

}