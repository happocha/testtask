package com.test.testandroid.features.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

/**
 * Проверить авторизирован ли пользователь (посмотеть в Room есть ли запись о пользователе)
 * В зависимости от этого отправить на экран авторизации либо сразу в MainActivity
 */
class SplashActivity : AppCompatActivity() {

    private fun checkUserAuth() {
        TODO("not implemented")
    }

    private fun intentTo(act: Class<out AppCompatActivity>) {
        val intent = Intent(this, act)
        startActivity(intent)
        finish()
    }
}