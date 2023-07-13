package com.example.newsapplication.data.repository

interface RegistrationRepository {
    suspend fun login(userName: String, password: String)
    suspend fun signup(userName: String, password: String)
}

class DefaultRegistrationRepository: RegistrationRepository {
    override suspend fun login(userName: String, password: String) {

    }

    override suspend fun signup(userName: String, password: String) {

    }
}