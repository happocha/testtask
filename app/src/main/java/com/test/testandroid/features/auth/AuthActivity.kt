package com.test.testandroid.features.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.test.testandroid.R
import com.test.testandroid.TestApplication
import com.test.testandroid.features.main.MainActivity
import kotlinx.android.synthetic.main.activity_auth.*
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {

    @Inject
    lateinit var authViewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as TestApplication).appComponent
            .authComponent()
            .create()
            .inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        authButton.setOnClickListener { loginClick() }
        initObservers()
    }

    private fun loginClick() {
        val login = loginAuthEditText.text.toString()
        val password = passwordAuthEditText.text.toString()
        if (login.isNotEmpty() && password.isNotEmpty()) {
            authViewModel.onAuthButtonClicked(login, password)
        } else {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
        }
    }

    private fun intentToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    private fun showToastMessage(message: String?) {
        message?.let {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }

    private fun initObservers() {
        authViewModel.screenState.observe(this, { state ->
            when (state) {
                is AuthScreenState.Success -> intentToMainActivity()
                is AuthScreenState.Error -> showToastMessage(state.message)
            }
        })
    }
}