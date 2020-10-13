package com.test.testandroid.mainAct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.testandroid.mainAct.data.Category
import com.test.testandroid.mainAct.data.Product
import com.test.testandroid.R
import com.test.testandroid.mainAct.adapter.MainRecyclerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var productArray: ArrayList<Product>
    private lateinit var categoryArray: ArrayList<Category>

    private lateinit var adapter: MainRecyclerAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

}
