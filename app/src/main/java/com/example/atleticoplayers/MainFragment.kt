package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.atleticoplayers.databinding.FragmentMainBinding
import com.example.atleticoplayers.databinding.FragmentSubBinding
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        //データ   string-array取得
        val titles: Array<String> = resources.getStringArray(R.array.title_list)

        //val anime = resources.getAnimation(R.anim.animation1)
        val rere = binding.recycler

        val adapter = CustomAdapter(titles)

        rere.adapter = adapter

        adapter.setOnCellClickListener(object : CustomAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                when(position){
                    0 -> {
                        findNavController().navigate(R.id.action_mainFragment_to_squadFragment)
                    }

                }
            }
        })

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler.apply {
            layoutManager = LinearLayoutManager(requireActivity())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}