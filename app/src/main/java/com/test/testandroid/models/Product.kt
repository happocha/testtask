package com.test.testandroid.models

data class Product(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val categoryId: Int,
    var count: Int = 0
)