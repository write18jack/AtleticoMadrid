package com.example.atleticoplayers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.atleticoplayers.databinding.FragmentSubBinding

class SubRecyclerAdapter(val list: List<Int>):RecyclerView.Adapter<SubRecyclerAdapter.ViewHolderItem> (){


    private lateinit var xlistener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnCellClickListener(listener: onItemClickListener){
        this.xlistener = listener
    }

    class ViewHolderItem(ItemView: View, vv:onItemClickListener) :RecyclerView.ViewHolder(ItemView){
        //sub_layout.xml 1行だけのレイアウト
        val playerView:ImageButton = ItemView.findViewById(R.id.palayer)

        init {
            itemView.setOnClickListener{
                vv.onItemClick(absoluteAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.sub_layout, parent, false)

        return ViewHolderItem(itemXml, xlistener)
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.playerView.setImageResource(list[position])

    }



    override fun getItemCount() = list.size
}