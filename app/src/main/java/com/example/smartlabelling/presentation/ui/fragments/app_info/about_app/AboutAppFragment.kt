package com.example.smartlabelling.presentation.ui.fragments.app_info.about_app

import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentAboutAppBinding
import com.example.smartlabelling.presentation.base.BaseFragment

class AboutAppFragment : BaseFragment<AboutAppViewModel, FragmentAboutAppBinding>(
    R.layout.fragment_about_app
){
    override val viewModel: AboutAppViewModel by activityViewModels()
    override val binding by viewBinding(FragmentAboutAppBinding::bind)
}