package com.test.testandroid.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey
    val token: Int,
    val password: String,
    val login: String
)
