package com.example.newsapplication.data.repository

interface NewsArticleRepository {
    suspend fun fetchNews()
    suspend fun saveNews()
}

class DefaultNewsArticleRepository(): NewsArticleRepository {
    override suspend fun fetchNews() {

    }

    override suspend fun saveNews() {

    }
}