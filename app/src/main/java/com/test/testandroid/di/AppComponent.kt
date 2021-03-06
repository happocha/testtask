package com.test.testandroid.di

import android.content.Context
import com.test.testandroid.features.auth.di.AuthComponent
import com.test.testandroid.features.main.di.MainComponent
import com.test.testandroid.features.splash.SplashActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class, AppSubcomponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: SplashActivity)

    fun authComponent(): AuthComponent.Factory
    fun mainComponent(): MainComponent.Factory

}
