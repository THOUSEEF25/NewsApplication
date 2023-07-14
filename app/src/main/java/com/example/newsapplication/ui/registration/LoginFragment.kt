package com.example.newsapplication.ui.registration

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.newsapplication.R
import com.example.newsapplication.databinding.FragmentLoginBinding
import com.example.newsapplication.ui.home.HomeActivity
import kotlin.math.log

class LoginFragment : Fragment() {
    companion object {
        private const val TAG = "LoginFragment"
    }

    private lateinit var binding: FragmentLoginBinding

    private val loginCredentials = listOf<Pair<String, String>>(
        Pair("sheikh@gmail.com", "sheikh!!"),
        Pair("thouseef@gmail.com", "thouseef!!")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onLoginClick()
        onSignupClick()
    }

    private fun onLoginClick() {
        binding.loginButton.setOnClickListener {
            if (getEmailAndPassword()) {
                HomeActivity.startActivity(requireActivity())
            } else {
                Toast.makeText(requireContext(), "Invalid Credentials", Toast.LENGTH_LONG).show()
            }
        }
    }

    //helper method
    private fun getEmailAndPassword(): Boolean {
        val email = binding.emailEt.text.toString()
        val password = binding.passwordEt.text.toString()

        return if (email == loginCredentials[0].first && password == loginCredentials[0].second) {
            true
        } else email == loginCredentials[1].first && password == loginCredentials[1].second
    }

    private fun onSignupClick() {
        binding.signupTv.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }
    }
}