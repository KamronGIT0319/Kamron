package com.example.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.auth.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: LoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LoginBinding.inflate(inflater, container, false)

        binding.btnLogin.setOnClickListener {
            // Handle login
        }

        binding.textView.setOnClickListener {
            (activity as MainActivity).openRegisterFragment()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
