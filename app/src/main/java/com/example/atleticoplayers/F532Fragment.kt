package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

class F532Fragment : Fragment() {
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_f532, container, false)

        val lst = view.findViewById<ImageButton>(R.id.lst)
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

        val id_list = listOf<ImageButton>(lst, rst, lcm, rcm, cdm, lfb, lcb, cb, rcb, rfb, gk)


        view.setOnClickListener{
            for (i in id_list){
                if (view == i){
                    parentFragmentManager.beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.slide, SubFragment()).commit()
                }
            }
        }
        return view
    }
}