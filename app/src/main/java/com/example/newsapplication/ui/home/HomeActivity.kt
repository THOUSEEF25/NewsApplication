package com.example.newsapplication.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsapplication.R
import com.example.newsapplication.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    companion object {
    }

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}