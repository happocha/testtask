package com.test.testandroid.features.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.testandroid.R
import com.test.testandroid.features.main.adapter.MainRecyclerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: MainRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
