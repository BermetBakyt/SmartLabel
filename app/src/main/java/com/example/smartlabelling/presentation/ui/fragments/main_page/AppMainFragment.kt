package com.example.smartlabelling.presentation.ui.fragments.main_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smartlabelling.R

class AppMainFragment : Fragment() {

    companion object {
        fun newInstance() = AppMainFragment()
    }

    private lateinit var viewModel: AppMainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_app_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AppMainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}