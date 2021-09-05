package com.kwang0.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kwang0.fragment.databinding.MainActivityBinding
import com.kwang0.fragment.ui.first.FirstFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstFragment.newInstance())
                .commitNow()
        }
    }
}