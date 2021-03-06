package com.test.testandroid.features.main.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.test.testandroid.CommonViewHolder
import com.test.testandroid.R
import com.test.testandroid.databinding.CategoryMainHolderBinding
import com.test.testandroid.databinding.ProductMainHolderBinding
import com.test.testandroid.features.main.MainViewData
import com.test.testandroid.inflate

class MainRecyclerAdapter(
    private val callbacks: MainRecyclerAdapterCallbacks
) : ListAdapter<MainViewData, CommonViewHolder<out MainViewData>>(
    MainItemCallback()
) {

    companion object {
        const val VIEW_TYPE_CATEGORY = 1
        const val VIEW_TYPE_PRODUCT = 2
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is MainViewData.Product -> VIEW_TYPE_PRODUCT
            is MainViewData.Category -> VIEW_TYPE_CATEGORY
            else -> throw IllegalArgumentException("Unknown item type")
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CommonViewHolder<out MainViewData> {
        return when (viewType) {
            VIEW_TYPE_CATEGORY -> createCategoryViewHolder(parent)
            VIEW_TYPE_PRODUCT -> createProductViewHolder(parent)
            else -> throw IllegalArgumentException("Unknown item type")
        }
    }

    override fun onBindViewHolder(
        holder: CommonViewHolder<out MainViewData>,
        position: Int
    ) = holder.bindHolder(position, getItem(position))

    private fun createCategoryViewHolder(parent: ViewGroup) =
        CategoryViewHolder(CategoryMainHolderBinding.bind(parent.inflate(R.layout.category_main_holder)))

    private fun createProductViewHolder(parent: ViewGroup) =
        ProductViewHolder(
            ProductMainHolderBinding.bind(parent.inflate(R.layout.product_main_holder)),
            callbacks
        )

}