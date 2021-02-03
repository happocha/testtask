package com.test.testandroid.features.main.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.test.testandroid.loadImage
import com.test.testandroid.models.Product
import kotlinx.android.synthetic.main.product_main_holder.view.*

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(product: Product) = with(itemView) {
        loadImage(context, productImageView, product.imageUrl)
        productNameTextView.text = product.name
        productCountTextView.text = product.count.toString()

        plusButton.setOnClickListener {
            TODO("not implemented")
        }

        minusButton.setOnClickListener {
            TODO("not implemented")
        }

        addToBasketButton.setOnClickListener {
            TODO("not implemented")
        }
    }
}