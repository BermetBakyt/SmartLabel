package com.example.smartlabelling.presentation.presentation.ui.fragments.producer.list

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentProducerProductListBinding
import com.example.smartlabelling.presentation.presentation.ui.adapters.ProductsAdapter
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.extensions.showToastShort
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProducerProductListFragment : BaseFragment<ProducerProductListViewModel, FragmentProducerProductListBinding>(
    R.layout.fragment_producer_product_list
) {
    override val viewModel: com.example.smartlabelling.presentation.presentation.ui.fragments.producer.list.ProducerProductListViewModel by activityViewModels()
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
