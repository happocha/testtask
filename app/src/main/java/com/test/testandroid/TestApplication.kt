package com.test.testandroid

import android.app.Application

class TestApplication : Application() {
    companion object {
        private lateinit var instance: Application
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
    }
}