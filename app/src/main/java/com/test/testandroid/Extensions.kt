package com.test.testandroid

import android.content.Context
import android.widget.ImageView
import com.squareup.picasso.Picasso

fun loadImage(context : Context, imageView: ImageView, address : String){
    Picasso.with(context).load("https://photos.5-delivery.ru/small$address").into(imageView)
}