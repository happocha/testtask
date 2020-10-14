package com.test.testandroid.mainAct

import com.test.testandroid.data.Category
import kotlinx.coroutines.delay

object CategoryRepository {

    suspend fun getCategories(token: String): ArrayList<Category>{
        delay(1000)
        val mainCategoryArray = ArrayList<Category>()
        mainCategoryArray.add(
            Category(
                1,
                "Фрукты"
            )
        )
        mainCategoryArray.add(
            Category(
                2,
                "Напитки"
            )
        )
        mainCategoryArray.add(
            Category(
                3,
                "Бакалея"
            )
        )

        return mainCategoryArray
    }
}