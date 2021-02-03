package com.test.testandroid.features.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

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