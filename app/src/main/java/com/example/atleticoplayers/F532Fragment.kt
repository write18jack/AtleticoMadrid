package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class F532Fragment : Fragment() {

    private lateinit var xlistener: CustomAdapter.onItemClickListener

    interface onItemClickListener{
        fun onItemClick(view: View)
    }

    fun setOnButtonClickListener(listener: onItemClickListener){
        this.xlistener = listener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_f532, container, false)

        view.setOnClickListener{

        }
        return view
    }
}