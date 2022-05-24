package com.example.smartlabelling.presentation.ui.fragments.app_info.privacy_policy

import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentPrivacyPolicyBinding
import com.example.smartlabelling.databinding.FragmentProducerProductListBinding
import com.example.smartlabelling.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.ui.fragments.producer.list.ProducerProductListViewModel

class PrivacyPolicyFragment: BaseFragment<PrivacyViewModel, FragmentPrivacyPolicyBinding>(
    R.layout.fragment_privacy_policy
) {
    override val viewModel: PrivacyViewModel by activityViewModels()
    override val binding by viewBinding(FragmentPrivacyPolicyBinding::bind)

}