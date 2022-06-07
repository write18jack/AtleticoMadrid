package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.setFragmentResultListener
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.atleticoplayers.databinding.FragmentSubBinding
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_sub.*
import java.text.FieldPosition

class SubFragment : Fragment() {

    private var _binding: FragmentSubBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSubBinding.inflate(inflater, container, false)

        val recyclerView = binding.subRecycler

        val adapter = SubRecyclerAdapter()

        recyclerView.adapter = adapter

        //lst.setBackgroundResource(R.drawable.felix1)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sub_recycler.apply {
           layoutManager = GridLayoutManager(requireActivity(), 2)
        }

        val args = arguments?.getInt("KEY")



    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}