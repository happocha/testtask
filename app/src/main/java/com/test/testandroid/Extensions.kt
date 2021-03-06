package com.test.testandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.LayoutRes
import com.squareup.picasso.Picasso

fun loadImage(context: Context, imageView: ImageView, address: String) {
    Picasso.with(context).load("https://photos.5-delivery.ru/small$address").into(imageView)
}

inline fun <reified T> ViewGroup.inflate(@LayoutRes layout: Int) =
    LayoutInflater.from(context).inflate(layout, this, false) as T

fun View.showNow(value: Boolean) {
    visibility = if (value) View.VISIBLE else View.INVISIBLE
}
