package com.test.testandroid.mainAct

import com.test.testandroid.mainAct.data.Category

object CategoryRepository {

    suspend fun getCategories(token: String): ArrayList<Category>{
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