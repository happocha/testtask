package com.test.testandroid.mainAct.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.test.testandroid.loadImage
import com.test.testandroid.mainAct.data.Product
import kotlinx.android.synthetic.main.product_main_holder.view.*

class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(product: Product) = with(itemView){
        loadImage(context, productImageView, product.productImg)
        productNameTextView.text = product.productName
        productCountTextView.text = product.productCount.toString()

        plusButton.setOnClickListener {

        }

        minusButton.setOnClickListener{

        }

        addToBasketButton.setOnClickListener {

        }
    }
}