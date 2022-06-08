package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CursorAdapter
import android.widget.ImageButton
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.atleticoplayers.databinding.FragmentF442Binding
import com.example.atleticoplayers.databinding.FragmentSubBinding
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_sub.*
import java.text.FieldPosition

class SubFragment : Fragment() {

    private var _binding: FragmentSubBinding? = null
    private val binding get() = _binding!!
    private lateinit var bindingx: FragmentF442Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSubBinding.inflate(inflater, container, false)

        val playerList = listOf(
            R.drawable.felix,
            R.drawable.griezmann,
            R.drawable.depaul,
            R.drawable.lodi,
            R.drawable.reinildo,
            R.drawable.gimenez,
            R.drawable.savic
        )


        val recyclerView = binding.subRecycler

        val adapter = SubRecyclerAdapter(playerList)

        recyclerView.adapter = adapter

        adapter.setOnCellClickListener(object : SubRecyclerAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                /*val fragment = F442Fragment()
                fragment.setFragmentResult("KEY", bundleOf(
                    "result_key1" to position
                ))*/
                parentFragmentManager.beginTransaction().replace(R.id.fom_fra, F442Fragment())
            }
        })


        //lst.setBackgroundResource(R.drawable.felix1)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sub_recycler.apply {
           layoutManager = GridLayoutManager(requireActivity(), 2)
        }

        binding.subRecycler.setOnClickListener {
            bindingx.lst.setBackgroundResource(R.drawable.depaul)
        }

    }
}