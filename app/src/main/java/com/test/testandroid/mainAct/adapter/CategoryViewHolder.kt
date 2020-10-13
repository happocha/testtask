package com.test.testandroid.mainAct.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.test.testandroid.mainAct.data.Category
import kotlinx.android.synthetic.main.category_main_holder.view.*

class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {


    fun bind(category: Category) = with(itemView){
        categoryNameTextView.text = category.categoryName
    }
}