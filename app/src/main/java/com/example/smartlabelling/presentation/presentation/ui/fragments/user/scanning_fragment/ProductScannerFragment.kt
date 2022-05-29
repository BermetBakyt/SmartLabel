package com.example.smartlabelling.presentation.presentation.ui.fragments.user.scanning_fragment

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.budiyev.android.codescanner.*
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentProductScannerBinding
import com.example.smartlabelling.presentation.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.presentation.extensions.showToastLong
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ProductScannerFragment(
) : BaseFragment<ProductScannerViewModel, FragmentProductScannerBinding>(
    R.layout.fragment_product_scanner
) {

    private lateinit var codeScanner: CodeScanner
    override val binding by viewBinding(FragmentProductScannerBinding::bind)
    override val viewModel: ProductScannerViewModel by viewModels()

    override fun initialize() = with(binding) {
        codeScanner = CodeScanner(requireContext(), scannerView)
        codeScanner.apply {
            camera = CodeScanner.CAMERA_BACK
            formats = CodeScanner.ALL_FORMATS
            autoFocusMode = AutoFocusMode.SAFE
            scanMode = ScanMode.SINGLE
            isAutoFocusEnabled = true
            isFlashEnabled = false

            decodeCallback = DecodeCallback { code ->
                code.text?.let {
                    findNavController().navigate(
                        ProductScannerFragmentDirections.actionProductScannerFragmentToProductDetailsFragment(it)
                    )
                }
            }
        }

        codeScanner.errorCallback = ErrorCallback {
            showToastLong("Camera initialization error: ${it.message}")
        }

        scannerView.setOnClickListener {
            codeScanner.startPreview()

        }
    }

    override fun onResume() {
        super.onResume()
        codeScanner.startPreview()
    }

    override fun onPause() {
        codeScanner.releaseResources()
        super.onPause()
    }

}
