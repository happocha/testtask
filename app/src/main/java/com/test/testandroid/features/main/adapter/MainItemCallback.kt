package com.test.testandroid.features.main.adapter

import androidx.recyclerview.widget.DiffUtil
import com.test.testandroid.features.main.MainViewData

class MainItemCallback : DiffUtil.ItemCallback<MainViewData>() {

    override fun areItemsTheSame(oldItem: MainViewData, newItem: MainViewData) =
        when {
            oldItem is MainViewData.Product &&
                    newItem is MainViewData.Product -> {
                oldItem.id == newItem.id
            }
            oldItem is MainViewData.Category &&
                    newItem is MainViewData.Category -> {
                oldItem.categoryId == newItem.categoryId
            }
            else -> false
        }

    override fun areContentsTheSame(oldItem: MainViewData, newItem: MainViewData) =
        when {
            oldItem is MainViewData.Product &&
                    newItem is MainViewData.Product -> {
                oldItem.name == newItem.name &&
                        oldItem.imageUrl == newItem.imageUrl &&
                        oldItem.count == newItem.count
            }
            oldItem is MainViewData.Category &&
                    newItem is MainViewData.Category -> {
                oldItem.categoryName == newItem.categoryName
            }
            else -> false
        }

}
