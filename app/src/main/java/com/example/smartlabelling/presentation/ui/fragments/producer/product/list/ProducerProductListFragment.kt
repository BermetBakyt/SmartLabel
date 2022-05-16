package com.example.smartlabelling.presentation.ui.fragments.producer.product.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smartlabelling.R

class ProducerProductListFragment : Fragment() {

    companion object {
        fun newInstance() = ProducerProductListFragment()
    }

    private lateinit var viewModel: ProducerProductListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_producer_product_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProducerProductListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}