package com.test.testandroid.features.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.testandroid.repositories.SessionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val sessionRepository: SessionRepository
) : ViewModel() {

    val screenState = MutableLiveData<SplashScreenState>()
    val showMessage = MutableLiveData<String>()

    init {
        checkAuth()
    }

    private fun checkAuth() {
        viewModelScope.launch(Dispatchers.IO) {
            sessionRepository.isUserAuthorized()
                .catch {
                    showMessage.postValue(it.message)
                    screenState.postValue(SplashScreenState.Auth)
                }
                .collect { isAuthorized ->
                    if (isAuthorized) {
                        screenState.postValue(SplashScreenState.Main)
                    } else {
                        screenState.postValue(SplashScreenState.Auth)
                    }
                }
        }
    }
}