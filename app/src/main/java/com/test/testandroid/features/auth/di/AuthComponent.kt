package com.test.testandroid.features.auth.di

import com.test.testandroid.di.ActivityScope
import com.test.testandroid.features.auth.AuthActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface AuthComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): AuthComponent
    }

    fun inject(activity: AuthActivity)
}
