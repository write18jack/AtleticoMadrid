package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.atleticoplayers.databinding.FragmentF532Binding
import kotlinx.android.synthetic.main.fragment_f532.*

class F532Fragment : Fragment() {

    private var _binding: FragmentF532Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         _binding = FragmentF532Binding.inflate(inflater, container, false)




        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lst.setOnClickListener{onToSub(lst)}
        binding.rst.setOnClickListener{onToSub(rst)}
        binding.lcm.setOnClickListener{onToSub(lcm)}
        binding.rcm.setOnClickListener{onToSub(rcm)}
        binding.cdm.setOnClickListener{onToSub(cdm)}
        binding.lfb.setOnClickListener{onToSub(lfb)}
        binding.lcb.setOnClickListener{onToSub(lcb)}
        binding.cb.setOnClickListener{onToSub(cb)}
        binding.rcb.setOnClickListener{onToSub(rcb)}
        binding.rfb.setOnClickListener{onToSub(rfb)}
        binding.gk.setOnClickListener{onToSub(gk)}

    }

    private fun onToSub(view: ImageButton) {
        val id:Int = view.id
        val bundle = Bundle()
        bundle.putInt("KEY",id)
        val fragment = SubFragment()
        fragment.arguments = bundle

        parentFragmentManager.beginTransaction()
            .addToBackStack(null)
            .add(R.id.slide, fragment)
            .commit()
    }


    override fun onDestroyView(){

        super.onDestroyView()
        _binding = null
    }
}