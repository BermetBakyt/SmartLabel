package com.example.smartlabelling.presentation.presentation.ui.fragments.app_info.privacy_policy

import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentPrivacyPolicyBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrivacyPolicyFragment: BaseFragment<BaseViewModel, FragmentPrivacyPolicyBinding>(
    R.layout.fragment_privacy_policy
) {
    override val viewModel: BaseViewModel by activityViewModels()
    override val binding by viewBinding(FragmentPrivacyPolicyBinding::bind)

}