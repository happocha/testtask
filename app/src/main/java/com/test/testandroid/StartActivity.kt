package com.test.testandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.testandroid.mainAct.MainActivity

class StartActivity: AppCompatActivity() {

    /*
    Проверить авторизирован ли пользователь (посмотеть в Room есть ли запись о пользователе)
    В зависимости от этого отправить на экран авторизации либо сразу в MainActivity

    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    private fun checkUserAuth(){
    }

    private fun intentTo(act: Class<*>){
        val intent = Intent(this, act)
        startActivity(intent)
        this.finish()
    }
}