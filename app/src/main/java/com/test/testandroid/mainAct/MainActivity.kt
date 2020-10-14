package com.test.testandroid.mainAct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.testandroid.data.Category
import com.test.testandroid.data.Product
import com.test.testandroid.R
import com.test.testandroid.mainAct.adapter.MainRecyclerAdapter

    /*
    Создать простую архитектуру MVVM использую ViewModel, Livedata, Coroutines
    Обратиться в CategoryRep и ProductRep для получения данных и вывести их на экран, используя MainRecyclerAdapter( ProductViewHolder, CategoryViewHolder)
    Данные в адаптере должны выглядеть так:
        -Category1
            -productOfCategory1
            -productOfCategory1
        -Catefory2
            -productOfCategory2
    В ProductViewHolder есть кнопки при нажатии на которые происходит следующее:
        - addToBasketButton (она становится invisible, а minusButton и plusButton становятся видимыми и кол-во становится 1)
        - minusButton (кнопка регулировки кол-ва продукта, если количество 0 - она становится invisible и plusButton становится invisible)
        - plusButton (кнопка регулировки кол-ва продукта, при нажатии кол-во увеличивается на 1)
    p.s Кол-во выводится в productCountTextView (если количество 0 invisible иначе visible)

    */

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainRecyclerAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

}
