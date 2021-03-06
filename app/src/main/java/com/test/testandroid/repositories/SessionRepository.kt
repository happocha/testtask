package com.test.testandroid.repositories

import com.test.testandroid.database.UserDao
import com.test.testandroid.database.UserEntity
import com.test.testandroid.models.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import kotlin.random.Random

class SessionRepository @Inject constructor(
    private val userDao: UserDao
) {

    suspend fun isUserAuthorized(): Flow<Boolean> =
        flow {
            emit(userDao.getUsers())
        }.map { items ->
            items.firstOrNull()?.token != null
        }

    suspend fun getUsers(): Flow<List<User>> =
        flow {
            emit(userDao.getUsers())
        }.map { items ->
            items.map {
                User(
                    login = it.login,
                    password = it.password,
                    token = it.token
                )
            }
        }

    suspend fun insertUser(login: String, password: String): Flow<Unit> =
        flow {
            emit(
                userDao.insert(
                    UserEntity(
                        login = login,
                        password = password,
                        token = Random.nextInt()
                    )
                )
            )
        }

}
