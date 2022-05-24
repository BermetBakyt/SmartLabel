package com.example.smartlabelling.presentation.ui.fragments.user.scanning_fragment

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.DecodeCallback
import com.example.smartlabelling.R
import com.example.smartlabelling.databinding.FragmentProductScannerBinding
import com.example.smartlabelling.presentation.base.BaseFragment
import com.example.smartlabelling.presentation.ui.extensions.showToastShort
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
        val activity = requireActivity()
        codeScanner = CodeScanner(activity, scannerView)
        codeScanner.decodeCallback = DecodeCallback {
            activity.runOnUiThread {
                showToastShort("$it")
            }
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

    private fun onCodeScanned(id: Int) {
        //var result = take the code from scanner { result ->
        findNavController().navigate(
            ProductScannerFragmentDirections.actionProductScannerFragmentToProductDetailsFragment(id)
        )
    }
}
