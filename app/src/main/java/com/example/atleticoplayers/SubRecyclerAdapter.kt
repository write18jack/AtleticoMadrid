package com.example.atleticoplayers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView

class SubRecyclerAdapter:RecyclerView.Adapter<SubRecyclerAdapter.ViewHolderItem> (){

    class ViewHolderItem(itemView: View) :RecyclerView.ViewHolder(itemView){
        //sub_layout.xml 1行だけのレイアウト
        val itemImageButton:ImageButton = itemView.findViewById(R.id.palayer)
    }

    private val playerList = listOf(
        R.drawable.felix,
        R.drawable.griezmann,
        R.drawable.depaul,
        R.drawable.lodi,
        R.drawable.reinildo,
        R.drawable.gimenez,
        R.drawable.savic
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.sub_layout, parent, false)

        return ViewHolderItem(itemXml)
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.itemImageButton.setImageResource(playerList[position])
    }

    override fun getItemCount() = playerList.size
}