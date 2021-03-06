package com.test.testandroid.features.main

sealed class MainScreenState {

    class Data(val items: List<MainViewData>) : MainScreenState()
    class Error(val message: String?) : MainScreenState()
}
