package com.test.testandroid.features.main

sealed class MainViewData {

    data class Category(
        val categoryId: Int,
        val categoryName: String
    ) : MainViewData()

    data class Product(
        val id: Int,
        val name: String,
        val imageUrl: String,
        val count: Int = 0
    ) : MainViewData()
}
