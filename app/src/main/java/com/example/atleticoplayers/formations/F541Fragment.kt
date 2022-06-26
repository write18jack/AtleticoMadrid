package com.example.atleticoplayers.formations

import androidx.fragment.app.Fragment
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.atleticoplayers.R
import com.example.atleticoplayers.SubFragment
import com.example.atleticoplayers.databinding.FragmentF541Binding

class F541Fragment : Fragment() {

    private var _binding: FragmentF541Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentF541Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.st.setOnClickListener{onToSub()}
        binding.lm.setOnClickListener{onToSub()}
        binding.lcm.setOnClickListener{onToSub()}
        binding.rcm.setOnClickListener{onToSub()}
        binding.rm.setOnClickListener{onToSub()}
        binding.lfb.setOnClickListener{onToSub()}
        binding.lcb.setOnClickListener{onToSub()}
        binding.cb.setOnClickListener{onToSub()}
        binding.rcb.setOnClickListener{onToSub()}
        binding.rfb.setOnClickListener{onToSub()}
        binding.gk.setOnClickListener{onToSub()}
    }

    private fun onToSub(){
        parentFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.slide, SubFragment())
            .commit()
    }

    override fun onDestroyView(){

        super.onDestroyView()
        _binding = null
    }
}