package com.test.testandroid

import android.app.Application
import android.content.Context

class MyApplication: Application() {

    init {
        instance = this
    }

    companion object{
        private var instance: Application? = null
        fun applicationContext(): Context? = instance?.applicationContext
    }

    override fun onCreate() {
        super.onCreate()
    }
}