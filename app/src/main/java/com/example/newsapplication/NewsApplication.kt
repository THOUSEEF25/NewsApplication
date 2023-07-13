package com.example.newsapplication

import android.app.Application
import com.example.newsapplication.container.AppContainer
import com.example.newsapplication.container.DefaultAppContainer

class NewsApplication: Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}