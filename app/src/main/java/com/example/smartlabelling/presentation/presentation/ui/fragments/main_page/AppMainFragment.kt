package com.example.smartlabelling.presentation.presentation.ui.fragments.main_page

import android.Manifest
import android.content.pm.PackageManager
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentAppMainBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AppMainFragment : BaseFragment<BaseViewModel, FragmentAppMainBinding>(
    R.layout.fragment_app_main
) {
    override val viewModel: BaseViewModel by activityViewModels()
    override val binding by viewBinding(FragmentAppMainBinding::bind)

    override fun setupListeners() {
        onProducerButtonClicked()
        onUserButtonClicked()
    }

    private fun onUserButtonClicked() {
        val requestPermissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                findNavController().navigate(
                    AppMainFragmentDirections.actionUserMainFragmentToProductScannerFragment()
                )
            }

        }
        when {
            ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_GRANTED -> {
                binding.btnUserIn.setOnClickListener {
                    findNavController().navigate(
                        AppMainFragmentDirections.actionUserMainFragmentToProductScannerFragment()
                    )
                }
            }

            shouldShowRequestPermissionRationale(Manifest.permission.CAMERA) -> {

            }
            else -> {
                requestPermissionLauncher.launch(
                    Manifest.permission.CAMERA
                )
            }
        }
    }

    private fun onProducerButtonClicked() {
        binding.btnProducerIn.setOnClickListener {
            findNavController().navigate(
                AppMainFragmentDirections.actionUserMainFragmentToProducerRegisterFragment()
            )
        }
    }
}