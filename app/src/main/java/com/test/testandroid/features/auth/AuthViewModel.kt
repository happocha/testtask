package com.test.testandroid.features.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.testandroid.repositories.SessionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthViewModel @Inject constructor(
    private val sessionRepository: SessionRepository
) : ViewModel() {

    val screenState = MutableLiveData<AuthScreenState>()

    fun onAuthButtonClicked(login: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            sessionRepository.insertUser(login, password)
                .catch { screenState.postValue(AuthScreenState.Error(it.message)) }
                .collect { screenState.postValue(AuthScreenState.Success) }
        }
    }
}
