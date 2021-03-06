package com.test.testandroid.di

import com.test.testandroid.features.auth.di.AuthComponent
import dagger.Module

@Module(subcomponents = [AuthComponent::class])
class AppSubcomponents
