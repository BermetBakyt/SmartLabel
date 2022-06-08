package com.example.smartlabelling.presentation.presentation.base

import androidx.recyclerview.widget.DiffUtil

interface IBaseDiffModel {
    val objectId: String
    override fun equals(other: Any?) : Boolean
}

class BaseDiffUtilCallback<T : IBaseDiffModel> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.objectId == newItem.objectId
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }
}