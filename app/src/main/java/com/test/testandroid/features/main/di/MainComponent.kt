package com.test.testandroid.features.main.di

import com.test.testandroid.di.ActivityScope
import com.test.testandroid.features.main.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
}
