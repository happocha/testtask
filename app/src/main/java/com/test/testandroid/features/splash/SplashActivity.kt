package com.test.testandroid.features.splash

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.test.testandroid.TestApplication
import com.test.testandroid.features.auth.AuthActivity
import com.test.testandroid.features.main.MainActivity
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as TestApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        initObservers()
    }

    private fun intentTo(act: Class<out AppCompatActivity>) {
        val intent = Intent(this, act)
        startActivity(intent)
        finish()
    }

    private fun initObservers() {
        splashViewModel.screenState.observe(this, { state ->
            when (state) {
                is SplashScreenState.Auth -> intentTo(AuthActivity::class.java)
                is SplashScreenState.Main -> intentTo(MainActivity::class.java)
            }
        })

        splashViewModel.showMessage.observe(this, { message ->
            message?.let {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
