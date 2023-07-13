package com.example.newsapplication.ui.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsapplication.R
import com.example.newsapplication.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}