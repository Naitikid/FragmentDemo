package com.example.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment.Fragment.FragmentOne
import com.example.fragment.Fragment.FragmentTwo
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onclick()
    }

    private fun onclick() {
        binding.apply {
            btnfragmentone.setOnClickListener {
                replacefragment(FragmentOne())
            }
            btnfragmenttwo.setOnClickListener {
                replacefragment(FragmentTwo())
            }
            btnfragmentNewActivity.setOnClickListener {
                val intent = Intent(this@MainActivity, FragmentClickActivity::class.java);
                startActivity(intent);
            }
        }

    }

    private fun replacefragment(fragment: Fragment) {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.frameLayout, fragment)
        ft.commit()
    }

}