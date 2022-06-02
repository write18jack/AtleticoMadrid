package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*

class SubFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_sub, container, false)

        val playerList = listOf<Players>(
            Players(R.drawable.gimenez),
            Players(R.drawable.felix1),
            Players(R.drawable.savic),
            Players(R.drawable.griezmann),
            Players(R.drawable.depaul)
        )

        recycler_view.adapter =


        //lst.setBackgroundResource(R.drawable.felix1)

        return view
    }
}