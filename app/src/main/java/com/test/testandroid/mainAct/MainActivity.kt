package com.test.testandroid.mainAct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.testandroid.mainAct.data.Category
import com.test.testandroid.mainAct.data.Product
import com.test.testandroid.R

class MainActivity : AppCompatActivity() {

    private lateinit var productArray: ArrayList<Product>
    private lateinit var categoryArray: ArrayList<Category>

    private lateinit var adapter: MainRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
