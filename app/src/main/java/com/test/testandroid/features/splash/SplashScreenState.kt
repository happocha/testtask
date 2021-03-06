package com.test.testandroid.features.splash

sealed class SplashScreenState {

    object Main: SplashScreenState()
    object Auth: SplashScreenState()
}
