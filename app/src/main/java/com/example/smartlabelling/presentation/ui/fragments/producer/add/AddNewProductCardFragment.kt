package com.example.smartlabelling.presentation.ui.fragments.producer.add

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
import com.example.smartlabelling.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.ui.fragments.user.product_detail.ProductDetailsFragment

class AddNewProductCardFragment(
) : BaseFragment<AddNewProductCardViewModel, FragmentAddNewProductCardBinding>(
    R.layout.fragment_add_new_product_card
) {

    override val binding by viewBinding(FragmentAddNewProductCardBinding::bind)
    override val viewModel: AddNewProductCardViewModel by viewModels()

}