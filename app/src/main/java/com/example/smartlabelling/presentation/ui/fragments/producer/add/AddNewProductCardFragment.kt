package com.example.smartlabelling.presentation.ui.fragments.producer.add

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smartlabelling.R

class AddNewProductCardFragment : Fragment() {

    companion object {
        fun newInstance() = AddNewProductCardFragment()
    }

    private lateinit var viewModel: AddNewProductCardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_new_product_card, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddNewProductCardViewModel::class.java)
        // TODO: Use the ViewModel
    }

}