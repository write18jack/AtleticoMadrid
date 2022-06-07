package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.atleticoplayers.databinding.FragmentF532Binding
import com.example.atleticoplayers.databinding.FragmentSubBinding

class F532Fragment : Fragment() {

    private var _binding: FragmentF532Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       /* _binding = FragmentF532Binding.inflate(inflater, container, false)


        binding.lst.setOnClickListener{onTosub()}
        val rst = view.findViewById<ImageButton>(R.id.rst)
        val lcm = view.findViewById<ImageButton>(R.id.lcm)
        val rcm = view.findViewById<ImageButton>(R.id.rcm)
        val cdm = view.findViewById<ImageButton>(R.id.cdm)
        val lfb = view.findViewById<ImageButton>(R.id.lfb)
        val lcb = view.findViewById<ImageButton>(R.id.lcb)
        val cb = view.findViewById<ImageButton>(R.id.cb)
        val rcb = view.findViewById<ImageButton>(R.id.rcb)
        val rfb = view.findViewById<ImageButton>(R.id.rfb)
        val gk = view.findViewById<ImageButton>(R.id.gk)

        //val id_list = listOf<ImageButton>(lst, rst, lcm, rcm, cdm, lfb, lcb, cb, rcb, rfb, gk)

        fun onTosub(){
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }*/
        return binding.root
    }
}