package com.test.testandroid.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class], version = 1)
abstract class TestDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
