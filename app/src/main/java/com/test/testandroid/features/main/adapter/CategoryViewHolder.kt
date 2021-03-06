package com.test.testandroid.features.main.adapter

import com.test.testandroid.CommonViewHolder
import com.test.testandroid.databinding.CategoryMainHolderBinding
import com.test.testandroid.features.main.MainViewData

class CategoryViewHolder(
    private val binding: CategoryMainHolderBinding
) : CommonViewHolder<MainViewData.Category>(binding.root) {

    override fun onBind(position: Int, model: MainViewData.Category) {
        binding.categoryNameTextView.text = model.categoryName
    }
}
