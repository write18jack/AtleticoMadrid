package com.example.atleticoplayers

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_sub.*
import java.text.FieldPosition

class SubFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vscreen = inflater.inflate(R.layout.fragment_sub, container, false)

        val recyclerView = vscreen.findViewById<RecyclerView>(R.id.sub_recycler)

        val adapter = SubRecyclerAdapter()

        recyclerView.adapter = adapter

        //lst.setBackgroundResource(R.drawable.felix1)

        return vscreen
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sub_recycler.apply {
           layoutManager = GridLayoutManager(requireActivity(), 2)
        }
    }
}