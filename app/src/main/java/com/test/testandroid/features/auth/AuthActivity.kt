package com.test.testandroid.features.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.test.testandroid.R
import com.test.testandroid.features.main.MainActivity
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        authButton.setOnClickListener { loginClick() }
    }

    private fun loginClick() {
        val login = loginAuthEditText.text.toString()
        val password = passwordAuthEditText.text.toString()
        if (login.isNotEmpty() && password.isNotEmpty()) {
            TODO("not implemented")
        } else {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
        }
    }

    private fun intentToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}