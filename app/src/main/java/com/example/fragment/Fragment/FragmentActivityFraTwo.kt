package com.example.fragment.Fragment

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragment.MainActivity
import com.example.fragment.R
import com.example.fragment.databinding.FragmentActivityFraTwoBinding
import com.example.fragment.databinding.FragmentActivityFragoneBinding

class FragmentActivityFraTwo : Fragment() {
    private lateinit var binding: FragmentActivityFraTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentActivityFraTwoBinding.inflate(inflater, container, false)

        binding.btnNextFragmenttwo.setOnClickListener {
            replacefragment(FragmentActityFragThree())
        }
        binding.btnPreviousFragmenttwo.setOnClickListener {
          activity?.onBackPressed()
        }
        return binding.root
    }

    private fun replacefragment(fragment: Fragment) {
        val fm = fragmentManager?.beginTransaction()
        fm?.add(R.id.framentActivity, fragment,"Third Fragment")
        fm?.addToBackStack("three")
        fm?.commitAllowingStateLoss()
    }

}