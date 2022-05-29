package com.example.smartlabelling.presentation.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.smartlabelling.databinding.ItemRecyclerProductBinding
import com.example.smartlabelling.presentation.presentation.base.BaseDiffUtilCallback
import com.example.smartlabelling.presentation.presentation.models.ProductUI

class ProductsAdapter(
    val onItemClick: (id: Int) -> Unit,
) : ListAdapter<ProductUI, ProductsAdapter.ProductViewHolder>(BaseDiffUtilCallback()) {

    inner class ProductViewHolder(
        private val binding: ItemRecyclerProductBinding
    ): RecyclerView.ViewHolder(binding.root) {

        init {
            with(binding) {

                root.setOnClickListener{
                    with(getItem(absoluteAdapterPosition)!!) {
                        onItemClick(id)
                    }
                }
            }
        }

        fun bind(item: ProductUI) {
            binding.apply {
                itemProductName.text = item.productName
                itemProductSeriesNumber.text = item.seriesNumber.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(ItemRecyclerProductBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}