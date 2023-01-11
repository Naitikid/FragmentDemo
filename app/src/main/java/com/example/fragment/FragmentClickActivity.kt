package com.example.fragment

import android.app.PendingIntent.getActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragment.Fragment.FragmentActivityFragone
import com.example.fragment.databinding.ActivityFragmentClickBinding

class FragmentClickActivity : AppCompatActivity() {
    var doubleBackToExitPressedOnce = false

    private lateinit var binding: ActivityFragmentClickBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentClickBinding.inflate(layoutInflater)
        setContentView(binding.root)
        click()
    }

    private fun click() {
        replacefragment(FragmentActivityFragone())
    }

    private fun replacefragment(fragment: Fragment) {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.framentActivity, fragment,"First")
        ft.commitAllowingStateLoss()
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
        }
        if (supportFragmentManager.backStackEntryCount != 0) {

          val title = supportFragmentManager.fragments[supportFragmentManager.backStackEntryCount - 1].tag
          /*  val title = "check"*/
            Log.d("title-->", "$title")
            if (title!=null)
            {
             supportActionBar?.title = title
            }
        } else {
            doubleBackToExitPressedOnce = true
        }
        super.onBackPressed()
    }

}
