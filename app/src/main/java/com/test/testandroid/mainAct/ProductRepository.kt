package com.test.testandroid.mainAct

import com.test.testandroid.mainAct.data.Product

object ProductRepository {

    suspend fun getProducts(token: String): ArrayList<Product>{
        val mainProductArray = ArrayList<Product>()
        mainProductArray.add(
            Product(
                "Бананы",
                "banan",
                123,
                1
            )
        )
        mainProductArray.add(
            Product(
                "Апельсины",
                "orange",
                124,
                1
            )
        )
        mainProductArray.add(
            Product(
                "Лимон",
                "limon",
                125,
                1
            )
        )
        mainProductArray.add(
            Product(
                "Вода",
                "water",
                126,
                2
            )
        )
        mainProductArray.add(
            Product(
                "Кола",
                "cola",
                127,
                2
            )
        )
        mainProductArray.add(
            Product(
                "Спрайт",
                "sprite",
                128,
                2
            )
        )
        mainProductArray.add(
            Product(
                "Фанта",
                "fanta",
                129,
                2
            )
        )
        mainProductArray.add(
            Product(
                "Рис",
                "rice",
                130,
                3
            )
        )
        return mainProductArray
    }
}