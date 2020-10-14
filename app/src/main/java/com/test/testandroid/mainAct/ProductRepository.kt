package com.test.testandroid.mainAct

import com.test.testandroid.data.Product
import kotlinx.coroutines.delay

object ProductRepository {

    suspend fun getProducts(token: String): ArrayList<Product>{
        delay(1200)
        val mainProductArray = ArrayList<Product>()
        mainProductArray.add(
            Product(
                "Бананы сушеные",
                "/12/18/59",
                123,
                1
            )
        )
        mainProductArray.add(
            Product(
                "Апельсины",
                "/11/73/82",
                124,
                1
            )
        )
        mainProductArray.add(
            Product(
                "Лимон",
                "/10/91/14",
                125,
                1
            )
        )
        mainProductArray.add(
            Product(
                "Вода",
                "/11/70/69",
                126,
                2
            )
        )
        mainProductArray.add(
            Product(
                "Кола",
                "/10/00/86",
                127,
                2
            )
        )
        mainProductArray.add(
            Product(
                "Спрайт",
                "/11/75/30",
                128,
                2
            )
        )
        mainProductArray.add(
            Product(
                "Фанта",
                "/11/47/34",
                129,
                2
            )
        )
        mainProductArray.add(
            Product(
                "Рис",
                "/10/29/51",
                130,
                3
            )
        )
        return mainProductArray
    }
}