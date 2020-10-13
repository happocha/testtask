package com.test.testandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.test.testandroid.mainAct.MainActivity
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        authButton.setOnClickListener(authButtonOnClickListener)
    }

    private val authButtonOnClickListener = View.OnClickListener {
        val login = loginAuthEditText.text.toString()
        val password = passwordAuthEditText.text.toString()
        if (login.isNotEmpty() && password.isNotEmpty()){
            saveUser(login, password)
            intentToMainAct()
        }else{
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
        }
    }

    private fun saveUser(login: String, password: String){

    }

    private fun intentToMainAct(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}