package com.test.testandroid

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class CommonViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {

    protected var model: T? = null

    abstract fun onBind(position: Int, model: T)

    fun bindHolder(position: Int, item: Any) {
        (item as T).apply {
            model = this
            onBind(position, this)
        }
    }
}
