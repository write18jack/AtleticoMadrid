package com.example.atleticoplayers

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    private var layoutIManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val mainscreen = inflater.inflate(R.layout.fragment_main, container, false)

        //データ   string-array取得
        val titles: Array<String> = mainscreen.resources.getStringArray(R.array.title_list)

        //RecyclerViewの取得
        val recyclerView = mainscreen.findViewById<RecyclerView>(R.id.recycler_view)

        //val anime = resources.getAnimation(R.anim.animation1)

        val adapter = CustomAdapter(titles)

        //attach the array adapter with list view
        recyclerView.adapter = adapter

        //intent to each activity
        adapter.setOnCellClickListener(object : CustomAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                val intent:Intent
                when{
                     position == 0 ->{
                         intent = Intent(requireContext(), SquadActivity::class.java).putExtra("position", position)
                         startActivity(intent)
                     }
                }
            }
        })
        return mainscreen
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)

        }
    }
}