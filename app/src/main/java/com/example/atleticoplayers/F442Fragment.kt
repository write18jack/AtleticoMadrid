package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.atleticoplayers.databinding.FragmentF442Binding

class F442Fragment : Fragment(){

    private var _binding: FragmentF442Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentF442Binding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lst.setOnClickListener{onToSub()}
        binding.rst.setOnClickListener{onToSub()}
        binding.lm.setOnClickListener{onToSub()}
        binding.lcm.setOnClickListener{onToSub()}
        binding.rcm.setOnClickListener{onToSub()}
        binding.lm.setOnClickListener{onToSub()}
        binding.lfb.setOnClickListener{onToSub()}
        binding.lcb.setOnClickListener{onToSub()}
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