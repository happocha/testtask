package com.test.testandroid.data

data class Product(
    val productName: String,
    val productImg: String,
    val productId: Int,
    val parentId: Int,
    var productCount: Int = 0
)