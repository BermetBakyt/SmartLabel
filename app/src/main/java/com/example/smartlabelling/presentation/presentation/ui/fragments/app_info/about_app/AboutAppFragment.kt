package com.example.smartlabelling.presentation.presentation.ui.fragments.app_info.about_app

import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentAboutAppBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutAppFragment : BaseFragment<BaseViewModel, FragmentAboutAppBinding>(
    R.layout.fragment_about_app
){
    override val viewModel: BaseViewModel by activityViewModels()
    override val binding by viewBinding(FragmentAboutAppBinding::bind)
}