package com.example.newsapplication.container

import com.example.newsapplication.data.repository.DefaultNewsArticleRepository
import com.example.newsapplication.data.repository.DefaultRegistrationRepository
import com.example.newsapplication.data.repository.NewsArticleRepository
import com.example.newsapplication.data.repository.RegistrationRepository

interface AppContainer {
    val newsArticleRepository: NewsArticleRepository
    val registrationRepository: RegistrationRepository
}

class DefaultAppContainer: AppContainer {
    override val newsArticleRepository: NewsArticleRepository by lazy {
        DefaultNewsArticleRepository()
    }
    override val registrationRepository: RegistrationRepository by lazy {
        DefaultRegistrationRepository()
    }
}