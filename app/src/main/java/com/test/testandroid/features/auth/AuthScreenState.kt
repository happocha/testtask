package com.test.testandroid.features.auth

sealed class AuthScreenState {

    object Success : AuthScreenState()
    class Error(val message: String?) : AuthScreenState()
}
