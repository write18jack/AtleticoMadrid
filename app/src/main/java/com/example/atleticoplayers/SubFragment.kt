package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.GridLayoutManager
import com.example.atleticoplayers.databinding.FragmentSubBinding
import com.example.atleticoplayers.formations.F442Fragment
import kotlinx.android.synthetic.main.fragment_sub.*

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
    }

    /*private fun onTOTap(view: Int){
        setFragmentResult("key", bundleOf("data" to view))
        parentFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fom_fra, F442Fragment())
            .commit()
    }*/

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}