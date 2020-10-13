package com.test.testandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.testandroid.mainAct.MainActivity

class StartActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (checkUserAuth()){
            intentTo(AuthActivity::class.java)
        }else{
            intentTo(MainActivity::class.java)
        }
    }

    //Проверить авторизирован ли пользователь
    //посмотеть в Room если запись о пользователе
    private fun checkUserAuth(): Boolean{
        return false
    }


    private fun intentTo(act: Class<*>){
        val intent = Intent(this, act)
        startActivity(intent)
        this.finish()
    }
}