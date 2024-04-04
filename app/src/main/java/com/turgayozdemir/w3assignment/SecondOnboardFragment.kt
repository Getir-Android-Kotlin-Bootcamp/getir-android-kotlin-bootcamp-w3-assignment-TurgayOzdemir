package com.turgayozdemir.w3assignment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.turgayozdemir.w3assignment.databinding.FragmentFirstOnboardBinding
import com.turgayozdemir.w3assignment.databinding.FragmentSecondOnboardBinding

class SecondOnboardFragment : Fragment() {

    private var _binding: FragmentSecondOnboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondOnboardBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.nextButton.setOnClickListener{
            val intent = Intent(activity, AccountActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }

}