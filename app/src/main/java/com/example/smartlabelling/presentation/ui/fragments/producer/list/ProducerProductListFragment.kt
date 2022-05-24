package com.example.smartlabelling.presentation.ui.fragments.producer.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentProducerProductListBinding
import com.example.smartlabelling.presentation.adapters.ProductsAdapter
import com.example.smartlabelling.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.ui.extensions.showToastShort
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProducerProductListFragment : BaseFragment<ProducerProductListViewModel, FragmentProducerProductListBinding>(
    R.layout.fragment_producer_product_list
) {
    override val viewModel: ProducerProductListViewModel by activityViewModels()
    override val binding by viewBinding(FragmentProducerProductListBinding::bind)

    private val productsAdapter = ProductsAdapter(
        this::onItemClick,
        this::onAddNewClicked,
    )

    override fun initialize() = with(binding) {
        setupListAdapter()
    }

    private fun setupListAdapter() = with(binding.recyclerActiveProducts) {
        this.adapter = productsAdapter
        layoutManager = LinearLayoutManager(context)
    }

    override fun setupRequests() {
        viewModel.fetchProducts()
    }

    override fun setupSubscribers() {
        subscribeToProductsState()
    }

    private fun onAddNewClicked() {
        findNavController().navigate(
            ProducerProductListFragmentDirections.actionProducerProductListFragmentToAddNewProductCardFragment()
        )
    }

    private fun onItemClick(id: Int) {
        findNavController().navigate(
            ProducerProductListFragmentDirections.actionProducerProductListFragmentToUpdateProductCardFragment(
                id= id)
        )
    }

    private fun subscribeToProductsState() = with(binding) {
        viewModel.productsListState.collectUIState(
            onError = {
                showToastShort(it)
            },
            onSuccess = {
                productsAdapter.submitList(it)
            }
        )
    }
}
