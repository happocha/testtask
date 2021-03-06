package com.test.testandroid.repositories

import com.test.testandroid.models.Category
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CategoryRepository @Inject constructor() {

    suspend fun getCategories(token: String): Flow<List<Category>> =
        flow {
            delay(1000)
            emit(
                listOf(
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
            )
        }
}
