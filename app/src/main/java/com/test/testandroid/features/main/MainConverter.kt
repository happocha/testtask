package com.test.testandroid.features.main

import com.test.testandroid.models.Category
import com.test.testandroid.models.Product
import javax.inject.Inject

class MainConverter @Inject constructor() {

    fun convert(categories: List<Category>, products: List<Product>): List<MainViewData> {
        val items = mutableListOf<MainViewData>()
        categories.forEach { category ->
            val filteredProducts = products.filter { it.categoryId == category.categoryId }
            if (filteredProducts.isNullOrEmpty().not()) {
                items.add(
                    MainViewData.Category(
                        categoryId = category.categoryId,
                        categoryName = category.categoryName
                    )
                )
                items.addAll(
                    filteredProducts.map { product ->
                        MainViewData.Product(
                            id = product.id,
                            name = product.name,
                            imageUrl = product.imageUrl,
                            count = product.count
                        )
                    }
                )
            }
        }
        return items
    }
}
