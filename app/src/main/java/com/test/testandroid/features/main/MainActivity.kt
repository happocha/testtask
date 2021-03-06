package com.test.testandroid.features.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.testandroid.R
import com.test.testandroid.TestApplication
import com.test.testandroid.features.main.adapter.MainRecyclerAdapter
import com.test.testandroid.features.main.adapter.MainRecyclerAdapterCallbacks
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainRecyclerAdapterCallbacks {

    @Inject
    lateinit var viewModel: MainViewModel

    private val mainRecyclerAdapter = MainRecyclerAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as TestApplication).appComponent
            .mainComponent()
            .create()
            .inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.mainRecyclerView)
        recyclerView.apply {
            adapter = mainRecyclerAdapter
            layoutManager = LinearLayoutManager(recyclerView.context)
        }
        initObservers()
    }

    override fun onMinusClicked(id: Int) {
        viewModel.onMinusClicked(id)
    }

    override fun onPlusClicked(id: Int) {
        viewModel.onPlusClicked(id)
    }

    override fun onAddClicked(id: Int) {
        viewModel.onAddClicked(id)
    }

    private fun initObservers() {
        viewModel.screenState.observe(this, { state ->
            when (state) {
                is MainScreenState.Error -> showToastMessage(state.message)
                is MainScreenState.Data -> mainRecyclerAdapter.submitList(state.items)
            }
        })
    }

    private fun showToastMessage(message: String?) {
        message?.let {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }
}
