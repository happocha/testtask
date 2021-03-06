package com.test.testandroid.di

import android.content.Context
import androidx.room.Room
import com.test.testandroid.database.TestDatabase
import com.test.testandroid.database.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDataBase(context: Context): TestDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            TestDatabase::class.java,
            "Test.db"
        ).build()
    }

    @Provides
    fun provideUserDao(database: TestDatabase): UserDao = database.userDao()
}
