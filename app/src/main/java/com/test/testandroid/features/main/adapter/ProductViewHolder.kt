package com.test.testandroid.features.main.adapter

import com.test.testandroid.CommonViewHolder
import com.test.testandroid.databinding.ProductMainHolderBinding
import com.test.testandroid.features.main.MainViewData
import com.test.testandroid.loadImage
import com.test.testandroid.showNow
import kotlinx.android.synthetic.main.product_main_holder.view.*

class ProductViewHolder(
    private val binding: ProductMainHolderBinding,
    private val callbacks: MainRecyclerAdapterCallbacks
) : CommonViewHolder<MainViewData.Product>(binding.root) {

    init {
        with(binding.root) {
            plusButton.setOnClickListener {
                model?.let {
                    callbacks.onPlusClicked(it.id)
                }
            }
            minusButton.setOnClickListener {
                model?.let {
                    callbacks.onMinusClicked(it.id)
                }
            }
            addToBasketButton.setOnClickListener {
                model?.let {
                    callbacks.onAddClicked(it.id)
                }
            }
        }
    }

    override fun onBind(position: Int, model: MainViewData.Product) {
        with(binding) {
            loadImage(root.context, productImageView, model.imageUrl)
            productCountTextView.text = model.count.toString()
            productNameTextView.text = model.name

            plusButton.showNow(model.count > 0)
            minusButton.showNow(model.count > 0)
            addToBasketButton.showNow(model.count <= 0)
            productCountTextView.showNow(model.count > 0)
        }
    }
}
