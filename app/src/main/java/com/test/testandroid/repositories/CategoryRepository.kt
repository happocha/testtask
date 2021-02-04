package com.test.testandroid.repositories

import com.test.testandroid.models.Category
import kotlinx.coroutines.delay

class CategoryRepository {
    suspend fun getCategories(token: String): List<Category> {
        delay(1000)

        return listOf(
            Category(
                1,
                "Фрукты"
            ),
            Category(
                2,
                "Напитки"
            ),
            Category(
                3,
                "Бакалея"
            )
        )
    }
}