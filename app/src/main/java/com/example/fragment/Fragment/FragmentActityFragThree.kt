package com.example.fragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.R
import com.example.fragment.databinding.ActivityFragmentClickBinding.inflate
import com.example.fragment.databinding.FragmentActityFragThreeBinding
import com.example.fragment.databinding.FragmentOneBinding
import com.example.fragment.databinding.FragmentOneBinding.inflate

class FragmentActityFragThree : Fragment() {
    private lateinit var binding: FragmentActityFragThreeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentActityFragThreeBinding.inflate(inflater, container, false)
        binding.btnNextFragmentthird.setOnClickListener{
            activity?.onBackPressed()
        }
        return binding.root
    }
}

