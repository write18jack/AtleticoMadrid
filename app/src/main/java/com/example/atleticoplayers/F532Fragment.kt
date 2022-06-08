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
       /* _binding = FragmentF532Binding.inflate(inflater, container, false)




        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lst.setOnClickListener{onTosub(lst)}
        binding.rst.setOnClickListener{onTosub(rst)}
        binding.lcm.setOnClickListener{onTosub(lcm)}
        binding.rcm.setOnClickListener{onTosub(rcm)}
        binding.cdm.setOnClickListener{onTosub(cdm)}
        binding.lfb.setOnClickListener{onTosub(lfb)}
        binding.lcb.setOnClickListener{onTosub(lcb)}
        binding.cb.setOnClickListener{onTosub(cb)}
        binding.rcb.setOnClickListener{onTosub(rcb)}
        binding.rfb.setOnClickListener{onTosub(rfb)}
        binding.gk.setOnClickListener{onTosub(gk)}

    }

    private fun onTosub(view: ImageButton) {
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