package com.example.smartlabelling.presentation.ui.fragments.producer.product.producer_register

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smartlabelling.R

class ProducerRegisterFragment : Fragment() {

    companion object {
        fun newInstance() = ProducerRegisterFragment()
    }

    private lateinit var viewModel: ProducerRegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_producer_register, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProducerRegisterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}