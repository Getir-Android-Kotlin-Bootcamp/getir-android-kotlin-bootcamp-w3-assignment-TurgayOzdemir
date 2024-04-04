package com.turgayozdemir.w3assignment

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.Navigation
import com.turgayozdemir.w3assignment.databinding.ActivityAccountBinding
import com.turgayozdemir.w3assignment.databinding.ActivityMainBinding

class AccountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navController = binding.fragmentContainerView2

        binding.loginTab.visibility = View.INVISIBLE

        binding.createAccountText.setOnClickListener {
           binding.createAccountText.setTextColor(Color.parseColor("#D61355"))
            binding.createAccountTab.visibility = View.VISIBLE
            binding.loginText.setTextColor(Color.parseColor("#000000"))
            binding.loginTab.visibility = View.INVISIBLE
            try {
                val action = LoginFragmentDirections.actionLoginFragmentToCreateAccountFragment()
                Navigation.findNavController(navController).navigate(action)
            } catch (e : Exception){
                e.printStackTrace()
            }
        }

        binding.loginText.setOnClickListener{
            binding.createAccountText.setTextColor(Color.parseColor("#000000"))
            binding.createAccountTab.visibility = View.INVISIBLE
            binding.loginText.setTextColor(Color.parseColor("#D61355"))
            binding.loginTab.visibility = View.VISIBLE
            try {
                val action = CreateAccountFragmentDirections.actionCreateAccountFragmentToLoginFragment()
                Navigation.findNavController(navController).navigate(action)
            } catch (e : Exception){
                e.printStackTrace()
            }
        }
    }
}