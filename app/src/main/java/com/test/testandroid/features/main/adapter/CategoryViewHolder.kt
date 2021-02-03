package com.test.testandroid.features.main.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.test.testandroid.models.Category
import kotlinx.android.synthetic.main.category_main_holder.view.*

class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(category: Category) = with(itemView) {
        categoryNameTextView.text = category.categoryName
    }
}