package com.kwang0.fragment.ui.first

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kwang0.fragment.databinding.FirstAFragmentBinding

class FirstAFragment : Fragment() {
    private var _binding: FirstAFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FirstAFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        Log.e("FirstA", "onDestroyView")
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = FirstAFragment()
    }
}
