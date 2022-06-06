package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.setFragmentResult
import kotlinx.android.synthetic.main.fragment_f442.*
import kotlinx.android.synthetic.main.fragment_f442.view.*

class F442Fragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_f442, container, false)

        val lst = view.findViewById<ImageButton>(R.id.lst)
        lst.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val rst = view.findViewById<ImageButton>(R.id.rst)
        rst.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val lm = view.findViewById<ImageButton>(R.id.lm)
        lm.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val lcm = view.findViewById<ImageButton>(R.id.lcm)
        lcm.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val rcm = view.findViewById<ImageButton>(R.id.rcm)
        rcm.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val rm = view.findViewById<ImageButton>(R.id.rm)
        rm.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val lfb = view.findViewById<ImageButton>(R.id.lfb)
        lfb.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val lcb = view.findViewById<ImageButton>(R.id.lcb)
        lcb.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val rcb = view.findViewById<ImageButton>(R.id.rcb)
        rcb.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val rfb = view.findViewById<ImageButton>(R.id.rfb)
        rfb.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }

        val gk = view.findViewById<ImageButton>(R.id.gk)
        gk.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.slide, SubFragment()).commit()
        }
        return view
    }
}