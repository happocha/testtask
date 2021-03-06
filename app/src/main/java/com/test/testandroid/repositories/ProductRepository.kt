package com.test.testandroid.repositories

import com.test.testandroid.models.Product
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ProductRepository @Inject constructor() {

    suspend fun getProducts(token: String): Flow<List<Product>> =
        flow {
            delay(1200)
            emit(
                listOf(
                    Product(
                        123,
                        "Бананы сушеные",
                        "/12/18/59",
                        1
                    ),
                    Product(
                        124,
                        "Апельсины",
                        "/11/73/82",
                        1
                    ),
                    Product(
                        125,
                        "Лимон",
                        "/10/91/14",
                        1
                    ),
                    Product(
                        126,
                        "Вода",
                        "/11/70/69",
                        2
                    ),
                    Product(
                        127,
                        "Кола",
                        "/10/00/86",
                        2
                    ),
                    Product(
                        128,
                        "Спрайт",
                        "/11/75/30",
                        2
                    ),
                    Product(
                        129,
                        "Фанта",
                        "/11/47/34",
                        2
                    ),
                    Product(
                        130,
                        "Рис",
                        "/10/29/51",
                        3
                    )
                )
            )
        }
}
