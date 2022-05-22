package com.example.smartlabelling.presentation.ui.fragments.producer.update

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smartlabelling.R

class UpdateProductCardFragment : Fragment() {

    companion object {
        fun newInstance() = UpdateProductCardFragment()
    }

    private lateinit var viewModel: UpdateProductCardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_update_product_card, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UpdateProductCardViewModel::class.java)
        // TODO: Use the ViewModel
    }

}