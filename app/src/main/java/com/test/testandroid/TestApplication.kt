package com.test.testandroid

import android.app.Application
import com.test.testandroid.di.AppComponent
import com.test.testandroid.di.DaggerAppComponent

class TestApplication : Application() {
    companion object {
        private lateinit var instance: Application
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
    }
}