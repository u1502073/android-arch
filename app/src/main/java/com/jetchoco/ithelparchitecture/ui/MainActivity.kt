package com.jetchoco.ithelparchitecture.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jetchoco.ithelparchitecture.R
import com.jetchoco.ithelparchitecture.di.Injectable

class MainActivity : AppCompatActivity(), Injectable {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tag = RepoFragment.TAG
        if (supportFragmentManager.findFragmentByTag(tag) == null) {
            val fragment: RepoFragment = RepoFragment.newInstance()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, fragment, tag)
                .commit()
        }
    }
}
